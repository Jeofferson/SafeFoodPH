package com.example.aimhackathonentry.ObjectModels;

public class Store {


    private int storeId;

    private String name;
    private String displayPicture;

    private String city;
    private String province;

    private int sold;
    private int traded;
    private int lent;

    private double rating;


    public Store(int storeId, String name, String displayPicture, String city, String province, int sold, int traded, int lent, double rating) {
        this.storeId = storeId;
        this.name = name;
        this.displayPicture = displayPicture;
        this.city = city;
        this.province = province;
        this.sold = sold;
        this.traded = traded;
        this.lent = lent;
        this.rating = rating;
    }


    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayPicture() {
        return displayPicture;
    }

    public void setDisplayPicture(String displayPicture) {
        this.displayPicture = displayPicture;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getTraded() {
        return traded;
    }

    public void setTraded(int traded) {
        this.traded = traded;
    }

    public int getLent() {
        return lent;
    }

    public void setLent(int lent) {
        this.lent = lent;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


}
