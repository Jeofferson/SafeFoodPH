package com.example.aimhackathonentry.SessionVariables;

public class ConstantsVolley {


//    private static final String IP_ADDRESS = "192.168.1.83";
    private static final String IP_ADDRESS = "192.168.1.102";

    public static final String URL_IMAGES = String.format("http://%s/SafeFoodPH/images/", IP_ADDRESS);

    // Auth
    public static final String URL_LOGIN = String.format("http://%s/SafeFoodPH/crud/auth/login.php", IP_ADDRESS);
    public static final String URL_REGISTER = String.format("http://%s/SafeFoodPH/crud/auth/register.php", IP_ADDRESS);
    public static final String URL_CHECK_FOR_UPDATES_IN_USER = String.format("http://%s/SafeFoodPH/crud/auth/check_for_updates_in_user.php", IP_ADDRESS);

    // Create
    public static final String URL_CREATE_ORDER = String.format("http://%s/SafeFoodPH/crud/create/create_order.php", IP_ADDRESS);

    // Retrieve
    public static final String URL_RETRIEVE_PRODUCTS = String.format("http://%s/SafeFoodPH/crud/retrieve/retrieve_products.php", IP_ADDRESS);
    public static final String URL_RETRIEVE_ORDERS = String.format("http://%s/SafeFoodPH/crud/retrieve/retrieve_orders.php", IP_ADDRESS);


}
