package com.example.aimhackathonentry.SessionVariables;

import androidx.fragment.app.Fragment;

import com.example.aimhackathonentry.ObjectModels.Category;
import com.example.aimhackathonentry.ObjectModels.Feedback;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.ObjectModels.TradeItem;
import com.example.aimhackathonentry.ObjectModels.User;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SuperGlobals {


    public static boolean shouldCheckForUpdatesInUser = false;

    public static String currentTab;
    public static Fragment currentFragment;

    public static Fragment tab1;
    public static Fragment tab2;
    public static Fragment tab3;

    public static User currentUser;
    public static Product currentProduct;

    public static int orderQuantity;
    public static String paymentMethod;

    public static String additionalMessage;

    public static LinkedHashMap<String, ArrayList<Fragment>> tabLinkedHashMap = new LinkedHashMap<>();

    public static List<Product> productList = new ArrayList<>();
    public static List<Feedback> feedbackList = new ArrayList<>();
    public static List<Category> categoryList = new ArrayList<>();
    public static List<TradeItem> tradeItemList = new ArrayList<>();


}
