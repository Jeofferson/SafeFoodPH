package com.example.aimhackathonentry.ObjectModels;

public class Order {


    private int orderId;

    private int buyerId;
    private String buyerDisplayPicture;
    private String firstName;
    private String lastName;

    private int productId;
    private String productDisplayPicture;
    private String productName;
    private double price;

    private int quantity;
    private String paymentMethod;
    private String additionalMessage;


    public Order(int orderId, int buyerId, String buyerDisplayPicture, String firstName, String lastName, int productId, String productDisplayPicture, String productName, double price, int quantity, String paymentMethod, String additionalMessage) {
        this.orderId = orderId;
        this.buyerId = buyerId;
        this.buyerDisplayPicture = buyerDisplayPicture;
        this.firstName = firstName;
        this.lastName = lastName;
        this.productId = productId;
        this.productDisplayPicture = productDisplayPicture;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.paymentMethod = paymentMethod;
        this.additionalMessage = additionalMessage;
    }


    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerDisplayPicture() {
        return buyerDisplayPicture;
    }

    public void setBuyerDisplayPicture(String buyerDisplayPicture) {
        this.buyerDisplayPicture = buyerDisplayPicture;
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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductDisplayPicture() {
        return productDisplayPicture;
    }

    public void setProductDisplayPicture(String productDisplayPicture) {
        this.productDisplayPicture = productDisplayPicture;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getAdditionalMessage() {
        return additionalMessage;
    }

    public void setAdditionalMessage(String additionalMessage) {
        this.additionalMessage = additionalMessage;
    }


}
