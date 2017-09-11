package com.example.anthony.cybersecapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

/**
 * Created by Israel on 6/9/17.
 */

public class first extends AppCompatActivity {

    private Button button;
    private LinearLayout scrollView;
    private List<String> controlesTi = new ArrayList<String>();
    private List<String> jsonCorporativos = new ArrayList<String>();
    private List<String> finalControlList = new ArrayList<String>();
    Integer[] a1 = {0,2,4,5,6,7,8,10,11,12,13,15,16};
    Integer[] a2 = {0,2,4,6,7,8,10,11,12,13};
    Integer[] a3 = {0,1,2,3,5,6,7,8,9,11,12,13};
    Integer[] a4 = {1,3,6,9,13,14};
    Integer[] a5 = {5};
    Integer[] a6 = {0,4,6,7,8,11,12,15,16};
    Integer[] a7 = {0,3,6,7,9,13};
    Integer[] a8 = {0,2,3,4,6,8,10,11,15,16};
    Integer[] a9 = {0,2,5,6,7,13,16};
    Integer[] a10 = {3,4,5,7,10,11,12};
    Integer[] a11 = {0,2,4,6,7,8,10,11,13,16};
    Integer[] a12 = {0,4,5,6,7,10,11,12};
    Integer[] a13 = {0,2,3,6,8,10,11,12,16};
    Integer[] a14 = {4,7,8,10,11,15};
    Integer[] a15 = {1,3,9,14};
    Integer[] a16 = {0,2,3,6,7,8,15,16};
    Integer[] a17 = {0,2,4,6,7,8,10,11,15,16};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);

        Bundle extras = getIntent().getExtras();
        List<String> coorporativas = extras.getStringArrayList("respuestas");

        scrollView = (LinearLayout) findViewById(R.id.scrollView);
        final List<CheckBox> items = new ArrayList<CheckBox>();
        for(int i = 0;i < coorporativas.size();i++){
            LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            CheckBox tv=new CheckBox(this);
            tv.setLayoutParams(lparams);
            tv.setText(coorporativas.get(i));
            items.add(tv);
            this.scrollView.addView(tv);
        }

        setControlesTi();
        setJsonCorporativos();



        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finalControlList.clear();
                ArrayList<Integer[]> arraylist = new ArrayList<Integer[]>();
                arraylist.add(a1);
                arraylist.add(a2);
                arraylist.add(a3);
                arraylist.add(a4);
                arraylist.add(a5);
                arraylist.add(a6);
                arraylist.add(a7);
                arraylist.add(a8);
                arraylist.add(a9);
                arraylist.add(a10);
                arraylist.add(a11);
                arraylist.add(a12);
                arraylist.add(a13);
                arraylist.add(a14);
                arraylist.add(a15);
                arraylist.add(a16);
                arraylist.add(a17);

                for (CheckBox item : items){
                    for(int k = 0; k<jsonCorporativos.size(); k++){
                        if(item.isChecked() && jsonCorporativos.get(k).equals(item.getText())){
                            List<Integer> j = Arrays.asList(arraylist.get(k));
                            for(int i = 0; i< j.size();i++){
                                String controlTi = controlesTi.get(j.get(i));
                                if(!finalControlList.contains(controlTi)){
                                    finalControlList.add(" - "+controlTi);
                                }
                            }
                        }
                    }
                }
                Intent intent = new Intent(first.this, second.class);
                intent.putExtra("itControles",(Serializable) finalControlList);
                startActivity(intent);
            }
        });
    }


    public String loadJSONFromAsset() {
        String json = null;
        try {
            InputStream is = getAssets().open("cyber_sec_app.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }

    private void setJsonCorporativos(){
        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            JSONArray q1 = obj.getJSONArray("coorporativas");
            JSONObject coorporativa = q1.getJSONObject(0);
            for(int i = 1; i <= coorporativa.length();i++){
                jsonCorporativos.add(coorporativa.get("question"+i).toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void setControlesTi(){
        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            JSONArray q1 = obj.getJSONArray("ti");
            JSONObject coorporativa = q1.getJSONObject(0);
            for(int i = 1; i <= coorporativa.length();i++){
                controlesTi.add(coorporativa.get("question"+i).toString());
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        finalControlList.clear();
    }

}


