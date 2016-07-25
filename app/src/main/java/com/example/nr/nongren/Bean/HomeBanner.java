package com.example.nr.nongren.Bean;

/**
 * Created by hjw on 2016/7/19.
 */
public class HomeBanner {
    private String id;
    private String title;
    private int type;
    private String picture;
    private String url;
    private String start_time;
    private String end_time;
    private String sort_bonus;
    private String created_at;
    private String updated_at;

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public void setSort_bonus(String sort_bonus) {
        this.sort_bonus = sort_bonus;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getTitle() {
        return title;
    }

    public String getId() {
        return id;
    }

    public int getType() {
        return type;
    }

    public String getPicture() {
        return picture;
    }

    public String getUrl() {
        return url;
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

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }
}
