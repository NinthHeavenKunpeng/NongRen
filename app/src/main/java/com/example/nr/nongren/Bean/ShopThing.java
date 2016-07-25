package com.example.nr.nongren.Bean;

import java.util.List;

/**
 * Created by hjw on 2016/7/20.
 */
public class ShopThing {

    /**
     * id : 927
     * shopId : 9
     * title : 【花果山】稀有蜜种 中药材丹参蜜（适合女性、中老年人的蜂蜜）
     * desc :
     * pictures : ["http://img.anong.com/image/ProductPicture/picture/70A9596D471F0CFB3505913F1A962B7E/146865452250971770.jpg@!medium.jpg","http://img.anong.com/image/ProductPicture/picture/14E47A1245D19F80C7E673FCBCEBC4E6/146831315176977587.jpg@!medium.jpg","http://img.anong.com/image/ProductPicture/picture/CD848FB58D27E26697A2248DEE6C3B5F/146831298144725808.jpg@!medium.jpg","http://img.anong.com/image/ProductPicture/picture/591C00F7D5D8FABB6795FD8B390778A2/146831333754388615.jpg@!medium.jpg","http://img.anong.com/image/ProductPicture/picture/E2C2E69FE19B49F63BADA1F6D451E7A8/14683129702927001.jpg@!medium.jpg"]
     * review : {"count":0,"rating":0,"rating_class":0}
     * latestReviews : []
     * price : 49.00
     * unit : 500g
     * subProducts : [{"id":1986,"type":"[丹参原蜜] 500g","anong_price":"49.00","stock_num":2000,"is_experience":0,"origin_anong_price":"70.00","available_quantity":0},{"id":1987,"type":"[丹参原蜜] 1000g","anong_price":"88.00","stock_num":2000,"is_experience":0,"origin_anong_price":"130.00","available_quantity":0}]
     * shop : {"id":9,"name":"张丙宜的农家院","user_name":"张丙宜","meiqia_id":null}
     * anongView :
     * thumbnail : http://img.anong.com/image/ProductPicture/picture/70A9596D471F0CFB3505913F1A962B7E/146865452250971770.jpg@!micro.jpg
     * sales : 0
     * isAnongRecommend : false
     * shippingFee : {"baseShippingFee":0,"mode":0,"noFeeCount":0,"noFeeType":0,"noFeeMoney":0,"destination":{"province":"北京","city":"北京市","county":"海淀区"},"destinationAreaId":8}
     * origin : 河南省洛阳市张午镇万亩中药材种植基地
     * category : {"title":"蜂蜜","unit":"g"}
     * isCollection : false
     * isLimitedPromotion : true
     * limit_quantity : 0
     * show_tag : 0
     * origin_anong_price : 70.00
     * groupon : {"id":0}
     * stock_num : 4000
     * status : 2
     * productTags : []
     * farmerDynamicInfo : {"picture_num":1,"content":"丹参蜜是采自中药材丹参的花酿造的纯天然蜂蜜，蜜色呈深琥珀色，食味甘甜，富蕴余味，富含多种维他命、氨基酸，活性酶等多种营养成分，营养价值很高。更具有丹参\u201c生新血、去恶血\u201d功效，特别适用于女性月经不调、行经腹痛等症。 具有舒经活血、降压安神之功效，同时可以辅助治疗高血压、肾病等。也适合中老年人服用。\n","pictures":["http://img.anong.com/image/FarmerDynamicPicture/picture/C8C12DED759309418AAB342C910BCB8B/146865508276977587.jpg@!thumbnail.jpg"],"timeDifference":"3天"}
     * hasReleaseDynamic : true
     * notification : 快递：默认发 百世汇通、天天快递
     规格：49元1瓶 、88元2瓶 、全部包邮！！
     包邮：不包括【新疆 、西藏】实际运费以提交订单后显示为准。
     收货：收到货后如有漏蜜、烂瓶等问题，请及时联系我。我个人手机/微信号：15516383539
     * parameter : {"id":881,"product_id":927,"standard_name":"丹参蜜","ingredients":"蜂蜜","food_addiitive":"无","packing_way":"瓶装","product_level":"一级","quality_guarantee_period":"24个月","manufacture_date":"2016年夏季","storage":"置阴凉干燥处，放于冰箱保鲜。","manufacturer":"","manufacturer_address":"河南省洛阳市","origin":"河南省洛阳市张午镇万亩中药材种植基地","manufacture_license":"","varieties":"丹参蜂蜜"}
     * detail : {"identification":"","origin":"","produce":"","nutrition":"","pick":"","more":""}
     * buyerDataArr : []
     * welfareProduct : false
     * anongInspectionContent : null
     * sellerName : 张丙宜
     * sellerAvatar : http://img.anong.com/image/IndividualMerchant/9/logo/143994361365602786.jpg@!thumbnail.jpg
     */

    private int id;
    private int shopId;
    private String title;
    private String desc;
    /**
     * count : 0
     * rating : 0
     * rating_class : 0
     */

    private ReviewBean review;
    private String price;
    private String unit;
    /**
     * id : 9
     * name : 张丙宜的农家院
     * user_name : 张丙宜
     * meiqia_id : null
     */

    private ShopBean shop;
    private String anongView;
    private String thumbnail;
    private String sales;
    private boolean isAnongRecommend;
    /**
     * baseShippingFee : 0
     * mode : 0
     * noFeeCount : 0
     * noFeeType : 0
     * noFeeMoney : 0
     * destination : {"province":"北京","city":"北京市","county":"海淀区"}
     * destinationAreaId : 8
     */

    private ShippingFeeBean shippingFee;
    private String origin;
    /**
     * title : 蜂蜜
     * unit : g
     */

    private CategoryBean category;
    private boolean isCollection;
    private boolean isLimitedPromotion;
    private int limit_quantity;
    private String show_tag;
    private String origin_anong_price;
    /**
     * id : 0
     */

    private GrouponBean groupon;
    private int stock_num;
    private int status;
    /**
     * picture_num : 1
     * content : 丹参蜜是采自中药材丹参的花酿造的纯天然蜂蜜，蜜色呈深琥珀色，食味甘甜，富蕴余味，富含多种维他命、氨基酸，活性酶等多种营养成分，营养价值很高。更具有丹参“生新血、去恶血”功效，特别适用于女性月经不调、行经腹痛等症。 具有舒经活血、降压安神之功效，同时可以辅助治疗高血压、肾病等。也适合中老年人服用。

     * pictures : ["http://img.anong.com/image/FarmerDynamicPicture/picture/C8C12DED759309418AAB342C910BCB8B/146865508276977587.jpg@!thumbnail.jpg"]
     * timeDifference : 3天
     */

    private FarmerDynamicInfoBean farmerDynamicInfo;
    private boolean hasReleaseDynamic;
    private String notification;
    /**
     * id : 881
     * product_id : 927
     * standard_name : 丹参蜜
     * ingredients : 蜂蜜
     * food_addiitive : 无
     * packing_way : 瓶装
     * product_level : 一级
     * quality_guarantee_period : 24个月
     * manufacture_date : 2016年夏季
     * storage : 置阴凉干燥处，放于冰箱保鲜。
     * manufacturer :
     * manufacturer_address : 河南省洛阳市
     * origin : 河南省洛阳市张午镇万亩中药材种植基地
     * manufacture_license :
     * varieties : 丹参蜂蜜
     */

    private ParameterBean parameter;
    /**
     * identification :
     * origin :
     * produce :
     * nutrition :
     * pick :
     * more :
     */

    private DetailBean detail;
    private boolean welfareProduct;
    private Object anongInspectionContent;
    private String sellerName;
    private String sellerAvatar;
    private List<String> pictures;
    private List<AnswerBean> latestReviews;
    /**
     * id : 1986
     * type : [丹参原蜜] 500g
     * anong_price : 49.00
     * stock_num : 2000
     * is_experience : 0
     * origin_anong_price : 70.00
     * available_quantity : 0
     */

    private List<SubProductsBean> subProducts;
    private List<?> productTags;
    private List<?> buyerDataArr;

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public boolean isAnongRecommend() {
        return isAnongRecommend;
    }

    public boolean isCollection() {
        return isCollection;
    }

    public boolean isLimitedPromotion() {
        return isLimitedPromotion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ReviewBean getReview() {
        return review;
    }

    public void setReview(ReviewBean review) {
        this.review = review;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ShopBean getShop() {
        return shop;
    }

    public void setShop(ShopBean shop) {
        this.shop = shop;
    }

    public String getAnongView() {
        return anongView;
    }

    public void setAnongView(String anongView) {
        this.anongView = anongView;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }



    public boolean isIsAnongRecommend() {
        return isAnongRecommend;
    }

    public void setIsAnongRecommend(boolean isAnongRecommend) {
        this.isAnongRecommend = isAnongRecommend;
    }

    public ShippingFeeBean getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(ShippingFeeBean shippingFee) {
        this.shippingFee = shippingFee;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public CategoryBean getCategory() {
        return category;
    }

    public void setCategory(CategoryBean category) {
        this.category = category;
    }

    public boolean isIsCollection() {
        return isCollection;
    }

    public void setIsCollection(boolean isCollection) {
        this.isCollection = isCollection;
    }

    public boolean isIsLimitedPromotion() {
        return isLimitedPromotion;
    }

    public void setIsLimitedPromotion(boolean isLimitedPromotion) {
        this.isLimitedPromotion = isLimitedPromotion;
    }

    public int getLimit_quantity() {
        return limit_quantity;
    }

    public void setLimit_quantity(int limit_quantity) {
        this.limit_quantity = limit_quantity;
    }

    public String getShow_tag() {
        return show_tag;
    }

    public void setShow_tag(String show_tag) {
        this.show_tag = show_tag;
    }

    public String getOrigin_anong_price() {
        return origin_anong_price;
    }

    public void setOrigin_anong_price(String origin_anong_price) {
        this.origin_anong_price = origin_anong_price;
    }

    public GrouponBean getGroupon() {
        return groupon;
    }

    public void setGroupon(GrouponBean groupon) {
        this.groupon = groupon;
    }

    public int getStock_num() {
        return stock_num;
    }

    public void setStock_num(int stock_num) {
        this.stock_num = stock_num;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public FarmerDynamicInfoBean getFarmerDynamicInfo() {
        return farmerDynamicInfo;
    }

    public void setFarmerDynamicInfo(FarmerDynamicInfoBean farmerDynamicInfo) {
        this.farmerDynamicInfo = farmerDynamicInfo;
    }

    public boolean isHasReleaseDynamic() {
        return hasReleaseDynamic;
    }

    public void setHasReleaseDynamic(boolean hasReleaseDynamic) {
        this.hasReleaseDynamic = hasReleaseDynamic;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public ParameterBean getParameter() {
        return parameter;
    }

    public void setParameter(ParameterBean parameter) {
        this.parameter = parameter;
    }

    public DetailBean getDetail() {
        return detail;
    }

    public void setDetail(DetailBean detail) {
        this.detail = detail;
    }

    public boolean isWelfareProduct() {
        return welfareProduct;
    }

    public void setWelfareProduct(boolean welfareProduct) {
        this.welfareProduct = welfareProduct;
    }

    public Object getAnongInspectionContent() {
        return anongInspectionContent;
    }

    public void setAnongInspectionContent(Object anongInspectionContent) {
        this.anongInspectionContent = anongInspectionContent;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerAvatar() {
        return sellerAvatar;
    }

    public void setSellerAvatar(String sellerAvatar) {
        this.sellerAvatar = sellerAvatar;
    }

    public List<String> getPictures() {
        return pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }

    public List<AnswerBean> getLatestReviews() {
        return latestReviews;
    }

    public void setLatestReviews(List<AnswerBean> latestReviews) {
        this.latestReviews = latestReviews;
    }

    public List<SubProductsBean> getSubProducts() {
        return subProducts;
    }

    public void setSubProducts(List<SubProductsBean> subProducts) {
        this.subProducts = subProducts;
    }

    public List<?> getProductTags() {
        return productTags;
    }

    public void setProductTags(List<?> productTags) {
        this.productTags = productTags;
    }

    public List<?> getBuyerDataArr() {
        return buyerDataArr;
    }

    public void setBuyerDataArr(List<?> buyerDataArr) {
        this.buyerDataArr = buyerDataArr;
    }

    public static class ReviewBean {
        private int count;
        private String rating;
        private int rating_class;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public int getRating_class() {
            return rating_class;
        }

        public void setRating_class(int rating_class) {
            this.rating_class = rating_class;
        }
    }

    public static class ShopBean {
        private int id;
        private String name;
        private String user_name;
        private Object meiqia_id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public Object getMeiqia_id() {
            return meiqia_id;
        }

        public void setMeiqia_id(Object meiqia_id) {
            this.meiqia_id = meiqia_id;
        }
    }

    public static class ShippingFeeBean {
        private int baseShippingFee;
        private int mode;
        private int noFeeCount;
        private int noFeeType;
        private int noFeeMoney;
        /**
         * province : 北京
         * city : 北京市
         * county : 海淀区
         */

        private DestinationBean destination;
        private int destinationAreaId;

        public int getBaseShippingFee() {
            return baseShippingFee;
        }

        public void setBaseShippingFee(int baseShippingFee) {
            this.baseShippingFee = baseShippingFee;
        }

        public int getMode() {
            return mode;
        }

        public void setMode(int mode) {
            this.mode = mode;
        }

        public int getNoFeeCount() {
            return noFeeCount;
        }

        public void setNoFeeCount(int noFeeCount) {
            this.noFeeCount = noFeeCount;
        }

        public int getNoFeeType() {
            return noFeeType;
        }

        public void setNoFeeType(int noFeeType) {
            this.noFeeType = noFeeType;
        }

        public int getNoFeeMoney() {
            return noFeeMoney;
        }

        public void setNoFeeMoney(int noFeeMoney) {
            this.noFeeMoney = noFeeMoney;
        }

        public DestinationBean getDestination() {
            return destination;
        }

        public void setDestination(DestinationBean destination) {
            this.destination = destination;
        }

        public int getDestinationAreaId() {
            return destinationAreaId;
        }

        public void setDestinationAreaId(int destinationAreaId) {
            this.destinationAreaId = destinationAreaId;
        }

        public static class DestinationBean {
            private String province;
            private String city;
            private String county;

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getCounty() {
                return county;
            }

            public void setCounty(String county) {
                this.county = county;
            }
        }
    }

    public static class CategoryBean {
        private String title;
        private String unit;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }
    }

    public static class GrouponBean {
        private int id;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static class FarmerDynamicInfoBean {
        private int picture_num;
        private String content;
        private String timeDifference;
        private List<String> pictures;

        public int getPicture_num() {
            return picture_num;
        }

        public void setPicture_num(int picture_num) {
            this.picture_num = picture_num;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getTimeDifference() {
            return timeDifference;
        }

        public void setTimeDifference(String timeDifference) {
            this.timeDifference = timeDifference;
        }

        public List<String> getPictures() {
            return pictures;
        }

        public void setPictures(List<String> pictures) {
            this.pictures = pictures;
        }
    }

    public static class ParameterBean {
        private int id;
        private int product_id;
        private String standard_name;
        private String ingredients;
        private String food_addiitive;
        private String packing_way;
        private String product_level;
        private String quality_guarantee_period;
        private String manufacture_date;
        private String storage;
        private String manufacturer;
        private String manufacturer_address;
        private String origin;
        private String manufacture_license;
        private String varieties;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getProduct_id() {
            return product_id;
        }

        public void setProduct_id(int product_id) {
            this.product_id = product_id;
        }

        public String getStandard_name() {
            return standard_name;
        }

        public void setStandard_name(String standard_name) {
            this.standard_name = standard_name;
        }

        public String getIngredients() {
            return ingredients;
        }

        public void setIngredients(String ingredients) {
            this.ingredients = ingredients;
        }

        public String getFood_addiitive() {
            return food_addiitive;
        }

        public void setFood_addiitive(String food_addiitive) {
            this.food_addiitive = food_addiitive;
        }

        public String getPacking_way() {
            return packing_way;
        }

        public void setPacking_way(String packing_way) {
            this.packing_way = packing_way;
        }

        public String getProduct_level() {
            return product_level;
        }

        public void setProduct_level(String product_level) {
            this.product_level = product_level;
        }

        public String getQuality_guarantee_period() {
            return quality_guarantee_period;
        }

        public void setQuality_guarantee_period(String quality_guarantee_period) {
            this.quality_guarantee_period = quality_guarantee_period;
        }

        public String getManufacture_date() {
            return manufacture_date;
        }

        public void setManufacture_date(String manufacture_date) {
            this.manufacture_date = manufacture_date;
        }

        public String getStorage() {
            return storage;
        }

        public void setStorage(String storage) {
            this.storage = storage;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getManufacturer_address() {
            return manufacturer_address;
        }

        public void setManufacturer_address(String manufacturer_address) {
            this.manufacturer_address = manufacturer_address;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getManufacture_license() {
            return manufacture_license;
        }

        public void setManufacture_license(String manufacture_license) {
            this.manufacture_license = manufacture_license;
        }

        public String getVarieties() {
            return varieties;
        }

        public void setVarieties(String varieties) {
            this.varieties = varieties;
        }
    }

    public static class DetailBean {
        private String identification;
        private String origin;
        private String produce;
        private String nutrition;
        private String pick;
        private String more;

        public String getIdentification() {
            return identification;
        }

        public void setIdentification(String identification) {
            this.identification = identification;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getProduce() {
            return produce;
        }

        public void setProduce(String produce) {
            this.produce = produce;
        }

        public String getNutrition() {
            return nutrition;
        }

        public void setNutrition(String nutrition) {
            this.nutrition = nutrition;
        }

        public String getPick() {
            return pick;
        }

        public void setPick(String pick) {
            this.pick = pick;
        }

        public String getMore() {
            return more;
        }

        public void setMore(String more) {
            this.more = more;
        }
    }
    public static class AnswerBean{
        private String rating;
        private String user;
        private String avatar_url;
        private String created_at;
        private String product_type;
        private List<ReviewsBean> product_reviews;

        public String getRating() {
            return rating;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public List<ReviewsBean> getProduct_reviews() {
            return product_reviews;
        }

        public void setProduct_reviews(List<ReviewsBean> product_reviews) {
            this.product_reviews = product_reviews;
        }

        public String getProduct_type() {
            return product_type;
        }

        public void setProduct_type(String product_type) {
            this.product_type = product_type;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }
    }
    public static class ReviewsBean{
        private String content;
        private List<CustomePicBean>productReviewPictures;
        private List<BossBean>productReviewReplies;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public List<CustomePicBean> getProductReviewPictures() {
            return productReviewPictures;
        }

        public void setProductReviewPictures(List<CustomePicBean> productReviewPictures) {
            this.productReviewPictures = productReviewPictures;
        }

        public List<BossBean> getProductReviewReplies() {
            return productReviewReplies;
        }

        public void setProductReviewReplies(List<BossBean> productReviewReplies) {
            this.productReviewReplies = productReviewReplies;
        }
    }
    public static class CustomePicBean{
        private String picture_thumbnail;

        public String getPicture_thumbnail() {
            return picture_thumbnail;
        }

        public void setPicture_thumbnail(String picture_thumbnail) {
            this.picture_thumbnail = picture_thumbnail;
        }
    }
    public static class BossBean{
        private String reply_content;

        public String getReply_content() {
            return reply_content;
        }

        public void setReply_content(String reply_content) {
            this.reply_content = reply_content;
        }
    }
    public static class SubProductsBean {
        private int id;
        private String type;
        private String anong_price;
        private int stock_num;
        private int is_experience;
        private String origin_anong_price;
        private int available_quantity;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAnong_price() {
            return anong_price;
        }

        public void setAnong_price(String anong_price) {
            this.anong_price = anong_price;
        }

        public int getStock_num() {
            return stock_num;
        }

        public void setStock_num(int stock_num) {
            this.stock_num = stock_num;
        }

        public int getIs_experience() {
            return is_experience;
        }

        public void setIs_experience(int is_experience) {
            this.is_experience = is_experience;
        }

        public String getOrigin_anong_price() {
            return origin_anong_price;
        }

        public void setOrigin_anong_price(String origin_anong_price) {
            this.origin_anong_price = origin_anong_price;
        }

        public int getAvailable_quantity() {
            return available_quantity;
        }

        public void setAvailable_quantity(int available_quantity) {
            this.available_quantity = available_quantity;
        }
    }
}
