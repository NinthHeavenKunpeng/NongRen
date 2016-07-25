package com.example.nr.nongren.Utils;

import android.content.Context;
import android.content.res.XmlResourceParser;
import com.example.nr.nongren.Bean.City;
import com.example.nr.nongren.Bean.District;
import com.example.nr.nongren.Bean.FarmerRelation;
import com.example.nr.nongren.Bean.HomeBanner;
import com.example.nr.nongren.Bean.Province;
import com.example.nr.nongren.Bean.SalePrice;
import com.example.nr.nongren.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hjw on 2016/7/18.
 */
public class Parser {
   public static SalePrice parserSalePrice(String json){//解析阿农特卖接口
       SalePrice salePrice = null;
       try {
           JSONObject o = new JSONObject(json);
           boolean flag =o.optBoolean("result");
           if (flag==true){
                JSONObject o1 = o.optJSONObject("singleProduct");
                salePrice = new SalePrice();
                salePrice.setId(o1.optString("id"));
                salePrice.setPicture(o1.optString("picture"));
                salePrice.setStart_time(o1.optString("start_time"));
                salePrice.setEnd_time(o1.optString("end_time"));
                salePrice.setSort_bonus(o1.optString("sort_bonus"));
                salePrice.setType(o1.optInt("type"));
               salePrice.setUrl(o1.optString("url"));
           }else {
               return null;
           }
       } catch (JSONException e) {
           e.printStackTrace();
       }
       return salePrice;
   }
    public static List<HomeBanner> parserBanner(String json){
        List<HomeBanner>list = new ArrayList<HomeBanner>();
        try {
            JSONArray arr = new JSONArray(json);
            for (int i = 0; i <arr.length() ; i++) {
                HomeBanner homeBanner = new HomeBanner();
                JSONObject o = arr.getJSONObject(i);

                homeBanner.setPicture(o.optString("picture"));
                homeBanner.setId(o.optString("id"));
                list.add(homeBanner);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static List<FarmerRelation>parserCircle(String json){
        List<FarmerRelation>list = new ArrayList<FarmerRelation>();
        try {
            JSONObject o = new JSONObject(json);
            JSONObject o1 = o.optJSONObject("farmerDynamics");
            JSONArray arr = o1.getJSONArray("farmerDynamics");
            for (int i = 0; i <arr.length() ; i++) {
                JSONObject o3 = arr.getJSONObject(i);
                FarmerRelation farmerRel = new FarmerRelation();
                farmerRel.setContent(o3.optString("content"));
                farmerRel.setPictureNum(o3.optInt("pictureNum"));
                farmerRel.setUserName(o3.optString("userName"));
                farmerRel.setUserMicroAvatar(o3.optString("userMicroAvatar"));
                farmerRel.setTimeDifference(o3.optString("timeDifference"));
                farmerRel.setPraiseTimes(o3.optString("praiseTimes"));
                JSONObject o4 = o3.getJSONObject("product");
                farmerRel.setProductTitle(o4.optString("title"));
                farmerRel.setProductfirstPicture(o4.optString("firstPicture"));
                farmerRel.setId(o4.optInt("id"));
                JSONObject o5 = o3.optJSONObject("shop");
                farmerRel.setShopTitle(o5.optString("title"));
                farmerRel.setShopfirstPicture(o5.optString("firstPicture"));
                farmerRel.setShopId(o3.optInt("shopId"));
                List<FarmerRelation.pictures>urlList=new ArrayList<FarmerRelation.pictures>();
                JSONArray arr1 = o3.getJSONArray("pictures");
                for (int j = 0; j <arr1.length() ; j++) {
                    JSONObject o6 = arr1.getJSONObject(j);
                    FarmerRelation.pictures  pictures =new FarmerRelation.pictures();
                    pictures.setUrl(o6.optString("picture_thumbnail"));
                    urlList.add(pictures);
                    farmerRel.setList(urlList);
                }
                farmerRel.setIsPraised(o3.optString("isPraised"));
                list.add(farmerRel);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static List<Province> parser(Context context){
        List<Province>list =null;
        Province province = null;

        List<City>cities = null;
        City city = null;

        List<District>districts = null;
        District district = null;

        // 创建解析器，并制定解析的xml文件
        XmlResourceParser parser = context.getResources().getXml(R.xml.cities);
        try{
            int type = parser.getEventType();
            while(type!=1) {
                String tag = parser.getName();//获得标签名
                switch (type) {
                    case XmlResourceParser.START_DOCUMENT:
                        list = new ArrayList<Province>();
                        break;
                    case XmlResourceParser.START_TAG:
                        if ("p".equals(tag)) {
                            province=new Province();
                            cities = new ArrayList<City>();
                            int n =parser.getAttributeCount();
                            for(int i=0 ;i<n;i++){
                                //获得属性的名和值
                                String name = parser.getAttributeName(i);
                                String value = parser.getAttributeValue(i);
                                if("p_id".equals(name)){
                                    province.setId(value);
                                }
                            }
                        }
                        if ("pn".equals(tag)){//省名字
                            province.setName(parser.nextText());
                        }
                        if ("c".equals(tag)){//城市
                            city = new City();
                            districts = new ArrayList<District>();
                            int n =parser.getAttributeCount();
                            for(int i=0 ;i<n;i++){
                                String name = parser.getAttributeName(i);
                                String value = parser.getAttributeValue(i);
                                if("c_id".equals(name)){
                                    city.setId(value);
                                }
                            }
                        }
                        if ("cn".equals(tag)){
                            city.setName(parser.nextText());
                        }
                        if ("d".equals(tag)){
                            district = new District();
                            int n =parser.getAttributeCount();
                            for(int i=0 ;i<n;i++){
                                String name = parser.getAttributeName(i);
                                String value = parser.getAttributeValue(i);
                                if("d_id".equals(name)){
                                    district.setId(value);
                                }
                            }
                            district.setName(parser.nextText());
                            districts.add(district);
                        }
                        break;
                    case XmlResourceParser.END_TAG:
                        if ("c".equals(tag)){
                            city.setDistricts(districts);
                            cities.add(city);
                        }
                        if("p".equals(tag)){
                            province.setCitys(cities);
                            list.add(province);
                        }
                        break;
                    default:
                        break;
                }
                type = parser.next();
            }
        }catch (XmlPullParserException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        /*catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } */
        catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }
}
