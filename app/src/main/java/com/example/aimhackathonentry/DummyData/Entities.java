package com.example.aimhackathonentry.DummyData;

import com.example.aimhackathonentry.ObjectModels.Category;
import com.example.aimhackathonentry.ObjectModels.Feedback;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.ObjectModels.TradeItem;
import com.example.aimhackathonentry.ObjectModels.User;
import com.example.aimhackathonentry.R;
import com.example.aimhackathonentry.SessionVariables.Constants;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Entities {




    public static int[][][] sales = {
            {
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0},
                    {0, 0, 0},
            }
    };




    // User
    public static List<User> userList = new ArrayList<>(Arrays.asList(
            new User(
                    0,
                    "user",
                    "user",
                    "Jeofferson",
                    "Dela Peña",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/user_display_picture%2Fjeofferson.jpg?alt=media&token=a5e1bb2f-5951-49a1-8fc4-a6163590fc0a",
                    "San Fabian",
                    "Pangasinan"
            )
    ));




    // Category
    public static List<Category> categoryList = new ArrayList<>(Arrays.asList(
            new Category(
                    0,
                    "Fruits and Vegetables",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_fruits_vegetables.jpg?alt=media&token=8b851835-1dad-4453-8d8c-2716db0ebf3f"
            ),
            new Category(
                    1,
                    "Fish and Marine Products",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_fish_marine.jpg?alt=media&token=8cef01bf-e839-4a72-af2d-8c1a0413cf17"
            ),
            new Category(
                    2,
                    "Meat and Poultry Products",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_meat_poultry.jpg?alt=media&token=cefcc7a1-d9bd-427c-a67b-56af3f1796f4"
            ),
            new Category(
                    3,
                    "Flour and Bakery Products",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_flour_bakery.jpg?alt=media&token=aab66107-01df-4d5f-8308-5552afe52944"
            ),
            new Category(
                    4,
                    "Beverage, Confectionery, and Dairy Foods",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_beverages.jpg?alt=media&token=a9260ce3-df6f-45dc-9741-7fe8136c4d35"
            ),
            new Category(
                    5,
                    "Food Condiments and Seasonings",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_food_condiments.jpg?alt=media&token=548377da-4d18-4e74-add9-6ff9162e287c"
            ),
            new Category(
                    6,
                    "Food Supplements, Bottled Water, and Snack Food",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_bottled_water.jpg?alt=media&token=cbeaf7fa-ae1c-4bfe-b4d5-368060b399b6"
            ),
            new Category(
                    7,
                    "Fats and Oils",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_fats_oils.jpg?alt=media&token=81214a15-0045-408f-af74-fb3662d5ef22"
            )
    ));




    // Product
    public static List<Product> productList = new ArrayList<>(Arrays.asList(
            new Product(
                    0,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Absolute Drinking Water",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fabsolute.png?alt=media&token=e8531678-08fc-4ca7-ab20-9106d45cfb04",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    1,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Alcoholic Drinks",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Falcohol.jpg?alt=media&token=2b1f93b9-3fd5-4aba-8164-20f2cc71ab15",
                    Constants.BEVERAGE_CONFECTIONERY_AND_DAIRY_FOODS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    2,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Bitter Gourd",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fampalaya.jpg?alt=media&token=6c329230-52a3-4dbb-b464-1500bb3c06fd",
                    Constants.FRUITS_AND_VEGETABLES,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    3,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Baking Powder",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fbaking_powder.jpg?alt=media&token=8792f25f-b278-4a70-947a-9df926ef2cfc",
                    Constants.FLOUR_AND_BAKERY_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    4,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Baking Soda",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fbaking_soda.jpeg?alt=media&token=e5981ad3-d3ef-4e92-a8e8-d657a37cd5aa",
                    Constants.FLOUR_AND_BAKERY_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    5,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Banana",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fbanana.jpg?alt=media&token=b32a7e9c-72df-4bd9-8862-a7f93727728e",
                    Constants.FRUITS_AND_VEGETABLES,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    6,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Beef",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fbeef.jpg?alt=media&token=c3349d03-a39e-4d30-b8a4-3350b0e22a1a",
                    Constants.MEAT_AND_POULTRY_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    7,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Cheese",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fcheese.jpg?alt=media&token=29885cd2-72aa-4ad3-af22-2992ff51c2b9",
                    Constants.FLOUR_AND_BAKERY_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    8,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Chicken",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fchicken.jpg?alt=media&token=cea9ab27-31ff-490f-8976-d05e50fd2a5b",
                    Constants.MEAT_AND_POULTRY_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    9,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Coconut Oil",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fcoconut_oil.jpg?alt=media&token=62be13af-7d1b-49d1-b6c1-ba0db12b17dd",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            )
    ));




    public static List<TradeItem> tradeItemList;




    public static List<Feedback> feedbackList = new ArrayList<>(Arrays.asList(
            new Feedback(
                    0,
                    5,
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus."
            ),
            new Feedback(
                    0,
                    4,
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus."
            ),
            new Feedback(
                    0,
                    5,
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus."
            ),
            new Feedback(
                    0,
                    3,
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus."
            ),
            new Feedback(
                    0,
                    4,
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus."
            )
    ));




}
