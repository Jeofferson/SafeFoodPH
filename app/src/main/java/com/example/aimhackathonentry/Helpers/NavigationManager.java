package com.example.aimhackathonentry.Helpers;

import android.content.Context;
import android.content.Intent;

import com.example.aimhackathonentry.Activities.LogIn;
import com.example.aimhackathonentry.Activities.MainActivity;
import com.example.aimhackathonentry.Activities.Register;

public class NavigationManager {


    public static void goToRegister(Context context) {

        Intent intent = new Intent(context, Register.class);
        context.startActivity(intent);

    }


    public static void goToLogIn(Context context) {

        Intent intent = new Intent(context, LogIn.class);
        context.startActivity(intent);

    }


    public static void goToMainActivity(Context context) {

        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);

    }


}
