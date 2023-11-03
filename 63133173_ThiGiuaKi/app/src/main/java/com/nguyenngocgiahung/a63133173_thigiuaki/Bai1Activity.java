package com.nguyenngocgiahung.a63133173_thigiuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bai1Activity extends AppCompatActivity {

    EditText editWeight,editHeight;
    Button btn;
    TextView kq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai1);
        EditText editTextWeight = findViewById(R.id.weight);
        EditText editTextHeight = findViewById(R.id.height);
        Button button = findViewById(R.id.btn);
        TextView textView = findViewById(R.id.kq);

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