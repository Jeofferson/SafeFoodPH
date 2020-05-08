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


    // region Sales
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
    // endregion


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
            ),
            new User(
                    1,
                    "user",
                    "user",
                    "John",
                    "Doe",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/user_display_picture%2Fuser2.jpg?alt=media&token=ac420363-35dc-4980-b1b1-15a4831298a7",
                    "Calasiao",
                    "Pangasinan"
            ),
            new User(
                    2,
                    "user",
                    "user",
                    "Jane",
                    "Doe",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/user_display_picture%2Fuser3.jpg?alt=media&token=e1a675be-0b95-4678-ac66-5dd050aa8269",
                    "Lingayen",
                    "Pangasinan"
            ),
            new User(
                    3,
                    "user",
                    "user",
                    "Maria",
                    "Dela Cruz",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/user_display_picture%2Fuser4.jpg?alt=media&token=056cc0bc-f965-4145-ac26-37681d22a434",
                    "Mangaldan",
                    "Pangasinan"
            ),
            new User(
                    4,
                    "user",
                    "user",
                    "Liza",
                    "Soberano",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/user_display_picture%2Fuser5.jpg?alt=media&token=442d81c6-04e7-452d-a849-5ae31327f3d0",
                    "Dagupan City",
                    "Pangasinan"
            )
    ));
    //endregion


    //region Category List
    public static List<Category> categoryList = new ArrayList<>(Arrays.asList(
            new Category(
                    0,
                    "Eatery",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Featery.jpg?alt=media&token=196adfa7-35dd-4e21-9d05-b6396be5de2b"
            ),
            new Category(
                    1,
                    "Greenhouse",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fgreenhouse.jpeg?alt=media&token=9498e78e-c26f-4f4e-a2d1-90babb78aac3"
            ),
            new Category(
                    2,
                    "Fruits and Vegetables",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_fruits_vegetables.jpg?alt=media&token=8b851835-1dad-4453-8d8c-2716db0ebf3f"
            ),
            new Category(
                    3,
                    "Fish and Marine Products",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_fish_marine.jpg?alt=media&token=8cef01bf-e839-4a72-af2d-8c1a0413cf17"
            ),
            new Category(
                    4,
                    "Meat and Poultry Products",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_meat_poultry.jpg?alt=media&token=cefcc7a1-d9bd-427c-a67b-56af3f1796f4"
            ),
            new Category(
                    5,
                    "Flour and Bakery Products",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_flour_bakery.jpg?alt=media&token=aab66107-01df-4d5f-8308-5552afe52944"
            ),
            new Category(
                    6,
                    "Beverage, Confectionery, and Dairy Foods",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_beverages.jpg?alt=media&token=a9260ce3-df6f-45dc-9741-7fe8136c4d35"
            ),
            new Category(
                    7,
                    "Food Condiments and Seasonings",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_food_condiments.jpg?alt=media&token=548377da-4d18-4e74-add9-6ff9162e287c"
            ),
            new Category(
                    8,
                    "Food Supplements, Bottled Water, and Snack Food",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_bottled_water.jpg?alt=media&token=cbeaf7fa-ae1c-4bfe-b4d5-368060b399b6"
            ),
            new Category(
                    9,
                    "Fats and Oils",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/category_image%2Fc_fats_oils.jpg?alt=media&token=81214a15-0045-408f-af74-fb3662d5ef22"
            )
    ));
    //endregion


    // region Store List
    public static List<Store> storeList = new ArrayList<>(Arrays.asList(
            new Store(
                    0,
                    "Farmart",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/store_display_picture%2Fstore1.png?alt=media&token=56a965d1-f3e0-441d-9e47-1860fe8499b6",
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
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/store_display_picture%2Fstore2.png?alt=media&token=1865333d-8d40-4aa6-9628-1bf1b2f51c50",
                    "Calasiao",
                    "Pangasinan",
                    57,
                    48,
                    87,
                    4.7
            ),
            new Store(
                    2,
                    "Fresh Stocks",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/store_display_picture%2Fstore3.png?alt=media&token=82ada26d-65af-4dc6-b912-61c2da555ec3",
                    "Lingayen",
                    "Pangasinan",
                    57,
                    48,
                    87,
                    4.7
            ),
            new Store(
                    3,
                    "Greenshop",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/store_display_picture%2Fstore4.png?alt=media&token=08d8a3b8-c116-4d1d-b331-e4dc7ded743f",
                    "Mangaldan",
                    "Pangasinan",
                    57,
                    48,
                    87,
                    4.7
            ),
            new Store(
                    4,
                    "Nature's Closet",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/store_display_picture%2Fstore5.png?alt=media&token=fa45e9c9-bf37-41aa-a06f-eec15bf41cb6",
                    "Dagupan City",
                    "Pangasinan",
                    57,
                    48,
                    87,
                    4.7
            )
    ));
    // endregion


    // region Product List
    public static List<Product> productList = new ArrayList<>(Arrays.asList(
            new Product(
                    0,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
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
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
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
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
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
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
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
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
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
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
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
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
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
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
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
                    storeList.get(1).getName(),
                    "",
                    storeList.get(1).getDisplayPicture(),
                    storeList.get(1).getCity(),
                    storeList.get(1).getProvince(),
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
                    storeList.get(1).getName(),
                    "",
                    storeList.get(1).getDisplayPicture(),
                    storeList.get(1).getCity(),
                    storeList.get(1).getProvince(),
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
                    storeList.get(1).getName(),
                    "",
                    storeList.get(1).getDisplayPicture(),
                    storeList.get(1).getCity(),
                    storeList.get(1).getProvince(),
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
                    storeList.get(1).getName(),
                    "",
                    storeList.get(1).getDisplayPicture(),
                    storeList.get(1).getCity(),
                    storeList.get(1).getProvince(),
                    "Eggs",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fegg.jpg?alt=media&token=8860d142-104d-4f11-9457-f3e1dafb1e07",
                    Constants.MEAT_AND_POULTRY_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    12,
                    0,
                    storeList.get(1).getName(),
                    "",
                    storeList.get(1).getDisplayPicture(),
                    storeList.get(1).getCity(),
                    storeList.get(1).getProvince(),
                    "Eggplant",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Feggplant.jpg?alt=media&token=6c6c416b-d011-4dfe-a414-c0e81f7d1d7b",
                    Constants.FRUITS_AND_VEGETABLES,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    13,
                    0,
                    storeList.get(1).getName(),
                    "",
                    storeList.get(1).getDisplayPicture(),
                    storeList.get(1).getCity(),
                    storeList.get(1).getProvince(),
                    "Fish Sauce",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Ffish_sauce.jpg?alt=media&token=701de202-c7dd-4964-8baf-7f7f8b8a1a62",
                    Constants.FOOD_CONDIMENTS_AND_SEASONINGS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    14,
                    0,
                    storeList.get(1).getName(),
                    "",
                    storeList.get(1).getDisplayPicture(),
                    storeList.get(1).getCity(),
                    storeList.get(1).getProvince(),
                    "Flour",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fflour.jpeg?alt=media&token=3c452fcf-35b6-4cc0-b894-5bac6a3dd759",
                    Constants.FLOUR_AND_BAKERY_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    15,
                    0,
                    storeList.get(1).getName(),
                    "",
                    storeList.get(1).getDisplayPicture(),
                    storeList.get(1).getCity(),
                    storeList.get(1).getProvince(),
                    "Galunggong",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fgalunggong.jpg?alt=media&token=324530dc-b69f-4131-b6a5-adf1d7b606ba",
                    Constants.FISH_AND_MARINE_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    16,
                    0,
                    storeList.get(1).getName(),
                    "",
                    storeList.get(1).getDisplayPicture(),
                    storeList.get(1).getCity(),
                    storeList.get(1).getProvince(),
                    "Goat Meat",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fgoat.jpg?alt=media&token=6cb160ed-234c-4199-baae-a57a3ae24d40",
                    Constants.MEAT_AND_POULTRY_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    17,
                    0,
                    storeList.get(2).getName(),
                    "",
                    storeList.get(2).getDisplayPicture(),
                    storeList.get(2).getCity(),
                    storeList.get(2).getProvince(),
                    "Jack 'n Jill Snacks",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fjack_jill_snack.jpg?alt=media&token=02bfed40-23c8-4299-8f36-8896a91308a6",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    18,
                    0,
                    storeList.get(2).getName(),
                    "",
                    storeList.get(2).getDisplayPicture(),
                    storeList.get(2).getCity(),
                    storeList.get(2).getProvince(),
                    "Juice",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fjuice.jpg?alt=media&token=6cd9d928-1b10-42f5-981d-1ac7d0e53ea1",
                    Constants.BEVERAGE_CONFECTIONERY_AND_DAIRY_FOODS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    19,
                    0,
                    storeList.get(2).getName(),
                    "",
                    storeList.get(2).getDisplayPicture(),
                    storeList.get(2).getCity(),
                    storeList.get(2).getProvince(),
                    "Mango",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fmango.jpg?alt=media&token=f17b8838-73f3-4d94-8eba-a68d1bc058c5",
                    Constants.FRUITS_AND_VEGETABLES,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    20,
                    0,
                    storeList.get(2).getName(),
                    "",
                    storeList.get(2).getDisplayPicture(),
                    storeList.get(2).getCity(),
                    storeList.get(2).getProvince(),
                    "Margarine",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fmargarine.jpg?alt=media&token=35ecd44b-0c8f-47f9-ae03-04a2f87f483b",
                    Constants.FLOUR_AND_BAKERY_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    21,
                    0,
                    storeList.get(2).getName(),
                    "",
                    storeList.get(2).getDisplayPicture(),
                    storeList.get(2).getCity(),
                    storeList.get(2).getProvince(),
                    "Milk",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fmilk.jpg?alt=media&token=15a988c5-d5ce-4763-bee7-7ad14329c3cc",
                    Constants.BEVERAGE_CONFECTIONERY_AND_DAIRY_FOODS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    22,
                    0,
                    storeList.get(2).getName(),
                    "",
                    storeList.get(2).getDisplayPicture(),
                    storeList.get(2).getCity(),
                    storeList.get(2).getProvince(),
                    "Milkfish",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fmilkfish.jpg?alt=media&token=f9d1a18f-8097-49f4-80be-a5862eb42381",
                    Constants.FISH_AND_MARINE_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    23,
                    0,
                    storeList.get(2).getName(),
                    "",
                    storeList.get(2).getDisplayPicture(),
                    storeList.get(2).getCity(),
                    storeList.get(2).getProvince(),
                    "Nature Made B Complex",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fnature_made_b_complex.jpg?alt=media&token=810f8f83-77a1-42da-80ee-f055d563e60d",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    24,
                    0,
                    storeList.get(2).getName(),
                    "",
                    storeList.get(2).getDisplayPicture(),
                    storeList.get(2).getCity(),
                    storeList.get(2).getProvince(),
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
                    storeList.get(3).getName(),
                    "",
                    storeList.get(3).getDisplayPicture(),
                    storeList.get(3).getCity(),
                    storeList.get(3).getProvince(),
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
                    storeList.get(3).getName(),
                    "",
                    storeList.get(3).getDisplayPicture(),
                    storeList.get(3).getCity(),
                    storeList.get(3).getProvince(),
                    "Pork",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fpork.jpg?alt=media&token=9a05c2d1-6721-47f2-9816-e538221732b1",
                    Constants.MEAT_AND_POULTRY_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    27,
                    0,
                    storeList.get(3).getName(),
                    "",
                    storeList.get(3).getDisplayPicture(),
                    storeList.get(3).getCity(),
                    storeList.get(3).getProvince(),
                    "Poten Cee C",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fpoten_cee_c.jpeg?alt=media&token=cc4f1034-188a-46e9-8d7c-400a35418bcc",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    28,
                    0,
                    storeList.get(3).getName(),
                    "",
                    storeList.get(3).getDisplayPicture(),
                    storeList.get(3).getCity(),
                    storeList.get(3).getProvince(),
                    "Squid",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fpusit.jpg?alt=media&token=5144daab-51e4-4641-89c5-0dcabeb443c5",
                    Constants.FISH_AND_MARINE_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    29,
                    0,
                    storeList.get(3).getName(),
                    "",
                    storeList.get(3).getDisplayPicture(),
                    storeList.get(3).getCity(),
                    storeList.get(3).getProvince(),
                    "Salmon",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsalmon.jpg?alt=media&token=76cef69e-3581-4b31-91d2-2728538f55e4",
                    Constants.FISH_AND_MARINE_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    30,
                    0,
                    storeList.get(3).getName(),
                    "",
                    storeList.get(3).getDisplayPicture(),
                    storeList.get(3).getCity(),
                    storeList.get(3).getProvince(),
                    "Salt",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsalt.jpg?alt=media&token=b1b371b0-a9b0-41fe-98a4-68527d151515",
                    Constants.FOOD_CONDIMENTS_AND_SEASONINGS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    31,
                    0,
                    storeList.get(3).getName(),
                    "",
                    storeList.get(3).getDisplayPicture(),
                    storeList.get(3).getCity(),
                    storeList.get(3).getProvince(),
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsitao.jpg?alt=media&token=61283526-4381-4337-996d-8577429777ec",
                    Constants.FRUITS_AND_VEGETABLES,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    32,
                    0,
                    storeList.get(3).getName(),
                    "",
                    storeList.get(3).getDisplayPicture(),
                    storeList.get(3).getCity(),
                    storeList.get(3).getProvince(),
                    "Softdrinks",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsoftdrinks.jpg?alt=media&token=a953b821-e3c2-4e34-86d0-66e17af2239a",
                    Constants.BEVERAGE_CONFECTIONERY_AND_DAIRY_FOODS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    33,
                    0,
                    storeList.get(4).getName(),
                    "",
                    storeList.get(4).getDisplayPicture(),
                    storeList.get(4).getCity(),
                    storeList.get(4).getProvince(),
                    "Soy",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsoy.jpeg?alt=media&token=aa1e3953-6ba6-4f13-a098-01b87bce9fc0",
                    Constants.FOOD_CONDIMENTS_AND_SEASONINGS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    34,
                    0,
                    storeList.get(4).getName(),
                    "",
                    storeList.get(4).getDisplayPicture(),
                    storeList.get(4).getCity(),
                    storeList.get(4).getProvince(),
                    "Sugar",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsugar.jpg?alt=media&token=be3dc3bd-524b-4314-a750-1492daa6a4d4",
                    Constants.BEVERAGE_CONFECTIONERY_AND_DAIRY_FOODS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    35,
                    0,
                    storeList.get(4).getName(),
                    "",
                    storeList.get(4).getDisplayPicture(),
                    storeList.get(4).getCity(),
                    storeList.get(4).getProvince(),
                    "Tomatoe",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Ftomatoe.jpg?alt=media&token=58792ff1-eb7a-4c62-af99-f9da86de386b",
                    Constants.FRUITS_AND_VEGETABLES,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    36,
                    0,
                    storeList.get(4).getName(),
                    "",
                    storeList.get(4).getDisplayPicture(),
                    storeList.get(4).getCity(),
                    storeList.get(4).getProvince(),
                    "Tuna",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Ftuna.jpeg?alt=media&token=f93dd057-e714-4131-a525-0ff1de255962",
                    Constants.FISH_AND_MARINE_PRODUCTS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    37,
                    0,
                    storeList.get(4).getName(),
                    "",
                    storeList.get(4).getDisplayPicture(),
                    storeList.get(4).getCity(),
                    storeList.get(4).getProvince(),
                    "Vetsin",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fvetsin.jpeg?alt=media&token=f3910fc2-8ef3-426c-8d03-451d2569fd5c",
                    Constants.FOOD_CONDIMENTS_AND_SEASONINGS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    38,
                    0,
                    storeList.get(4).getName(),
                    "",
                    storeList.get(4).getDisplayPicture(),
                    storeList.get(4).getCity(),
                    storeList.get(4).getProvince(),
                    "Vinegar",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fvinegar.png?alt=media&token=fb1dd2f4-fb7a-4a20-b9de-bdc4d2eb8ded",
                    Constants.FOOD_CONDIMENTS_AND_SEASONINGS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    39,
                    0,
                    storeList.get(4).getName(),
                    "",
                    storeList.get(4).getDisplayPicture(),
                    storeList.get(4).getCity(),
                    storeList.get(4).getProvince(),
                    "Wilkins",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fwilkins.png?alt=media&token=32a9931e-d83c-4580-bddf-846596564657",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    40,
                    0,
                    storeList.get(4).getName(),
                    "",
                    storeList.get(4).getDisplayPicture(),
                    storeList.get(4).getCity(),
                    storeList.get(4).getProvince(),
                    "Yogurt",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fyogurt.jpg?alt=media&token=a61ed8fe-b763-4d1d-9a1c-6e053fbbbf58",
                    Constants.FATS_AND_OILS,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    41,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
                    "Adobo",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/eatery_foods%2Fadobo.jpg?alt=media&token=c1cb90b6-20f1-4d86-bf51-6f9f7d69f1d5",
                    Constants.EATERY,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    42,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
                    "Menudo",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/eatery_foods%2Fmenudo.jpeg?alt=media&token=1052a9af-f4c4-4705-9445-82f08f121584",
                    Constants.EATERY,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    43,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
                    "Sinigang",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/eatery_foods%2Fsinigang.jpg?alt=media&token=16f1f74c-e62f-4e55-a8e6-15ec09b2ce7c",
                    Constants.EATERY,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    44,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
                    "Sisig",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/eatery_foods%2Fsisig.jpg?alt=media&token=07edfdcd-4fd9-49b1-9a45-7f459be7d4e0",
                    Constants.EATERY,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    45,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    storeList.get(0).getCity(),
                    storeList.get(0).getProvince(),
                    "Tinola",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/eatery_foods%2Ftinola.jpg?alt=media&token=7736df9e-4fe7-47ed-9798-b579886b4fc1",
                    Constants.EATERY,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            )
    ));
    //endregion


    // region Diet Food List
    public static List<Product> dietFoodList = new ArrayList<>(Arrays.asList(
            new Product(
                    0,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Absolute Drinking Water",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/healthy_diet_foods%2F30-minute-meals.jpg?alt=media&token=9ba0169f-eb50-451b-bd02-4892a5de36a5",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    0,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Absolute Drinking Water",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/healthy_diet_foods%2FTurmeric-Poached-Egg-with-Avocado-Toast-002.jpg?alt=media&token=031f82f5-1d69-4970-afcf-110772db0299",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    0,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Absolute Drinking Water",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/healthy_diet_foods%2FWhole_30_Chicken_Salad_010-sq.jpg?alt=media&token=69a97f9b-57a9-4d62-a71f-deaf4866fce2",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    0,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Absolute Drinking Water",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/healthy_diet_foods%2Fchicken-satay-salad.jpg?alt=media&token=cf1b9537-c12b-47a4-8e2b-54c15ce10726",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    0,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Absolute Drinking Water",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/healthy_diet_foods%2Fghk080116ykfeature02-1567609381.png?alt=media&token=1693fcbf-0f31-47e7-90f0-bfc99837c042",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    0,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Absolute Drinking Water",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/healthy_diet_foods%2Fhealthy-meal.jpg?alt=media&token=dc05bd02-ddce-4c2e-b690-03b9d32c5c5d",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    0,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Absolute Drinking Water",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/healthy_diet_foods%2Fimage.jpeg?alt=media&token=1266b74b-22d2-4e30-ac39-157019b86c68",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    0,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Absolute Drinking Water",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/healthy_diet_foods%2Fsalmon-bowls-10-600x900.jpg?alt=media&token=0f51868a-1440-47d9-8344-afca602801a9",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    0,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Absolute Drinking Water",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/healthy_diet_foods%2Funnamed.jpg?alt=media&token=ddf51d2b-df6c-4a74-b66a-6080ecfcac62",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            ),
            new Product(
                    0,
                    0,
                    storeList.get(0).getName(),
                    "",
                    storeList.get(0).getDisplayPicture(),
                    "San Fabian",
                    "Pangasinan",
                    "Absolute Drinking Water",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/healthy_diet_foods%2Fweight-loss-meal-plan.jpg?alt=media&token=345d6e2d-4979-472d-b34e-7a618d22cba5",
                    Constants.FOOD_SUPPLEMENT_BOTTLED_WATER_AND_SNACK_FOOD,
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            )
    ));
    // endregion


    // region Trade Item List
    public static List<TradeItem> tradeItemList;
    // endregion


    // region Order List
    public static List<Order> orderList = new ArrayList<>(Arrays.asList(
            new Order(
                    0,
                    userList.get(2).getUserId(),
                    userList.get(2).getDisplayPicture(),
                    userList.get(2).getFirstName(),
                    userList.get(2).getLastName(),
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
                    userList.get(1).getUserId(),
                    userList.get(1).getDisplayPicture(),
                    userList.get(1).getFirstName(),
                    userList.get(1).getLastName(),
                    productList.get(5).getProductId(),
                    productList.get(5).getProductDisplayPicture(),
                    productList.get(5).getProductName(),
                    productList.get(5).getPrice(),
                    2,
                    "Trade",
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus."
            ),
            new Order(
                    0,
                    userList.get(2).getUserId(),
                    userList.get(2).getDisplayPicture(),
                    userList.get(2).getFirstName(),
                    userList.get(2).getLastName(),
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
                    userList.get(3).getUserId(),
                    userList.get(3).getDisplayPicture(),
                    userList.get(3).getFirstName(),
                    userList.get(3).getLastName(),
                    productList.get(4).getProductId(),
                    productList.get(4).getProductDisplayPicture(),
                    productList.get(4).getProductName(),
                    productList.get(4).getPrice(),
                    7,
                    "Trade",
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus."
            ),
            new Order(
                    0,
                    userList.get(4).getUserId(),
                    userList.get(4).getDisplayPicture(),
                    userList.get(4).getFirstName(),
                    userList.get(4).getLastName(),
                    productList.get(1).getProductId(),
                    productList.get(1).getProductDisplayPicture(),
                    productList.get(1).getProductName(),
                    productList.get(1).getPrice(),
                    6,
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


}
