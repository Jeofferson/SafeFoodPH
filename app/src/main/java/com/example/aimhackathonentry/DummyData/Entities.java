package com.example.aimhackathonentry.DummyData;

import com.example.aimhackathonentry.ObjectModels.Category;
import com.example.aimhackathonentry.ObjectModels.Feedback;
import com.example.aimhackathonentry.ObjectModels.Order;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.ObjectModels.Store;
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


    //region User list
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
    //endregion


    //region Category List
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
    //endregion


    // region Product List
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
                    "Cucumber",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fcucumber.jpg?alt=media&token=e9fca3ba-ff32-4805-af6a-3dc49d55282b",
                    Constants.FRUITS_AND_VEGETABLES,
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
            ),
            new Product(
                    10,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Dark Chocolate",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fdark_chocolate.jpg?alt=media&token=4bb6131c-07cd-4ef9-974b-e1736ae44325",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    11,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Eggs",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fegg.jpg?alt=media&token=8860d142-104d-4f11-9457-f3e1dafb1e07",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    12,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Eggplant",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Feggplant.jpg?alt=media&token=6c6c416b-d011-4dfe-a414-c0e81f7d1d7b",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    13,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Fish Sauce",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Ffish_sauce.jpg?alt=media&token=701de202-c7dd-4964-8baf-7f7f8b8a1a62",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    14,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Flour",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fflour.jpeg?alt=media&token=3c452fcf-35b6-4cc0-b894-5bac6a3dd759",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    15,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Galunggong",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fgalunggong.jpg?alt=media&token=324530dc-b69f-4131-b6a5-adf1d7b606ba",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    16,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Goat Meat",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fgoat.jpg?alt=media&token=6cb160ed-234c-4199-baae-a57a3ae24d40",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    17,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Jack 'n Jill Snacks",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fjack_jill_snack.jpg?alt=media&token=02bfed40-23c8-4299-8f36-8896a91308a6",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    18,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Juice",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fjuice.jpg?alt=media&token=6cd9d928-1b10-42f5-981d-1ac7d0e53ea1",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    19,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Mango",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fmango.jpg?alt=media&token=f17b8838-73f3-4d94-8eba-a68d1bc058c5",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    20,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Margarine",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fmargarine.jpg?alt=media&token=35ecd44b-0c8f-47f9-ae03-04a2f87f483b",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    21,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Milk",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fmilk.jpg?alt=media&token=15a988c5-d5ce-4763-bee7-7ad14329c3cc",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    22,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Milkfish",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fmilkfish.jpg?alt=media&token=f9d1a18f-8097-49f4-80be-a5862eb42381",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    23,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Nature Made B Complex",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fnature_made_b_complex.jpg?alt=media&token=810f8f83-77a1-42da-80ee-f055d563e60d",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    24,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Nuts",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fnuts.jpg?alt=media&token=f5b1a4fe-1fe5-4272-bae4-a3a42f0bce8b",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    25,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Olive Oil",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Folive_oil.jpg?alt=media&token=5cd024fb-9b73-42f8-b1e2-b9ca65868e59",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    26,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Pork",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fpork.jpg?alt=media&token=9a05c2d1-6721-47f2-9816-e538221732b1",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    27,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Poten Cee C",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fpoten_cee_c.jpeg?alt=media&token=cc4f1034-188a-46e9-8d7c-400a35418bcc",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    28,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Squid",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fpusit.jpg?alt=media&token=5144daab-51e4-4641-89c5-0dcabeb443c5",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    29,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Salmon",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsalmon.jpg?alt=media&token=76cef69e-3581-4b31-91d2-2728538f55e4",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    30,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Salt",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsalt.jpg?alt=media&token=b1b371b0-a9b0-41fe-98a4-68527d151515",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    31,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsitao.jpg?alt=media&token=61283526-4381-4337-996d-8577429777ec",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    32,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Softdrinks",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsoftdrinks.jpg?alt=media&token=a953b821-e3c2-4e34-86d0-66e17af2239a",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    33,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Soy",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsoy.jpeg?alt=media&token=aa1e3953-6ba6-4f13-a098-01b87bce9fc0",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    34,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Sugar",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsugar.jpg?alt=media&token=be3dc3bd-524b-4314-a750-1492daa6a4d4",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    35,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Tomatoe",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Ftomatoe.jpg?alt=media&token=58792ff1-eb7a-4c62-af99-f9da86de386b",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    36,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Tuna",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Ftuna.jpeg?alt=media&token=f93dd057-e714-4131-a525-0ff1de255962",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    37,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Vetsin",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fvetsin.jpeg?alt=media&token=f3910fc2-8ef3-426c-8d03-451d2569fd5c",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    38,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Vinegar",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fvinegar.png?alt=media&token=fb1dd2f4-fb7a-4a20-b9de-bdc4d2eb8ded",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    39,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Wilkins",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fwilkins.png?alt=media&token=32a9931e-d83c-4580-bddf-846596564657",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    40,
                    0,
                    "Jeofferson",
                    "Dela Peña",
                    userList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Yogurt",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fyogurt.jpg?alt=media&token=a61ed8fe-b763-4d1d-9a1c-6e053fbbbf58",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            )
    ));
    //endregion


    // region Trade Item List
    public static List<TradeItem> tradeItemList;
    // endregion


    // region Order List
    public static List<Order> orderList = new ArrayList<>(Arrays.asList(
            new Order(
                    0,
                    userList.get(0).getUserId(),
                    userList.get(0).getDisplayPicture(),
                    userList.get(0).getFirstName(),
                    userList.get(0).getLastName(),
                    productList.get(8).getProductId(),
                    productList.get(8).getProductDisplayPicture(),
                    productList.get(8).getProductName(),
                    productList.get(8).getPrice(),
                    4,
                    "Trade",
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus."
            ),
            new Order(
                    0,
                    userList.get(0).getUserId(),
                    userList.get(0).getDisplayPicture(),
                    userList.get(0).getFirstName(),
                    userList.get(0).getLastName(),
                    productList.get(5).getProductId(),
                    productList.get(5).getProductDisplayPicture(),
                    productList.get(5).getProductName(),
                    productList.get(5).getPrice(),
                    4,
                    "Trade",
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus."
            ),
            new Order(
                    0,
                    userList.get(0).getUserId(),
                    userList.get(0).getDisplayPicture(),
                    userList.get(0).getFirstName(),
                    userList.get(0).getLastName(),
                    productList.get(7).getProductId(),
                    productList.get(7).getProductDisplayPicture(),
                    productList.get(7).getProductName(),
                    productList.get(7).getPrice(),
                    4,
                    "Trade",
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus."
            ),
            new Order(
                    0,
                    userList.get(0).getUserId(),
                    userList.get(0).getDisplayPicture(),
                    userList.get(0).getFirstName(),
                    userList.get(0).getLastName(),
                    productList.get(4).getProductId(),
                    productList.get(4).getProductDisplayPicture(),
                    productList.get(4).getProductName(),
                    productList.get(4).getPrice(),
                    4,
                    "Trade",
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus."
            ),
            new Order(
                    0,
                    userList.get(0).getUserId(),
                    userList.get(0).getDisplayPicture(),
                    userList.get(0).getFirstName(),
                    userList.get(0).getLastName(),
                    productList.get(1).getProductId(),
                    productList.get(1).getProductDisplayPicture(),
                    productList.get(1).getProductName(),
                    productList.get(1).getPrice(),
                    4,
                    "Trade",
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus."
            )
    ));
    // endregion


    // region Feedback List
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
    // endregion


    // region Store List
    public static List<Store> storeList = new ArrayList<>(Arrays.asList(
            new Store(
                    0,
                    "Farmart",
                    "San Fabian",
                    "Pangasinan",
                    57,
                    48,
                    87,
                    4.7
            ),
            new Store(
                    1,
                    "Market Basket",
                    "San Fabian",
                    "Pangasinan",
                    57,
                    48,
                    87,
                    4.7
            ),
            new Store(
                    2,
                    "Fresh Stocks",
                    "San Fabian",
                    "Pangasinan",
                    57,
                    48,
                    87,
                    4.7
            ),
            new Store(
                    3,
                    "Greenshop",
                    "San Fabian",
                    "Pangasinan",
                    57,
                    48,
                    87,
                    4.7
            ),
            new Store(
                    4,
                    "Nature's Closet",
                    "San Fabian",
                    "Pangasinan",
                    57,
                    48,
                    87,
                    4.7
            )
    ));
    // endregion


}
