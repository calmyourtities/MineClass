package com.dannyyyy.mineclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SignInLoadingActivity extends AppCompatActivity {

    Thread loginThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        loginThread = new Thread(new Runnable() {
            @Override
            public void run() {
                android.os.SystemClock.sleep(3000);
                SignInActivity.ERROR_STATE = SignInActivity.ERROR_STATES.PASSWORD_INCORRECT;
                goBack();
            }
        });

        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_in_loading);

        //login: wait three seconds than say incorrect password
        loginThread.start();
    }

    public void goBack() {
        startActivity(new Intent(this, SignInActivity.class));
    }

}
