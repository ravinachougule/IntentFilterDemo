package com.example.simpleactivity;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    Button ok;
    //activityStateCheck ob1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok=(Button)findViewById(R.id.btnOk);
        //ob1=new activityStateCheck();
        Demo ob=new Demo();
        ob.call();
    }
   /* public void registerActivityLifecycleCallbacks(Application.ActivityLifecycleCallbacks acivity,Bundle bundle){
        acivity.onActivityCreated(this,bundle);
        acivity.onActivityStarted(this);

    }*/

/*  @Override
    protected void onStart() {
        super.onStart();
      ob1=new activityStateCheck();
      this.registerActivityLifecycleCallbacks(ob1);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }*/
}
