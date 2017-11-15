package com.dannyyyy.mineclass;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class SignInActivity extends AppCompatActivity {

    public static String USER_username, USER_encryptedPassword;

    public enum ERROR_STATES {
        NO_ERROR,
        PASSWORD_INCORRECT,
        NO_INTERNET_CONNECTION,
        FORGOT_PASSWORD,
        UNKNOWN_ERROR
    };

    public static ERROR_STATES ERROR_STATE = ERROR_STATES.NO_ERROR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_in);

        if(ERROR_STATE == ERROR_STATES.PASSWORD_INCORRECT) {
            //show an error or somethin
        }
    }

    public void signIn(View v) {
        startActivity(new Intent(this, SignInLoadingActivity.class));
    }
}