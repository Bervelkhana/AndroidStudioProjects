package com.example.bmi_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class MainActivity extends AppCompatActivity {
    EditText editHeight, editWeight;
    Button btn;
    TextView BMI, sta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText editTextWeight = findViewById(R.id.weight);
        EditText editTextHeight = findViewById(R.id.height);
        Button button = findViewById(R.id.btn);
        TextView textView = findViewById(R.id.BMI);
        TextView textView1 = findViewById(R.id.sta);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float weight =Float.parseFloat(String.valueOf(editTextWeight.getText()));
                float height =Float.parseFloat(String.valueOf(editTextHeight.getText()));
                float bmi = weight / (height * height);
                textView.setText(String.valueOf(bmi));
            }
        });

    }
}
