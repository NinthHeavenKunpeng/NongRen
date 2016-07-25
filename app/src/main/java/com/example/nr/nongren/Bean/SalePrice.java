package com.example.nr.nongren.Bean;

/**
 * Created by hjw on 2016/7/18.
 */
public class SalePrice {
    private String id;
    private int type;
    private String start_time;
    private String end_time;
    private String sort_bonus;
    private String picture;
    private String url;

    public void setId(String id) {
        this.id = id;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setSort_bonus(String sort_bonus) {
        this.sort_bonus = sort_bonus;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public String getStart_time() {
        return start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public String getSort_bonus() {
        return sort_bonus;
    }

    public String getPicture() {
        return picture;
    }

    public String getUrl() {
        return url;
    }
}
