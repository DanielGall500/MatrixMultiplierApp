package com.example.matrixmultiplier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Continue Button
        Button continueButton = findViewById(R.id.continueButton);

        //Click Handling
        continueButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent moveToMatSizeActivity = new Intent(MainActivity.this, MatSizeActivity.class);
                startActivity(moveToMatSizeActivity);
            }
        });

    }
}
