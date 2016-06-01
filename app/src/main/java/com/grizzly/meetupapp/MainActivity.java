package com.grizzly.meetupapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Views.Factories.PhoneViewFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(PhoneViewFactory.getLandingView(this));

        //TODO: LOOOOOTS OF STUFF!!!
    }
}
