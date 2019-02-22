package com.catapp.application.parketlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.leinardi.android.speeddial.SpeedDialActionItem;
import com.leinardi.android.speeddial.SpeedDialView;

public class activityCar extends AppCompatActivity {

    SpeedDialView speedDialView = findViewById(R.id.speedDial);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        speedDialView.addActionItem(
                new SpeedDialActionItem.Builder(R.id.fab_link, R.drawable.ic_link_white_24dp)
                        .create()
        );
    }
}
