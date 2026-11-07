package com.example.android_lab_class;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);

        EditText name_edit1 = findViewById(R.id.fname_edit);
        Button bt1 = findViewById(R.id.savebt);

        bt1.setOnClickListener(v -> {
            String namesame = name_edit1.getText().toString();
            Toast.makeText(getApplicationContext(), "welcome " + namesame,
                    Toast.LENGTH_LONG).show();
        });
    }
}
