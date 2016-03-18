package com.wise.baba.db.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table SUGGESTION.
 */
public class Suggestion {

    private Integer type;
    private String key;
    private String city;
    private String district;
    private java.util.Date date;

    public Suggestion() {
    }

    public Suggestion(Integer type, String key, String city, String district, java.util.Date date) {
        this.type = type;
        this.key = key;
        this.city = city;
        this.district = district;
        this.date = date;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

}
