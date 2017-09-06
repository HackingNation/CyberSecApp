package com.example.anthony.cybersecapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBox,checkBox2;
    private Button button;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);

        checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked() && !checkBox2.isChecked()){
                    Intent intent = new Intent(MainActivity.this, first.class);
                    startActivity(intent);
                }
                else if(checkBox2.isChecked() && !checkBox.isChecked()){
                    Intent intent = new Intent(MainActivity.this, second.class);
                    startActivity(intent);
                }
                else if(checkBox.isChecked() && checkBox2.isChecked()){
                    Intent intent = new Intent(MainActivity.this, third.class);
                    startActivity(intent);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.action_settings:
                intent = new Intent(MainActivity.this, info.class);
                startActivity(intent);
                return true;

            case R.id.action_favorite:
                intent = new Intent(MainActivity.this, help.class);
                startActivity(intent);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
