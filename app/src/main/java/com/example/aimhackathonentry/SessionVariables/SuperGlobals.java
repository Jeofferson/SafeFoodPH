package com.example.aimhackathonentry.SessionVariables;

import androidx.fragment.app.Fragment;

import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.ObjectModels.User;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SuperGlobals {


    public static String currentTab;
    public static Fragment currentFragment;

    public static User currentUser;
    public static Product currentProduct;

    public static LinkedHashMap<String, ArrayList<Fragment>> tabLinkedHashMap = new LinkedHashMap<>();

    public static List<Product> productList = new ArrayList<>();


}
