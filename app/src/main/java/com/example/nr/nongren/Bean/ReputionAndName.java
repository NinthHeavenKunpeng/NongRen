package com.example.nr.nongren.Bean;



import java.util.List;

/**
 * Created by hjw on 2016/7/18.
 */

public class ReputionAndName {
    /**
     * picture : http://img.anong.com/image/LaunchActivity/picture/BEED6B3AE7423EBEF300DAAA9681F009/146856306465883527.png@!default.jpg
     * activityExisted : true
     * launchActivityProducts : [{"id":930,"title":"【暂定接单，特卖活动准备中，敬请期待】八百里戈壁滩，自然熟[沙漠甜瓜]，瓜香醉人7斤2个装","picture":"http://img.anong.com/image/ProductPicture/picture/15304958963C6961D24F6F3E45AC801A/146848965968541578.png@!thumbnail.jpg"},{"id":921,"title":"东北辣白菜，浓浓的东北味","picture":"http://img.anong.com/image/ProductPicture/picture/62D38E6DAE11E2322045FBA14AF0F8A4/146822550546035423.jpg@!thumbnail.jpg"},{"id":931,"title":"万红宝水蜜桃","picture":"http://img.anong.com/image/ProductPicture/picture/AD5B0B2372E9117508FF4C4B2D25D426/146849517064408491.jpg@!thumbnail.jpg"},{"id":925,"title":"老妈自腌手工辣黄瓜下饭菜","picture":"http://img.anong.com/image/ProductPicture/picture/F1A210D5378C404A391E461E90011DCC/146823364812849810.jpg@!thumbnail.jpg"},{"id":917,"title":"陕西商洛红腰豆红芸豆","picture":"http://img.anong.com/image/ProductPicture/picture/FB08FBED81B9C68D13D21765DC442DA3/146770046411455931.png@!thumbnail.jpg"},{"id":61,"title":"阿克苏鲜核桃预售","picture":"http://img.anong.com/image/ProductPicture/picture/0A2DE7D6731686FDFB663833CA072AA9/144005129473973823.jpg@!thumbnail.jpg"}]
     */

    private LaunchBean launch;
    /**
     * picture : http://img.anong.com/image/LaunchActivity/picture/8464CC126D92A3BE6120050CE074C5E8/146828688499371645.png@!default.jpg
     * activityExisted : true
     * launchActivityProducts : [{"id":49,"title":"当季新货 阿克苏纸皮核桃","picture":"http://img.anong.com/image/ProductPicture/picture/F2396131A580CEA98054E5EC65910EAC/143873920957182250.jpg@!thumbnail.jpg"},{"id":667,"title":"东北红豆 （真空小包装）","picture":"http://img.anong.com/image/ProductPicture/picture/B5EBDD3754A07D31118D60DABC1E7A1A/145856181712232130.jpg@!thumbnail.jpg"},{"id":102,"title":"野生南酸枣饼500g（三件包邮）","picture":"http://img.anong.com/image/ProductPicture/picture/2BEB53800E4589F469B6E4F14D1C3771/144299170057167375.jpg@!thumbnail.jpg"},{"id":422,"title":"青海诺木洪野生黑枸杞  精美礼盒装！","picture":"http://img.anong.com/image/ProductPicture/picture/D0A0D63DA6F469CDBB3FAAAC0EF41DF9/145128821317115647.jpg@!thumbnail.jpg"},{"id":705,"title":"秦岭椴木香菇农家自产500g包邮","picture":"http://img.anong.com/image/ProductPicture/picture/DF13C172E6C4A1DAE37936CC502D8F66/145948420459952529.jpg@!thumbnail.jpg"},{"id":433,"title":"小米  | 天然种植 人工拔草 手工磨制","picture":"http://img.anong.com/image/ProductPicture/picture/AD0EC0EC520A348C880E9676A5C8F8BC/145707057330297990.jpg@!thumbnail.jpg"}]
     */

    private FestivalBean festival;
    /**
     * picture :
     * activityExisted : false
     * launchActivityProducts :
     */

    private SalesBean sales;

    public LaunchBean getLaunch() {
        return launch;
    }

    public void setLaunch(LaunchBean launch) {
        this.launch = launch;
    }

    public FestivalBean getFestival() {
        return festival;
    }

    public void setFestival(FestivalBean festival) {
        this.festival = festival;
    }

    public SalesBean getSales() {
        return sales;
    }

    public void setSales(SalesBean sales) {
        this.sales = sales;
    }

    public static class LaunchBean {

        private String picture;

        private boolean activityExisted;
        /**
         * id : 930
         * title : 【暂定接单，特卖活动准备中，敬请期待】八百里戈壁滩，自然熟[沙漠甜瓜]，瓜香醉人7斤2个装
         * picture : http://img.anong.com/image/ProductPicture/picture/15304958963C6961D24F6F3E45AC801A/146848965968541578.png@!thumbnail.jpg
         */

        private List<LaunchActivityProductsBean> launchActivityProducts;

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public boolean isActivityExisted() {
            return activityExisted;
        }

        public void setActivityExisted(boolean activityExisted) {
            this.activityExisted = activityExisted;
        }

        public List<LaunchActivityProductsBean> getLaunchActivityProducts() {
            return launchActivityProducts;
        }

        public void setLaunchActivityProducts(List<LaunchActivityProductsBean> launchActivityProducts) {
            this.launchActivityProducts = launchActivityProducts;
        }

        public static class LaunchActivityProductsBean {

            private int id;

            private String title;

            private String picture;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }
        }
    }

    public static class FestivalBean {

        private String picture;

        private boolean activityExisted;
        /**
         * id : 49
         * title : 当季新货 阿克苏纸皮核桃
         * picture : http://img.anong.com/image/ProductPicture/picture/F2396131A580CEA98054E5EC65910EAC/143873920957182250.jpg@!thumbnail.jpg
         */

        private List<LaunchActivityProductsBean> launchActivityProducts;

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public boolean isActivityExisted() {
            return activityExisted;
        }

        public void setActivityExisted(boolean activityExisted) {
            this.activityExisted = activityExisted;
        }

        public List<LaunchActivityProductsBean> getLaunchActivityProducts() {
            return launchActivityProducts;
        }

        public void setLaunchActivityProducts(List<LaunchActivityProductsBean> launchActivityProducts) {
            this.launchActivityProducts = launchActivityProducts;
        }

        public static class LaunchActivityProductsBean {

            private int id;

            private String title;

            private String picture;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getPicture() {
                return picture;
            }

            public void setPicture(String picture) {
                this.picture = picture;
            }
        }
    }

    public static class SalesBean {

        private String picture;

        private boolean activityExisted;

        private String launchActivityProducts;

        public String getPicture() {
            return picture;
        }

        public void setPicture(String picture) {
            this.picture = picture;
        }

        public boolean isActivityExisted() {
            return activityExisted;
        }

        public void setActivityExisted(boolean activityExisted) {
            this.activityExisted = activityExisted;
        }

        public String getLaunchActivityProducts() {
            return launchActivityProducts;
        }

        public void setLaunchActivityProducts(String launchActivityProducts) {
            this.launchActivityProducts = launchActivityProducts;
        }
    }
}
