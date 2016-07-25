package com.example.nr.nongren.Bean;

import java.util.List;

/**
 * Created by hjw on 2016/7/19.
 */
public class FarmerCircle {

    /**
     * id : 775
     * userId : 9369
     * userType : 2
     * userName : 王之峰
     * userMicroAvatar : http://img.anong.com/image/IndividualMerchant/144/logo/14487991944123206.JPG@!micro.jpg
     * pictures : ["http://img.anong.com/image/FarmerDynamicPicture/picture/2F2BA9FB21F343FBADAB8C217950898B/146889519958129952.jpg@!thumbnail.jpg","http://img.anong.com/image/FarmerDynamicPicture/picture/5034872997BC9DDD65F89D399FEAE696/146889521687212004.jpg@!thumbnail.jpg","http://img.anong.com/image/FarmerDynamicPicture/picture/3D92E617D9919C14F5A870A845BB1C19/146889522231740620.jpg@!thumbnail.jpg"]
     * timeDifference : 1小时
     * content : 我们的生活充满阳光，灿烂的日子，多么的辉煌！亲们，期待你们光临我的小作坊
     * shopId : 143
     */

    private List<FarmerDynamicInfoBean> farmerDynamicInfo;

    public List<FarmerDynamicInfoBean> getFarmerDynamicInfo() {
        return farmerDynamicInfo;
    }

    public void setFarmerDynamicInfo(List<FarmerDynamicInfoBean> farmerDynamicInfo) {
        this.farmerDynamicInfo = farmerDynamicInfo;
    }

    public static class FarmerDynamicInfoBean {
        private int id;
        private int userId;
        private int userType;
        private String userName;
        private String userMicroAvatar;
        private String timeDifference;
        private String content;
        private int shopId;
        private List<String> pictures;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getUserType() {
            return userType;
        }

        public void setUserType(int userType) {
            this.userType = userType;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserMicroAvatar() {
            return userMicroAvatar;
        }

        public void setUserMicroAvatar(String userMicroAvatar) {
            this.userMicroAvatar = userMicroAvatar;
        }

        public String getTimeDifference() {
            return timeDifference;
        }

        public void setTimeDifference(String timeDifference) {
            this.timeDifference = timeDifference;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getShopId() {
            return shopId;
        }

        public void setShopId(int shopId) {
            this.shopId = shopId;
        }

        public List<String> getPictures() {
            return pictures;
        }

        public void setPictures(List<String> pictures) {
            this.pictures = pictures;
        }
    }
}
