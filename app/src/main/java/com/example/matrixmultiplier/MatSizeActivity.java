package com.example.matrixmultiplier;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MatSizeActivity extends AppCompatActivity {

    String sizeA, sizeB;

    TextView sizeMatAText, sizeMatBText;
    EditText sizeAInput, sizeBInput;
    Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat_size);

        //TEXT
        sizeMatAText = findViewById(R.id.sizeMatAText);
        sizeMatBText = findViewById(R.id.sizeMatBText);

        //SIZE INPUT
        sizeAInput   = findViewById(R.id.sizeAInput);
        sizeBInput   = findViewById(R.id.sizeBInput);

        //CONTINUE BUTTON
        continueButton = findViewById(R.id.continueButton);

        //LISTENERS
        continueButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                sizeA = sizeAInput.getText().toString();
                sizeB = sizeBInput.getText().toString();
            }
        });
    }
}
