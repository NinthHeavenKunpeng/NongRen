package com.example.nr.nongren.Bean;

import java.util.List;

/**
 * Created by hjw on 2016/7/22.
 */
public class FarmerRelation {
    private int cid;
    private String userName;
    private String userMicroAvatar;
    private String content;
    private String timeDifference;
    private String praiseTimes;
    private int id;
    private  int shopId;
    private String productTitle;
    private String productfirstPicture;
    private int pictureNum;
    private String shopTitle;
    private List<pictures>list;

    private String shopfirstPicture;
    private String isPraised;

    public List<pictures> getList() {
        return list;
    }

    public void setList(List<pictures> list) {
        this.list = list;
    }

    public String getIsPraised() {
        return isPraised;
    }

    public void setIsPraised(String isPraised) {
        this.isPraised = isPraised;
    }


    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getUserMicroAvatar() {
        return userMicroAvatar;
    }

    public void setUserMicroAvatar(String userMicroAvatar) {
        this.userMicroAvatar = userMicroAvatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getPraiseTimes() {
        return praiseTimes;
    }

    public void setPraiseTimes(String praiseTimes) {
        this.praiseTimes = praiseTimes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getProductfirstPicture() {
        return productfirstPicture;
    }

    public void setProductfirstPicture(String productfirstPicture) {
        this.productfirstPicture = productfirstPicture;
    }

    public int getPictureNum() {
        return pictureNum;
    }

    public void setPictureNum(int pictureNum) {
        this.pictureNum = pictureNum;
    }

    public String getShopTitle() {
        return shopTitle;
    }

    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle;
    }

    public String getShopfirstPicture() {
        return shopfirstPicture;
    }

    public void setShopfirstPicture(String shopfirstPicture) {
        this.shopfirstPicture = shopfirstPicture;
    }
    public  static class pictures{
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
