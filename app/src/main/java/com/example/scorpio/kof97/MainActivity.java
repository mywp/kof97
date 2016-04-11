package com.example.scorpio.kof97;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int blood=100;
    private TextView tv_blood;

    /*默认情况下横屏切换activity会被销毁后重新创建。*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_blood = (TextView) findViewById(R.id.tv_blood);
    }

    public void click(View view) {
        blood--;
        tv_blood.setText("对方的生命值：" +blood);
        if (blood < 0) {
            Toast.makeText(this, "K.O.!", Toast.LENGTH_LONG).show();
        }
    }
    
    //被销毁的时候调用的方法

    @Override
    protected void onDestroy() {
        System.out.println("onDestroy");
        super.onDestroy();
    }
    
    //当activity界面用户可见的时候调用的方法
    @Override
    protected void onStart() {
        System.out.println("onStart");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        System.out.println("onRestart");
        super.onRestart();
    }

    //当activity界面用户不可见的时候调用的方法
    @Override
    protected void onStop() {
        System.out.println("onStop");
        super.onStop();
    }

    //界面开始获取到焦点对应的方法。 (界面按钮可以被点击，文本框可以输入内容）
    @Override
    protected void onResume() {
        System.out.println("onResume");
        super.onResume();
    }
    
    //界面失去焦点对应的方法（暂停）（按钮不可被点击，文本框不可输入内容，但是界面用户仍然能看见）
    @Override
    protected void onPause() {
        System.out.println("onPause");
        super.onPause();
    }
}
