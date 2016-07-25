package com.example.nr.nongren.Api;

/**
 * Created by hjw on 2016/7/18.
 */
public class ContentApi {
    public static final String HOME_BANNER_URL ="http://m.anong.com/picture/banners";//首页图片轮播接口
    public static final String HOME_SALE_URL = "http://m.anong.com/picture/singleProduct";//阿农特卖接口
    public static final String HOME_NEW_REPUTION_URL = "http://m.anong.com/products/all_activities_homepage";//阿农上新和一周口碑接口
    public static final String HOME_FARMER_URL = "http://m.anong.com/farmerCircle/getEntraceForHome";//农人圈滚动接口
    public static final String HOME_SHOP_THING_URL = "http://m.anong.com/products?hotRecommend=true&page=%d";//商品接口
    public static final String HOME_REPUATION_URL="http://m.anong.com/products/latest_launch_activity/2?page=1";
    public static  final String HOME_NEW_URL = "http://m.anong.com/products/latest_launch_activity/1?page=1";
    public static  final String HOME_WEBVIEW_SHOP_URL = "http://m.anong.com/products/%d/detail";
    public static  final String HOME_SHOP_DETAILS_URL="http://m.anong.com/products/%d";
    public static final String HOME_HOT_RECOMMEND_URL ="http://m.anong.com/products?hotRecommend=true&page=%d";
    public static  final String HPME_FARMER_CIRCLE_URL = "http://m.anong.com/farmerCircle/getWholeDynamic?page=%d";
    //进入页面
    public static final String BASE_URL = "http://m.anong.com/categories/hierarchy";


    //搜索
    public static final String SEARCH_URL = "http://m.anong.com/search/products?keyword=%d&page=1&perPage=8&sortBy=weight&sortByAsc=false";
    //蜂蜜
    public static final String FENMI_URL = "http://m.anong.com/search/products?keyword=%E8%9C%82%E8%9C%9C&page=1&perPage=8&sortBy=weight&sortByAsc=false";
    //大米
    public static final String DAMI_URL = "http://m.anong.com/search/products?keyword=%E5%A4%A7%E7%B1%B3&page=1&perPage=8&sortBy=weight&sortByAsc=false";
    //零食
    public static final String LENGSHI_URL = "http://m.anong.com/search/products?keyword=%E9%9B%B6%E9%A3%9F&page=1&perPage=8&sortBy=weight&sortByAsc=false";
    //木耳
    public static final String MUER_URL = "http://m.anong.com/search/products?keyword=%E6%9C%A8%E8%80%B3&page=1&perPage=8&sortBy=weight&sortByAsc=false";


    //米面粮油
    //全部
    public static final String RICE_ALL_URL = "http://m.anong.com/products?categoryId=1&orderBy=%s&page=%d";
    public static final String RICE_ALL_URL02 = "http://m.anong.com/products?categoryId=169&orderBy=%s&page=%d";
    public static final String RICE_ALL_URL03 = "http://m.anong.com/products?categoryId=48&orderBy=%s&page=%d";
    public static final String RICE_ALL_URL04 = "http://m.anong.com/products?categoryId=137&orderBy=%s&page=%d";
    public static final String RICE_ALL_URL05 = "http://m.anong.com/products?categoryId=59&orderBy=%s&page=%d";
    public static final String RICE_ALL_URL06 = "http://m.anong.com/products?categoryId=54&orderBy=%s&page=%d";
    public static final String RICE_ALL_URL07 = "http://m.anong.com/products?categoryId=50&orderBy=%s&page=%d";
    public static final String RICE_ALL_URL08 = "http://m.anong.com/products?categoryId=56&orderBy=%s&page=%d";
    public static final String RICE_ALL_URL09 = "http://m.anong.com/products?categoryId=58&orderBy=%s&page=%d";
    public static final String RICE_ALL_URL10 = "http://m.anong.com/products?categoryId=89&orderBy=%s&page=%d";
    public static final String RICE_ALL_URL11 = "http://m.anong.com/products?categoryId=91&orderBy=%s&page=%d";
    public static final String RICE_ALL_URL12 = "http://m.anong.com/products?categoryId=106&orderBy=%s&page=%d";
    //干货副食
    //全部
    public static final String GANHUO_ALL_URL = "http://m.anong.com/products?categoryId=28&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL02 = "http://m.anong.com/products?categoryId=146&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL03 = "http://m.anong.com/products?categoryId=170&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL04 = "http://m.anong.com/products?categoryId=171&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL05 = "http://m.anong.com/products?categoryId=65&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL06 = "http://m.anong.com/products?categoryId=61&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL07 = "http://m.anong.com/products?categoryId=66&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL08 = "http://m.anong.com/products?categoryId=95&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL09 = "http://m.anong.com/products?categoryId=103&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL10 = "http://m.anong.com/products?categoryId=113&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL11 = "http://m.anong.com/products?categoryId=138&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL12 = "http://m.anong.com/products?categoryId=163&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL13 = "http://m.anong.com/products?categoryId=164&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL14 = "http://m.anong.com/products?categoryId=172&orderBy=%s&page=%d";
    public static final String GANHUO_ALL_URL15 = "http://m.anong.com/products?categoryId=212&orderBy=%s&page=%d";
    //干果蜜饯13
    public static final String GANGUO_ALL_URL = "http://m.anong.com/products?categoryId=44&orderBy=%s&page=%d";
    public static final String GANGUO_ALL_URL02 = "http://m.anong.com/products?categoryId=73&orderBy=%s&page=%d";
    public static final String GANGUO_ALL_URL03 = "http://m.anong.com/products?categoryId=100&orderBy=%s&page=%d";
    public static final String GANGUO_ALL_URL04 = "http://m.anong.com/products?categoryId=72&orderBy=%s&page=%d";
    public static final String GANGUO_ALL_URL05 = "http://m.anong.com/products?categoryId=148&orderBy=%s&page=%d";
    public static final String GANGUO_ALL_URL06 = "http://m.anong.com/products?categoryId=127&orderBy=%s&page=%d";
    public static final String GANGUO_ALL_URL07 = "http://m.anong.com/products?categoryId=86&orderBy=%s&page=%d";
    public static final String GANGUO_ALL_URL08 = "http://m.anong.com/products?categoryId=161&orderBy=%s&page=%d";
    public static final String GANGUO_ALL_URL09 = "http://m.anong.com/products?categoryId=165&orderBy=%s&page=%d";
    public static final String GANGUO_ALL_URL10 = "http://m.anong.com/products?categoryId=185&orderBy=%s&page=%d";
    public static final String GANGUO_ALL_URL11 = "http://m.anong.com/products?categoryId=190&orderBy=%s&page=%d";
    public static final String GANGUO_ALL_URL12 = "http://m.anong.com/products?categoryId=191&orderBy=%s&page=%d";
    public static final String GANGUO_ALL_URL13 = "http://m.anong.com/products?categoryId=197&orderBy=%s&page=%d";
    //生鲜水果27
    public static final String FRUIT_ALL_URL = "http://m.anong.com/products?categoryId=125&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL02 = "http://m.anong.com/products?categoryId=188&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL03 = "http://m.anong.com/products?categoryId=186&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL04 = "http://m.anong.com/products?categoryId=126&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL05 = "http://m.anong.com/products?categoryId=131&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL06 = "http://m.anong.com/products?categoryId=128&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL07 = "http://m.anong.com/products?categoryId=130&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL08 = "http://m.anong.com/products?categoryId=140&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL09 = "http://m.anong.com/products?categoryId=141&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL10 = "http://m.anong.com/products?categoryId=160&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL11 = "http://m.anong.com/products?categoryId=132&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL12 = "http://m.anong.com/products?categoryId=152&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL13 = "http://m.anong.com/products?categoryId=168&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL14 = "http://m.anong.com/products?categoryId=174&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL15 = "http://m.anong.com/products?categoryId=179&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL16 = "http://m.anong.com/products?categoryId=180&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL17 = "http://m.anong.com/products?categoryId=198&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL18 = "http://m.anong.com/products?categoryId=199&orderBy=&spage=%d";
    public static final String FRUIT_ALL_URL19 = "http://m.anong.com/products?categoryId=200&orderBy=&spage=%d";
    public static final String FRUIT_ALL_URL20 = "http://m.anong.com/products?categoryId=202&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL21 = "http://m.anong.com/products?categoryId=203&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL22 = "http://m.anong.com/products?categoryId=205&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL23 = "http://m.anong.com/products?categoryId=206&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL24 = "http://m.anong.com/products?categoryId=209&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL25 = "http://m.anong.com/products?categoryId=210&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL26 = "http://m.anong.com/products?categoryId=213&orderBy=%s&page=%d";
    public static final String FRUIT_ALL_URL27 = "http://m.anong.com/products?categoryId=214&orderBy=%s&page=%d";

    //茶饮13
    public static final String TER_ALL_URL = "http://m.anong.com/products?categoryId=45&orderBy=%s&page=%d";
    public static final String TER_ALL_URL02 = "http://m.anong.com/products?categoryId=176&orderBy=%s&page=%d";
    public static final String TER_ALL_URL03 = "http://m.anong.com/products?categoryId=175&orderBy=%s&page=%d";
    public static final String TER_ALL_URL04 = "http://m.anong.com/products?categoryId=76&orderBy=%s&page=%d";
    public static final String TER_ALL_URL05 = "http://m.anong.com/products?categoryId=77&orderBy=%s&page=%d";
    public static final String TER_ALL_URL06 = "http://m.anong.com/products?categoryId=74&orderBy=%s&page=%d";
    public static final String TER_ALL_URL07 = "http://m.anong.com/products?categoryId=75&orderBy=%s&page=%d";
    public static final String TER_ALL_URL08 = "http://m.anong.com/products?categoryId=99&orderBy=%s&page=%d";
    public static final String TER_ALL_URL09 = "http://m.anong.com/products?categoryId=108&orderBy=%s&page=%d";
    public static final String TER_ALL_URL10 = "http://m.anong.com/products?categoryId=116&orderBy=%s&page=%d";
    public static final String TER_ALL_URL11 = "http://m.anong.com/products?categoryId=118&orderBy=%s&page=%d";
    public static final String TER_ALL_URL12 = "http://m.anong.com/products?categoryId=193&orderBy=%s&page=%d";
    public static final String TER_ALL_URL13 = "http://m.anong.com/products?categoryId=196&orderBy=%s&page=%d";


    //滋补营养20
    public static final String ZIBU_ALL_URL = "http://m.anong.com/products?categoryId=43&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL02 = "http://m.anong.com/products?categoryId=68&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL03 = "http://m.anong.com/products?categoryId=87&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL04 = "http://m.anong.com/products?categoryId=71&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL05 = "http://m.anong.com/products?categoryId=85&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL06 = "http://m.anong.com/products?categoryId=92&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL07 = "http://m.anong.com/products?categoryId=93&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL08 = "http://m.anong.com/products?categoryId=101&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL09 = "http://m.anong.com/products?categoryId=112&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL10 = "http://m.anong.com/products?categoryId=122&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL11 = "http://m.anong.com/products?categoryId=124&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL12 = "http://m.anong.com/products?categoryId=158&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL13 = "http://m.anong.com/products?categoryId=159&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL14 = "http://m.anong.com/products?categoryId=181&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL15 = "http://m.anong.com/products?categoryId=183&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL16 = "http://m.anong.com/products?categoryId=184&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL17 = "http://m.anong.com/products?categoryId=192&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL18 = "http://m.anong.com/products?categoryId=194&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL19 = "http://m.anong.com/products?categoryId=195&orderBy=%s&page=%d";
    public static final String ZIBU_ALL_URL20 = "http://m.anong.com/products?categoryId=208&orderBy=%s&page=%d";


    //休闲零食15
    public static final String XIUXIAN_ALL_URL = "http://m.anong.com/products?categoryId=46&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL02 = "http://m.anong.com/products?categoryId=80&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL03 = "http://m.anong.com/products?categoryId=109&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL04 = "http://m.anong.com/products?categoryId=151&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL05 = "http://m.anong.com/products?categoryId=123&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL06 = "http://m.anong.com/products?categoryId=78&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL07 = "http://m.anong.com/products?categoryId=107&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL08 = "http://m.anong.com/products?categoryId=157&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL09 = "http://m.anong.com/products?categoryId=177&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL10 = "http://m.anong.com/products?categoryId=178&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL11 = "http://m.anong.com/products?categoryId=182&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL12 = "http://m.anong.com/products?categoryId=187&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL13 = "http://m.anong.com/products?categoryId=189&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL14 = "http://m.anong.com/products?categoryId=201&orderBy=%s&page=%d";
    public static final String XIUXIAN_ALL_URL15 = "http://m.anong.com/products?categoryId=215&orderBy=%s&page=%d";

    //head
   /* public static final String HEAD_PINGFEI = "http://m.anong.com/products?categoryId=169&orderBy=-review_rating&page=%d";
    public static final String HEAD_PRICE = "http://m.anong.com/products?categoryId=169&orderBy=-anong_price&page=%d";*/



    //详情页
    public static final String RICE_ALL_01_URL = "http://m.anong.com/products/id";
    //干货副食

    //干果蜜饯
    // public static final String GANGUO_ALL_URL = "http://m.anong.com/products?categoryId=44&orderBy=-month_purchase_times&page=1";
    //生鲜水果
    // public static final String FRUIT_ALL_URL = "http://m.anong.com/products?categoryId=125&orderBy=-month_purchase_times&page=1";
    //茶饮
    //public static final String TER_ALL_URL = "http://m.anong.com/products?categoryId=44&orderBy=-month_purchase_times&page=1";
    //滋补营养
    //public static final String ZIBU_ALL_URL = "http://m.anong.com/products?categoryId=43&orderBy=-month_purchase_times&page=1";
    //休闲零食
    //public static final String XIUXIAN_ALL_URL = "http://m.anong.com/products?categoryId=46&orderBy=-month_purchase_times&page=1";
}
