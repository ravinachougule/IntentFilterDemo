package com.example.intentfilterjava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void workWithIntent(View view){
        call();
    }
    public void sample(){
        Intent intent=new Intent();
        intent.setAction("com.example.action.COMMON");
        intent.setData(Uri.parse("tel:123456"));
        startActivity(intent);
    }
    public void dial(){
        Intent intent=new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }
    public void call(){
        Intent intent=new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel://9175110108"));
        startActivity(intent);
    }
    public void web(){
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.google.com"));
        startActivity(intent);
    }
    public void route(){
        String uri=String.format(Locale.ENGLISH,"https://maps.google.com");
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
        intent.setPackage("com.google.android.app.maps");
        startActivity(intent);
    }

}