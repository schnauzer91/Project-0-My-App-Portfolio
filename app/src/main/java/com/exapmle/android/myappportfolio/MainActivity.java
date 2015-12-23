package com.exapmle.android.myappportfolio;

import android.content.Context;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My Portfolio App");

    }

    public void ButtonOneToast (View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my sportify streamer app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();
    }

    public void ButtonTwoToast (View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my football score app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();
    }

    public void ButtonThreeToast (View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my library app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();
    }

    public void ButtonFourToast (View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my 'BUILD IT BIGGER' app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();
    }

    public void ButtonFiveToast (View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my XYZ reader app!.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();
    }

    public void CapstoneButtonToast (View view) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my capstone app!.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();
    }




}
