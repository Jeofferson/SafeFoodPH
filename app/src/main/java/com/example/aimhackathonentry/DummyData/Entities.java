package com.example.aimhackathonentry.DummyData;

import com.example.aimhackathonentry.ObjectModels.Category;
import com.example.aimhackathonentry.ObjectModels.Feedback;
import com.example.aimhackathonentry.ObjectModels.Product;
import com.example.aimhackathonentry.ObjectModels.User;
import com.example.aimhackathonentry.R;

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
                    "Ampalaya",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fampalaya.jpg?alt=media&token=6c329230-52a3-4dbb-b464-1500bb3c06fd",
                    "Fruits and Vegetables",
                    70,
                    9,
                    "Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
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
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsitao.jpg?alt=media&token=61283526-4381-4337-996d-8577429777ec",
                    "Fruits and Vegetables",
                    70,
                    9,
                    "\"Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus. Lorem ipsum dolor sit amet, te cum discere bonorum civibus. Mei no nonumes inimicus splendide, cu noluisse invidunt necessitatibus est. Ei sit iriure numquam adversarium. At molestiae moderatius assueverit mei, at nam nulla quaestio pertinacia. Ei sanctus omnesque torquatos eos, ex has ubique erroribus.",
                    "Both"
            )
    ));


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
