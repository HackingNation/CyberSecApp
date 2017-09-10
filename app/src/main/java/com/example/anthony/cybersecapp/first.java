package com.example.anthony.cybersecapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Israel on 6/9/17.
 */

public class first extends AppCompatActivity {

    private Button button;
    private LinearLayout scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        Bundle extras = getIntent().getExtras();
        List<String> respuestaFinal = extras.getStringArrayList("respuestas");
        scrollView = (LinearLayout) findViewById(R.id.scrollView);

        for(int i = 0;i < respuestaFinal.size();i++){
//            Toast.makeText(getApplicationContext(),respuestaFinal.get(i),Toast.LENGTH_SHORT).show();
            LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            TextView tv=new TextView(this);
            tv.setLayoutParams(lparams);
            tv.setText(respuestaFinal.get(i));
            this.scrollView.addView(tv);
        }

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
