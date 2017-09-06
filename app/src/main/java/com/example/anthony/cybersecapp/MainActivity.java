package com.example.anthony.cybersecapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox,checkBox2;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked()){
                    Intent intent = new Intent(MainActivity.this, first.class);
                    startActivity(intent);
                }
                else if(checkBox2.isChecked()){
                    Intent intent = new Intent(MainActivity.this, first.class);
                    startActivity(intent);
                }
            }
        });

    }
}
