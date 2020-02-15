package com.example.MetroVR;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void Hi(View view) {
        startActivity(new Intent(this, UnityPlayerActivity.class),
                ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
    }
}
