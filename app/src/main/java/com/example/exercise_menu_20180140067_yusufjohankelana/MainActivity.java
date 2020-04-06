package com.example.exercise_menu_20180140067_yusufjohankelana;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Username, Password;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Submit = findViewById(R.id.btnok);
        Username = findViewById(R.id.masukkan_username);
        Password = findViewById(R.id.masukkan_password);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Username.getText().toString().equals("admin") && Password.getText().toString().equals("123")) {
                    Toast.makeText(getApplicationContext(),"Login Success",
                            Toast.LENGTH_LONG).show();
                } else  {
                    Toast.makeText(getApplicationContext(),"Password Salah",
                            Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
