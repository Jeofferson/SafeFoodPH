package com.example.aimhackathonentry.SessionVariables;

import com.example.aimhackathonentry.ObjectModels.Product;

import java.util.ArrayList;
import java.util.List;

public class SuperGlobalsInstanceForMyStoreShop {


    public static Product currentProduct;

    public static int orderQuantity;
    public static String paymentMethod;

    public static String additionalMessage;

    public static List<Product> productList = new ArrayList<>();


}
