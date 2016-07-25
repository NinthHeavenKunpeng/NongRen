package com.example.nr.nongren.MyView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;

public class LineView extends TextView {

	private Paint paint = null;

	private int lineMode = 1;

	private int lineColor = 0xff000000;

	private int lineWidth = 1;

	public int getLineMode() {
		return lineMode;
	}

	public void setLineMode(int lineMode) {
		this.lineMode = lineMode;

		invalidate();
	}

	public int getLineColor() {
		return lineColor;
	}

	public void setLineColor(int lineColor) {
		this.lineColor = lineColor;
		paint.setColor(lineColor);
		invalidate();
	}

	public int getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
		paint.setStrokeWidth(lineWidth);
		invalidate();
	}

	private void init() {
		paint = new Paint();
		paint.setColor(lineColor);
		paint.setStrokeWidth(lineWidth);
		paint.setAntiAlias(true);
	}

	public LineView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		init();

	}

	public LineView(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
		// TODO Auto-generated constructor stub
	}

	public LineView(Context context) {
		this(context, null);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub


		canvas.drawText(getText() + "", 0,
				getPaint().getFontMetrics().bottom * 3, getPaint());

		switch (lineMode) {
		case 0:

			break;
		case 1:

			canvas.drawLine(0, getHeight() - lineWidth, getWidth(), getHeight()
					- lineWidth, paint);

			break;

		case 2:

			canvas.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2,
					paint);

			break;

		case 3:

			canvas.drawLine(0, getHeight() / 3, getWidth(), getHeight() / 3,
					paint);
			canvas.drawLine(0, getHeight() / 3 * 2, getWidth(),
					getHeight() / 3 * 2, paint);
			break;

		case 4:
			canvas.drawLine(0, 0, getWidth(),
					getHeight(), paint);
			break;

		default:
			break;
		}
	}


	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		TextPaint textPaint = getPaint();
		float height = textPaint.getFontMetrics().bottom * 3;
		float width = textPaint.measureText(getText() + "");
		setMeasuredDimension((int) width, (int) height);
	}

}
