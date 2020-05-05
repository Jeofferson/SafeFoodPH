package com.example.aimhackathonentry.DummyData;

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
                    "A fruiting vine that belongs to family of Cucurbitaceae, ampalaya is alsoa called bitter melon for its taste (due to the presence of a substance known as momorcidin). In the Philippines, its fruits is eaten as vegetable; usually combined with other vegetables or sautéed alone",
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
                    "A fruiting vine that belongs to family of Cucurbitaceae, ampalaya is alsoa called bitter melon for its taste (due to the presence of a substance known as momorcidin). In the Philippines, its fruits is eaten as vegetable; usually combined with other vegetables or sautéed alone",
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
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fampalaya.jpg?alt=media&token=6c329230-52a3-4dbb-b464-1500bb3c06fd",
                    "Fruits and Vegetables",
                    70,
                    9,
                    "A fruiting vine that belongs to family of Cucurbitaceae, ampalaya is alsoa called bitter melon for its taste (due to the presence of a substance known as momorcidin). In the Philippines, its fruits is eaten as vegetable; usually combined with other vegetables or sautéed alone",
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
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsitao.jpg?alt=media&token=61283526-4381-4337-996d-8577429777ec",
                    "Fruits and Vegetables",
                    70,
                    9,
                    "A fruiting vine that belongs to family of Cucurbitaceae, ampalaya is alsoa called bitter melon for its taste (due to the presence of a substance known as momorcidin). In the Philippines, its fruits is eaten as vegetable; usually combined with other vegetables or sautéed alone",
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
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fampalaya.jpg?alt=media&token=6c329230-52a3-4dbb-b464-1500bb3c06fd",
                    "Fruits and Vegetables",
                    70,
                    9,
                    "A fruiting vine that belongs to family of Cucurbitaceae, ampalaya is alsoa called bitter melon for its taste (due to the presence of a substance known as momorcidin). In the Philippines, its fruits is eaten as vegetable; usually combined with other vegetables or sautéed alone",
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
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsitao.jpg?alt=media&token=61283526-4381-4337-996d-8577429777ec",
                    "Fruits and Vegetables",
                    70,
                    9,
                    "A fruiting vine that belongs to family of Cucurbitaceae, ampalaya is alsoa called bitter melon for its taste (due to the presence of a substance known as momorcidin). In the Philippines, its fruits is eaten as vegetable; usually combined with other vegetables or sautéed alone",
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
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fampalaya.jpg?alt=media&token=6c329230-52a3-4dbb-b464-1500bb3c06fd",
                    "Fruits and Vegetables",
                    70,
                    9,
                    "A fruiting vine that belongs to family of Cucurbitaceae, ampalaya is alsoa called bitter melon for its taste (due to the presence of a substance known as momorcidin). In the Philippines, its fruits is eaten as vegetable; usually combined with other vegetables or sautéed alone",
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
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsitao.jpg?alt=media&token=61283526-4381-4337-996d-8577429777ec",
                    "Fruits and Vegetables",
                    70,
                    9,
                    "A fruiting vine that belongs to family of Cucurbitaceae, ampalaya is alsoa called bitter melon for its taste (due to the presence of a substance known as momorcidin). In the Philippines, its fruits is eaten as vegetable; usually combined with other vegetables or sautéed alone",
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
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fampalaya.jpg?alt=media&token=6c329230-52a3-4dbb-b464-1500bb3c06fd",
                    "Fruits and Vegetables",
                    70,
                    9,
                    "A fruiting vine that belongs to family of Cucurbitaceae, ampalaya is alsoa called bitter melon for its taste (due to the presence of a substance known as momorcidin). In the Philippines, its fruits is eaten as vegetable; usually combined with other vegetables or sautéed alone",
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
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsitao.jpg?alt=media&token=61283526-4381-4337-996d-8577429777ec",
                    "Fruits and Vegetables",
                    70,
                    9,
                    "A fruiting vine that belongs to family of Cucurbitaceae, ampalaya is alsoa called bitter melon for its taste (due to the presence of a substance known as momorcidin). In the Philippines, its fruits is eaten as vegetable; usually combined with other vegetables or sautéed alone",
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
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fampalaya.jpg?alt=media&token=6c329230-52a3-4dbb-b464-1500bb3c06fd",
                    "Fruits and Vegetables",
                    70,
                    9,
                    "A fruiting vine that belongs to family of Cucurbitaceae, ampalaya is alsoa called bitter melon for its taste (due to the presence of a substance known as momorcidin). In the Philippines, its fruits is eaten as vegetable; usually combined with other vegetables or sautéed alone",
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
                    "Sitao",
                    "https://firebasestorage.googleapis.com/v0/b/safefoodph.appspot.com/o/product_display_picture%2Fsitao.jpg?alt=media&token=61283526-4381-4337-996d-8577429777ec",
                    "Fruits and Vegetables",
                    70,
                    9,
                    "A fruiting vine that belongs to family of Cucurbitaceae, ampalaya is alsoa called bitter melon for its taste (due to the presence of a substance known as momorcidin). In the Philippines, its fruits is eaten as vegetable; usually combined with other vegetables or sautéed alone",
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
