package com.muhammadmoeezkhan.lifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.muhammadmoeezkhan.lifecycledemo.databinding.ActivityAwayBinding;

public class AwayActivity extends AppCompatActivity {

    //Member Variable
    private ActivityAwayBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAwayBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        HomeActivity.writeToLog("AwayActivity","onCreate");
    }

    //All Android LifeCycle Methods
    //And their visual representations

    @Override
    protected void onStart() {
        super.onStart();
        HomeActivity.writeToLog("AwayActivity","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        HomeActivity.writeToLog("AwayActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        HomeActivity.writeToLog("AwayActivity","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        HomeActivity.writeToLog("AwayActivity", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        HomeActivity.writeToLog("AwayActivity", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        HomeActivity.writeToLog("AwayActivity", "onDestroy");
    }
}