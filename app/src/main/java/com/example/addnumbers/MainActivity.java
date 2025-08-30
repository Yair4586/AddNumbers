package com.example.addnumbers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView answer;
    Button btn;
    EditText etnum1,etnum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = findViewById(R.id.answer);
        btn = findViewById(R.id.btn);
    }
    public void onButtonClicked(View view){
        etnum1 = findViewById(R.id.num1);
        etnum2 = findViewById(R.id.num2);

        int num1 = Integer.parseInt(etnum1.getText().toString());
        int num2 = Integer.parseInt(etnum2.getText().toString());
        int sum = num1+num2;
        answer.setText(String.valueOf(sum));
    }
}