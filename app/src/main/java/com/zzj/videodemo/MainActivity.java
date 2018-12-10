package com.zzj.videodemo;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vise.utils.view.DialogUtil;
import com.vise.xsnow.permission.OnPermissionCallback;
import com.vise.xsnow.permission.PermissionManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PermissionManager.instance().request(this, new OnPermissionCallback() {
            @Override
            public void onRequestAllow(String permissionName) {
                TestMovieActivity.start(MainActivity.this);
            }

            @Override
            public void onRequestRefuse(String permissionName) {

            }

            @Override
            public void onRequestNoAsk(String permissionName) {

            }
        }, Manifest.permission.READ_EXTERNAL_STORAGE);
    }
}
