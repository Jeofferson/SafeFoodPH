package com.example.aimhackathonentry.SessionVariables;

import androidx.fragment.app.Fragment;

import com.example.aimhackathonentry.ObjectModels.Category;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SuperGlobals {


    public static String currentTab;
    public static Fragment currentFragment;

    public static Fragment tab1;
    public static Fragment tab2;
    public static Fragment tab3;
    public static Fragment tab4;

    public static LinkedHashMap<String, ArrayList<Fragment>> tabLinkedHashMap = new LinkedHashMap<>();

    public static List<Category> categoryList = new ArrayList<>();


}
