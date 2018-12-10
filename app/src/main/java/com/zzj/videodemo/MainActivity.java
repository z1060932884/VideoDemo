package com.zzj.videodemo;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.blankj.utilcode.util.LogUtils;
import com.vise.log.ViseLog;
import com.vise.log.inner.LogcatTree;
import com.vise.utils.view.DialogUtil;
import com.vise.xsnow.permission.OnPermissionCallback;
import com.vise.xsnow.permission.PermissionManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViseLog.getLogConfig()
                .configAllowLog(BuildConfig.DEBUG)//是否输出日志
                .configShowBorders(BuildConfig.DEBUG);//是否排版显示
        ViseLog.plant(new LogcatTree());//添加打印日志信息到Logcat的树
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
