package com.smartdroidesign.colorcomplimenter2.ui.ui.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.smartdroidesign.colorcomplimenter2.R;

public class ComplimenterActivity extends AppCompatActivity {


    private TextView colorInputField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complimenter);


        Button goButton = findViewById(R.id.goButton);
        colorInputField = findViewById(R.id.colorField);


        // Intent towards FavouriteColorActivity
        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputColor = String.valueOf(colorInputField.getText());
                Intent intent = new Intent(ComplimenterActivity.this, FavouriteColorActivity.class);
                intent.putExtra("color", inputColor);
                startActivity(intent);
            }
        });
    }
}
