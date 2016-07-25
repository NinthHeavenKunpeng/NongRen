package com.example.nr.nongren.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.nr.nongren.Activity.ClassifyActivity;
import com.example.nr.nongren.R;

/**
 * Created by hjw on 2016/7/17.
 */
public class ClassifyFrag extends Fragment {
    private View view;

    //米面粮油
    private Button rice_btn_all;
    private Button rice_btn_bean;
    private Button rice_btn_huasheng;
    private Button rice_btn_mianfen;
    private Button rice_btn_nuomi;
    private Button rice_btn_oil;
    private Button rice_btn_rice;
    private Button rice_btn_xiaomi;
    private Button rice_btn_yanmaifen;
    private Button rice_btn_yimi;
    private Button rice_btn_yumi;
    private Button rice_btn_heizhima;
    private Button ganhuo_btn_all;
    private Button ganhuo_btn_danzhiping;
    private Button ganhuo_btn_jungu;
    private Button ganhuo_btn_tiaoweiping;
    private Button ganhuo_btn_lianzi;
    private Button ganhuo_btn_fentiao;
    private Button ganhuo_btn_baihegan;
    private Button ganhuo_btn_haidai;
    private Button ganhuo_btn_gancai;
    private Button ganhuo_btn_xiagan;
    private Button ganhuo_btn_miantiao;
    private Button ganhuo_btn_yugan;
    private Button ganhuo_btn_mixian;
    private Button ganhuo_btn_fuzhu;
    private Button ganhuo_btn_huanghuacai;
    private Button ganguo_btn_all;
    private Button ganguo_btn_banli;
    private Button ganguo_btn_hetao;
    private Button ganguo_btn_putaogan;
    private Button ganguo_btn_xingren;
    private Button ganguo_btn_songzi;
    private Button ganguo_btn_lizhigan;
    private Button ganguo_btn_hamiguagan;
    private Button ganguo_btn_mihuotaogan;
    private Button ganguo_btn_wuhuaguogan;
    private Button ganguo_btn_zhenzi;
    private Button ganguo_btn_lanmeigan;
    private Button ganguo_btn_hongzao;
    //生鲜水果
    private Button fruit_btn_all;
    private Button fruit_btn_meat;
    private Button fruit_btn_apple;
    private Button fruit_btn_chengzi;
    private Button fruit_btn_youzi;
    private Button fruit_btn_li;
    private Button fruit_btn_baixiangguo;
    private Button fruit_btn_shizi;
    private Button fruit_btn_mihoutao;
    private Button fruit_btn_ningmeng;
    private Button fruit_btn_shiliu;
    private Button fruit_btn_orange;
    private Button fruit_btn_shajiguo;
    private Button fruit_btn_niuyouguo;
    private Button fruit_btn_fanshiliu;
    private Button fruit_btn_yangtao;
    private Button fruit_btn_caomei;
    private Button fruit_btn_mangguo;
    private Button fruit_btn_yingtao;
    private Button fruit_btn_taozi;
    private Button fruit_btn_lizi;
    private Button fruit_btn_tiangua;
    private Button fruit_btn_lizhi;
    private Button fruit_btn_xing;
    private Button fruit_btn_shuichanpin;
    private Button fruit_btn_putao;
    private Button fruit_btn_shucai;
    private Button tea_btn_all;
    private Button tea_btn_fengmi;
    private Button tea_btn_hongcha;
    private Button tea_btn_ningmengpian;
    private Button tea_btn_juhua;
    private Button tea_btn_meiguihuacha;
    private Button tea_btn_gouqi_yacha;
    private Button tea_btn_pipahua;
    private Button tea_btn_jinyinghua;
    private Button tea_btn_guihucha;
    private Button tea_btn_heyecha;
    private Button tea_btn_sanqihua;
    private Button tea_btn_luohanguo;
    private Button nurtion_btn_all;
    private Button nurtion_btn_tianma;
    private Button nurtion_btn_sanqi;
    private Button nurtion_btn_huangjing;
    private Button nurtion_btn_zaojiaofen;
    private Button nurtion_btn_danshen;
    private Button nurtion_btn_taojiao;
    private Button nurtion_btn_juema;
    private Button nurtion_btn_renshen;
    private Button nurtion_btn_dihuang;
    private Button nurtion_btn_yuzhu;
    private Button nurtion_btn_qita;
    private Button nurtion_btn_shanyao;
    private Button nurtion_btn_oufen;
    private Button nurtion_btn_gouqi;
    private Button nurtion_btn_guiyuangan;
    private Button nurtion_btn_gegenfen;
    private Button nurtion_btn_ajiaogao;
    private Button nurtion_btn_lingzhi;
    private Button nurtion_btn_zhusun;
    private Button rest_btn_all;
    private Button rest_btn_hongshugan;
    private Button rest_btn_niulougan;
    private Button rest_btn_frultguantou;
    private Button rest_btn_shibing;
    private Button rest_btn_shanzha;
    private Button rest_btn_suanzaogao;
    private Button rest_btn_heizhi_mahu;
    private Button rest_btn_zaojia_hetao;
    private Button rest_btn_hongtang_mahua;
    private Button rest_btn_doufugan;
    private Button rest_btn_mianbao;
    private Button rest_btn_qiongguotang;
    private Button rest_btn_tese_taocan;
    private Button rest_btn_labaicai;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.classify_frag, container, false);
        initView();
        return view;
    }

    private void initView() {

        //米面粮油12
        rice_btn_all = ((Button) view.findViewById(R.id.rice_btn_all));
        rice_btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 1);
                startActivity(intent);
            }
        });
        rice_btn_bean = ((Button) view.findViewById(R.id.rice_btn_bean));
        rice_btn_bean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 2);
                startActivity(intent);
            }
        });
        rice_btn_huasheng = ((Button) view.findViewById(R.id.rice_btn_huasheng));
        rice_btn_huasheng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 7);
                startActivity(intent);
            }
        });
        rice_btn_mianfen = ((Button) view.findViewById(R.id.rice_btn_mianfen));
        rice_btn_mianfen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 10);
                startActivity(intent);
            }
        });
        rice_btn_nuomi = ((Button) view.findViewById(R.id.rice_btn_nuomi));
        rice_btn_nuomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 8);
                startActivity(intent);
            }
        });
        rice_btn_oil = ((Button) view.findViewById(R.id.rice_btn_oil));
        rice_btn_oil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 4);
                startActivity(intent);
            }
        });
        rice_btn_rice = ((Button) view.findViewById(R.id.rice_btn_rice));
        rice_btn_rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 3);
                startActivity(intent);
            }
        });
        rice_btn_xiaomi = ((Button) view.findViewById(R.id.rice_btn_xiaomi));
        rice_btn_xiaomi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 5);
                startActivity(intent);
            }
        });
        rice_btn_yanmaifen = ((Button) view.findViewById(R.id.rice_btn_yanmaifen));
        rice_btn_yanmaifen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 11);
                startActivity(intent);
            }
        });
        rice_btn_yimi = ((Button) view.findViewById(R.id.rice_btn_yimi));
        rice_btn_yimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 9);
                startActivity(intent);
            }
        });
        rice_btn_yumi = ((Button) view.findViewById(R.id.rice_btn_yumi));
        rice_btn_yumi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 12);
                startActivity(intent);
            }
        });
        rice_btn_heizhima = ((Button) view.findViewById(R.id.rice_btn_heizhima));
        rice_btn_heizhima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 6);
                startActivity(intent);
            }
        });


        //干货副食15
        ganhuo_btn_all = ((Button) view.findViewById(R.id.ganhuo_btn_all));
        ganhuo_btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 13);
                startActivity(intent);
            }
        });
        ganhuo_btn_danzhiping = ((Button) view.findViewById(R.id.ganhuo_btn_danzhiping));
        ganhuo_btn_danzhiping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 14);
                startActivity(intent);
            }
        });
        ganhuo_btn_jungu = ((Button) view.findViewById(R.id.ganhuo_btn_jungu));

        ganhuo_btn_jungu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 15);
                startActivity(intent);
            }
        });
        ganhuo_btn_tiaoweiping = ((Button) view.findViewById(R.id.ganhuo_btn_tiaoweiping));

        ganhuo_btn_tiaoweiping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 16);
                startActivity(intent);
            }
        });

        ganhuo_btn_lianzi = ((Button) view.findViewById(R.id.ganhuo_btn_lianzi));

        ganhuo_btn_lianzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 17);
                startActivity(intent);
            }
        });

        ganhuo_btn_fentiao = ((Button) view.findViewById(R.id.ganhuo_btn_fentiao));

        ganhuo_btn_fentiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 18);
                startActivity(intent);
            }
        });

        ganhuo_btn_baihegan = ((Button) view.findViewById(R.id.ganhuo_btn_baihegan));

        ganhuo_btn_baihegan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 19);
                startActivity(intent);
            }
        });

        ganhuo_btn_fuzhu = ((Button) view.findViewById(R.id.ganhuo_btn_fuzhu));

        ganhuo_btn_fuzhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 20);
                startActivity(intent);
            }
        });
        ganhuo_btn_huanghuacai = ((Button) view.findViewById(R.id.ganhuo_btn_huanghuacai));

        ganhuo_btn_huanghuacai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 21);
                startActivity(intent);
            }
        });


        ganhuo_btn_haidai = ((Button) view.findViewById(R.id.ganhuo_btn_haidai));
        ganhuo_btn_haidai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 22);
                startActivity(intent);
            }
        });

        ganhuo_btn_gancai = ((Button) view.findViewById(R.id.ganhuo_btn_gancai));

        ganhuo_btn_gancai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 23);
                startActivity(intent);
            }
        });

        ganhuo_btn_xiagan = ((Button) view.findViewById(R.id.ganhuo_btn_xiagan));

        ganhuo_btn_xiagan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 24);
                startActivity(intent);
            }
        });

        ganhuo_btn_miantiao = ((Button) view.findViewById(R.id.ganhuo_btn_miantiao));

        ganhuo_btn_miantiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 25);
                startActivity(intent);
            }
        });

        ganhuo_btn_yugan = ((Button) view.findViewById(R.id.ganhuo_btn_yugan));

        ganhuo_btn_yugan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 26);
                startActivity(intent);
            }
        });


        ganhuo_btn_mixian = ((Button) view.findViewById(R.id.ganhuo_btn_mixian));

        ganhuo_btn_mixian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 27);
                startActivity(intent);
            }
        });


        //干果蜜饯13
        ganguo_btn_all = ((Button) view.findViewById(R.id.ganguo_btn_all));
        ganguo_btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 28);
                startActivity(intent);
            }
        });
        ganguo_btn_hongzao = ((Button) view.findViewById(R.id.ganguo_btn_hongzao));

        ganguo_btn_hongzao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 29);
                startActivity(intent);
            }
        });

        ganguo_btn_banli = ((Button) view.findViewById(R.id.ganguo_btn_banli));

        ganguo_btn_banli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 30);
                startActivity(intent);
            }
        });
        ganguo_btn_hetao = ((Button) view.findViewById(R.id.ganguo_btn_hetao));

        ganguo_btn_hetao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 31);
                startActivity(intent);
            }
        });


        ganguo_btn_putaogan = ((Button) view.findViewById(R.id.ganguo_btn_putaogan));

        ganguo_btn_putaogan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 32);
                startActivity(intent);
            }
        });

        ganguo_btn_xingren = ((Button) view.findViewById(R.id.ganguo_btn_xingren));

        ganguo_btn_xingren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 33);
                startActivity(intent);
            }
        });

        ganguo_btn_songzi = ((Button) view.findViewById(R.id.ganguo_btn_songzi));

        ganguo_btn_songzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 34);
                startActivity(intent);
            }
        });
        ganguo_btn_lizhigan = ((Button) view.findViewById(R.id.ganguo_btn_lizhigan));
        ganguo_btn_lizhigan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 35);
                startActivity(intent);
            }
        });
        ganguo_btn_hamiguagan = ((Button) view.findViewById(R.id.ganguo_btn_hamiguagan));
        ganguo_btn_hamiguagan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 36);
                startActivity(intent);
            }
        });
        ganguo_btn_mihuotaogan = ((Button) view.findViewById(R.id.ganguo_btn_mihuotaogan));
        ganguo_btn_mihuotaogan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 37);
                startActivity(intent);
            }
        });
        ganguo_btn_wuhuaguogan = ((Button) view.findViewById(R.id.ganguo_btn_wuhuaguogan));
        ganguo_btn_wuhuaguogan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 38);
                startActivity(intent);
            }
        });
        ganguo_btn_lanmeigan = ((Button) view.findViewById(R.id.ganguo_btn_lanmeigan));
        ganguo_btn_lanmeigan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 39);
                startActivity(intent);
            }
        });
        ganguo_btn_zhenzi = ((Button) view.findViewById(R.id.ganguo_btn_zhenzi));
        ganguo_btn_zhenzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 40);
                startActivity(intent);
            }
        });


        //生鲜水果27
        fruit_btn_all = ((Button) view.findViewById(R.id.fruit_btn_all));
        fruit_btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 41);
                startActivity(intent);
            }
        });
        fruit_btn_shucai = ((Button) view.findViewById(R.id.fruit_btn_shucai));
        fruit_btn_shucai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 42);
                startActivity(intent);
            }
        });
        fruit_btn_meat = ((Button) view.findViewById(R.id.fruit_btn_meat));
        fruit_btn_meat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 43);
                startActivity(intent);
            }
        });

        fruit_btn_apple = ((Button) view.findViewById(R.id.fruit_btn_apple));

        fruit_btn_apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 44);
                startActivity(intent);
            }
        });
        fruit_btn_chengzi = ((Button) view.findViewById(R.id.fruit_btn_chengzi));
        fruit_btn_chengzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 45);
                startActivity(intent);
            }
        });

        fruit_btn_youzi = ((Button) view.findViewById(R.id.fruit_btn_youzi));

        fruit_btn_youzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 46);
                startActivity(intent);
            }
        });
        fruit_btn_li = ((Button) view.findViewById(R.id.fruit_btn_li));

        fruit_btn_li.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 47);
                startActivity(intent);
            }
        });
        fruit_btn_baixiangguo = ((Button) view.findViewById(R.id.fruit_btn_baixiangguo));

        fruit_btn_baixiangguo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 48);
                startActivity(intent);
            }
        });
        fruit_btn_shizi = ((Button) view.findViewById(R.id.fruit_btn_shizi));

        fruit_btn_shizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 49);
                startActivity(intent);
            }
        });
        fruit_btn_mihoutao = ((Button) view.findViewById(R.id.fruit_btn_mihoutao));

        fruit_btn_mihoutao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 50);
                startActivity(intent);
            }
        });
        fruit_btn_ningmeng = ((Button) view.findViewById(R.id.fruit_btn_ningmeng));

        fruit_btn_ningmeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 51);
                startActivity(intent);
            }
        });
        fruit_btn_shiliu = ((Button) view.findViewById(R.id.fruit_btn_shiliu));


        fruit_btn_shiliu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 52);
                startActivity(intent);
            }
        });

        fruit_btn_orange = ((Button) view.findViewById(R.id.fruit_btn_orange));

        fruit_btn_orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 53);
                startActivity(intent);
            }
        });
        fruit_btn_shajiguo = ((Button) view.findViewById(R.id.fruit_btn_shajiguo));

        fruit_btn_shajiguo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 54);
                startActivity(intent);
            }
        });
        fruit_btn_niuyouguo = ((Button) view.findViewById(R.id.fruit_btn_niuyouguo));

        fruit_btn_niuyouguo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 55);
                startActivity(intent);
            }
        });
        fruit_btn_fanshiliu = ((Button) view.findViewById(R.id.fruit_btn_fanshiliu));

        fruit_btn_fanshiliu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 56);
                startActivity(intent);
            }
        });
        fruit_btn_yangtao = ((Button) view.findViewById(R.id.fruit_btn_yangtao));
        fruit_btn_yangtao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 57);
                startActivity(intent);
            }
        });


        fruit_btn_caomei = ((Button) view.findViewById(R.id.fruit_btn_caomei));

        fruit_btn_caomei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 58);
                startActivity(intent);
            }
        });
        fruit_btn_mangguo = ((Button) view.findViewById(R.id.fruit_btn_mangguo));

        fruit_btn_mangguo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 59);
                startActivity(intent);
            }
        });

        fruit_btn_yingtao = ((Button) view.findViewById(R.id.fruit_btn_yingtao));

        fruit_btn_yingtao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 60);
                startActivity(intent);
            }
        });

        fruit_btn_taozi = ((Button) view.findViewById(R.id.fruit_btn_taozi));

        fruit_btn_taozi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 61);
                startActivity(intent);
            }
        });

        fruit_btn_lizi = ((Button) view.findViewById(R.id.fruit_btn_lizi));
        fruit_btn_lizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 62);
                startActivity(intent);
            }
        });

        fruit_btn_tiangua = ((Button) view.findViewById(R.id.fruit_btn_tiangua));

        fruit_btn_tiangua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 63);
                startActivity(intent);
            }
        });

        fruit_btn_lizhi = ((Button) view.findViewById(R.id.fruit_btn_lizhi));

        fruit_btn_lizhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 64);
                startActivity(intent);
            }
        });
        fruit_btn_xing = ((Button) view.findViewById(R.id.fruit_btn_xing));

        fruit_btn_xing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 65);
                startActivity(intent);
            }
        });

        fruit_btn_shuichanpin = ((Button) view.findViewById(R.id.fruit_btn_shuichanpin));

        fruit_btn_shuichanpin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 66);
                startActivity(intent);
            }
        });
        fruit_btn_putao = ((Button) view.findViewById(R.id.fruit_btn_putao));
        fruit_btn_putao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 67);
                startActivity(intent);
            }
        });


        //茶饮冲剂13
        tea_btn_all = ((Button) view.findViewById(R.id.tea_btn_all));
        tea_btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 68);
                startActivity(intent);
            }
        });
        tea_btn_fengmi = ((Button) view.findViewById(R.id.tea_btn_fengmi));
        tea_btn_fengmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 69);
                startActivity(intent);
            }
        });
        tea_btn_hongcha = ((Button) view.findViewById(R.id.tea_btn_hongcha));
        tea_btn_hongcha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 70);
                startActivity(intent);
            }
        });
        tea_btn_ningmengpian = ((Button) view.findViewById(R.id.tea_btn_ningmengpian));
        tea_btn_ningmengpian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 71);
                startActivity(intent);
            }
        });
        tea_btn_juhua = ((Button) view.findViewById(R.id.tea_btn_juhua));
        tea_btn_juhua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 72);
                startActivity(intent);
            }
        });
        tea_btn_jinyinghua = ((Button) view.findViewById(R.id.tea_btn_jinyinghua));
        tea_btn_jinyinghua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 73);
                startActivity(intent);
            }
        });
        tea_btn_meiguihuacha = ((Button) view.findViewById(R.id.tea_btn_meiguihuacha));
        tea_btn_meiguihuacha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 74);
                startActivity(intent);
            }
        });
        tea_btn_gouqi_yacha = ((Button) view.findViewById(R.id.tea_btn_gouqi_yacha));
        tea_btn_gouqi_yacha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 75);
                startActivity(intent);
            }
        });
        tea_btn_pipahua = ((Button) view.findViewById(R.id.tea_btn_pipahua));
        tea_btn_pipahua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 76);
                startActivity(intent);
            }
        });
        tea_btn_luohanguo = ((Button) view.findViewById(R.id.tea_btn_luohanguo));
        tea_btn_luohanguo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 77);
                startActivity(intent);
            }
        });
        tea_btn_guihucha = ((Button) view.findViewById(R.id.tea_btn_guihucha));
        tea_btn_guihucha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 78);
                startActivity(intent);
            }
        });
        tea_btn_heyecha = ((Button) view.findViewById(R.id.tea_btn_heyecha));
        tea_btn_heyecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 79);
                startActivity(intent);
            }
        });
        tea_btn_sanqihua = ((Button) view.findViewById(R.id.tea_btn_sanqihua));
        tea_btn_sanqihua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 80);
                startActivity(intent);
            }
        });


        //滋补营养20
        nurtion_btn_all = ((Button) view.findViewById(R.id.nurtion_btn_all));
        nurtion_btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 81);
                startActivity(intent);
            }
        });
        nurtion_btn_shanyao = ((Button) view.findViewById(R.id.nurtion_btn_shanyao));
        nurtion_btn_shanyao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 82);
                startActivity(intent);
            }
        });
        nurtion_btn_guiyuangan = ((Button) view.findViewById(R.id.nurtion_btn_guiyuangan));
        nurtion_btn_guiyuangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 83);
                startActivity(intent);
            }
        });
        nurtion_btn_gouqi = ((Button) view.findViewById(R.id.nurtion_btn_gouqi));
        nurtion_btn_gouqi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 84);
                startActivity(intent);
            }
        });
        nurtion_btn_gegenfen = ((Button) view.findViewById(R.id.nurtion_btn_gegenfen));
        nurtion_btn_gegenfen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 85);
                startActivity(intent);
            }
        });
        nurtion_btn_ajiaogao = ((Button) view.findViewById(R.id.nurtion_btn_ajiaogao));
        nurtion_btn_ajiaogao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 86);
                startActivity(intent);
            }
        });
        nurtion_btn_lingzhi = ((Button) view.findViewById(R.id.nurtion_btn_lingzhi));
        nurtion_btn_lingzhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 87);
                startActivity(intent);
            }
        });
        nurtion_btn_zhusun = ((Button) view.findViewById(R.id.nurtion_btn_zhusun));
        nurtion_btn_zhusun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 88);
                startActivity(intent);
            }
        });
        nurtion_btn_tianma = ((Button) view.findViewById(R.id.nurtion_btn_tianma));
        nurtion_btn_tianma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 89);
                startActivity(intent);
            }
        });
        nurtion_btn_sanqi = ((Button) view.findViewById(R.id.nurtion_btn_sanqi));
        nurtion_btn_sanqi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 90);
                startActivity(intent);
            }
        });
        nurtion_btn_huangjing = ((Button) view.findViewById(R.id.nurtion_btn_huangjing));
        nurtion_btn_huangjing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 91);
                startActivity(intent);
            }
        });
        nurtion_btn_oufen = ((Button) view.findViewById(R.id.nurtion_btn_oufen));
        nurtion_btn_oufen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 92);
                startActivity(intent);
            }
        });
        nurtion_btn_zaojiaofen = ((Button) view.findViewById(R.id.nurtion_btn_zaojiaofen));
        nurtion_btn_zaojiaofen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 93);
                startActivity(intent);
            }
        });
        nurtion_btn_danshen = ((Button) view.findViewById(R.id.nurtion_btn_danshen));
        nurtion_btn_danshen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 94);
                startActivity(intent);
            }
        });
        nurtion_btn_taojiao = ((Button) view.findViewById(R.id.nurtion_btn_taojiao));
        nurtion_btn_taojiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 95);
                startActivity(intent);
            }
        });
        nurtion_btn_juema = ((Button) view.findViewById(R.id.nurtion_btn_juema));
        nurtion_btn_juema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 96);
                startActivity(intent);
            }
        });
        nurtion_btn_renshen = ((Button) view.findViewById(R.id.nurtion_btn_renshen));
        nurtion_btn_renshen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 97);
                startActivity(intent);
            }
        });
        nurtion_btn_dihuang = ((Button) view.findViewById(R.id.nurtion_btn_dihuang));
        nurtion_btn_dihuang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 98);
                startActivity(intent);
            }
        });
        nurtion_btn_yuzhu = ((Button) view.findViewById(R.id.nurtion_btn_yuzhu));
        nurtion_btn_yuzhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 99);
                startActivity(intent);
            }
        });
        nurtion_btn_qita = ((Button) view.findViewById(R.id.nurtion_btn_qita));
        nurtion_btn_qita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 100);
                startActivity(intent);
            }
        });

        //休闲零食
        rest_btn_all = ((Button) view.findViewById(R.id.rest_btn_all));
        rest_btn_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 101);
                startActivity(intent);
            }
        });
        rest_btn_hongshugan = ((Button) view.findViewById(R.id.rest_btn_hongshugan));
        rest_btn_hongshugan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 102);
                startActivity(intent);
            }
        });
        rest_btn_niulougan = ((Button) view.findViewById(R.id.rest_btn_niulougan));
        rest_btn_niulougan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 103);
                startActivity(intent);
            }
        });
        rest_btn_frultguantou = ((Button) view.findViewById(R.id.rest_btn_frultguantou));
        rest_btn_frultguantou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 104);
                startActivity(intent);
            }
        });
        rest_btn_shibing = ((Button) view.findViewById(R.id.rest_btn_shibing));
        rest_btn_shibing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 105);
                startActivity(intent);
            }
        });
        rest_btn_shanzha = ((Button) view.findViewById(R.id.rest_btn_shanzha));
        rest_btn_shanzha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 106);
                startActivity(intent);
            }
        });
        rest_btn_suanzaogao = ((Button) view.findViewById(R.id.rest_btn_suanzaogao));
        rest_btn_suanzaogao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 107);
                startActivity(intent);
            }
        });
        rest_btn_heizhi_mahu = ((Button) view.findViewById(R.id.rest_btn_heizhi_mahu));
        rest_btn_heizhi_mahu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 108);
                startActivity(intent);
            }
        });
        rest_btn_zaojia_hetao = ((Button) view.findViewById(R.id.rest_btn_zaojia_hetao));
        rest_btn_zaojia_hetao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 109);
                startActivity(intent);
            }
        });
        rest_btn_hongtang_mahua = ((Button) view.findViewById(R.id.rest_btn_hongtang_mahua));
        rest_btn_hongtang_mahua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 110);
                startActivity(intent);
            }
        });
        rest_btn_doufugan = ((Button) view.findViewById(R.id.rest_btn_doufugan));
        rest_btn_doufugan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 111);
                startActivity(intent);
            }
        });
        rest_btn_mianbao = ((Button) view.findViewById(R.id.rest_btn_mianbao));
        rest_btn_mianbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 112);
                startActivity(intent);
            }
        });
        rest_btn_qiongguotang = ((Button) view.findViewById(R.id.rest_btn_qiongguotang));
        rest_btn_qiongguotang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 113);
                startActivity(intent);
            }
        });
        rest_btn_tese_taocan = ((Button) view.findViewById(R.id.rest_btn_tese_taocan));
        rest_btn_tese_taocan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 114);
                startActivity(intent);
            }
        });
        rest_btn_labaicai = ((Button) view.findViewById(R.id.rest_btn_labaicai));
        rest_btn_labaicai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key", 115);
                startActivity(intent);
            }
        });





    }

    /*@Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rice_btn_all:
                Intent intent=new Intent(getActivity().getApplicationContext(), ClassifyActivity.class);
                intent.putExtra("key",1);
                startActivity(intent);
                break;
            case R.id.rice_btn_bean:
                break;
            case R.id.rice_btn_heizhima:
                break;
            case R.id.rice_btn_huasheng:
                break;
            case R.id.rice_btn_nuomi:
                break;
            case R.id.rice_btn_oil:
                break;
            case R.id.rice_btn_rice:
                break;
            case R.id.rice_btn_xiaomi:
                break;
            case R.id.rice_btn_yanmaifen:
                break;
            case R.id.rice_btn_yimi:
                break;
            case R.id.rice_btn_yumi:
                break;


        }

    }*/
}
