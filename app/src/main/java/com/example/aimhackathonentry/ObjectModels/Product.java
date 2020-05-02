package com.example.aimhackathonentry.ObjectModels;

public class Product {


    private int productId;

    private int sellerId;
    private String firstName;
    private String lastName;
    private String userDisplayPicture;
    private String address;

    private String productName;
    private String productDisplayPicture;
    private String category;
    private double price;
    private int quantity;
    private String description;
    private String paymentMethod;


    public Product(int productId, int sellerId, String firstName, String lastName, String userDisplayPicture, String address, String productName, String productDisplayPicture, String category, double price, int quantity, String description, String paymentMethod) {
        this.productId = productId;
        this.sellerId = sellerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userDisplayPicture = userDisplayPicture;
        this.address = address;
        this.productName = productName;
        this.productDisplayPicture = productDisplayPicture;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.paymentMethod = paymentMethod;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserDisplayPicture() {
        return userDisplayPicture;
    }

    public void setUserDisplayPicture(String userDisplayPicture) {
        this.userDisplayPicture = userDisplayPicture;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDisplayPicture() {
        return productDisplayPicture;
    }

    public void setProductDisplayPicture(String productDisplayPicture) {
        this.productDisplayPicture = productDisplayPicture;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


}
