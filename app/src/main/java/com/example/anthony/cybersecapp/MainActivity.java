package com.example.anthony.cybersecapp;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CheckBox
            checkBox,
            checkBox2,
            checkBox3,
            checkBox4,
            checkBox5,
            checkBox6,
            checkBox7,
            checkBox8,
            checkBox9,
            checkBox10,
            checkBox11,
            checkBox12,
            checkBox13,
            checkBox14,
            checkBox15,
            checkBox16,
            checkBox17,
            checkBox18,
            checkBox19,
            checkBox20,
            checkBox21,
            checkBox22;
    private Button button;
    private Toolbar toolbar;
    private List<String> respuestaFinal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);

        checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox)findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox)findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox)findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox)findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox)findViewById(R.id.checkBox9);
        checkBox10 = (CheckBox)findViewById(R.id.checkBox10);
        checkBox11 = (CheckBox)findViewById(R.id.checkBox11);
        checkBox12 = (CheckBox)findViewById(R.id.checkBox12);
        checkBox13 = (CheckBox)findViewById(R.id.checkBox13);
        checkBox14 = (CheckBox)findViewById(R.id.checkBox14);
        checkBox15 = (CheckBox)findViewById(R.id.checkBox15);
        checkBox16 = (CheckBox)findViewById(R.id.checkBox16);
        checkBox17 = (CheckBox)findViewById(R.id.checkBox17);
        checkBox18 = (CheckBox)findViewById(R.id.checkBox18);
        checkBox19 = (CheckBox)findViewById(R.id.checkBox19);
        checkBox20 = (CheckBox)findViewById(R.id.checkBox20);
        checkBox21 = (CheckBox)findViewById(R.id.checkBox21);
        checkBox22 = (CheckBox)findViewById(R.id.checkBox22);


        button = (Button)findViewById(R.id.button);
        respuestaFinal = new ArrayList<String>();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, first.class);
                if(checkBox.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q1 = obj.getJSONArray("q1");
                        JSONObject pregunta = q1.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox2.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q2 = obj.getJSONArray("q2");
                        JSONObject pregunta = q2.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox3.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q3 = obj.getJSONArray("q3");
                        JSONObject pregunta = q3.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox4.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q4 = obj.getJSONArray("q4");
                        JSONObject pregunta = q4.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox5.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q5 = obj.getJSONArray("q5");
                        JSONObject pregunta = q5.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox6.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q6 = obj.getJSONArray("q6");
                        JSONObject pregunta = q6.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox7.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q7 = obj.getJSONArray("q7");
                        JSONObject pregunta = q7.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox8.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q8 = obj.getJSONArray("q8");
                        JSONObject pregunta = q8.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox9.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q9 = obj.getJSONArray("q9");
                        JSONObject pregunta = q9.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox10.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q10 = obj.getJSONArray("q10");
                        JSONObject pregunta = q10.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox11.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q11 = obj.getJSONArray("q11");
                        JSONObject pregunta = q11.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox12.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q12 = obj.getJSONArray("q12");
                        JSONObject pregunta = q12.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox13.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q13 = obj.getJSONArray("q13");
                        JSONObject pregunta = q13.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox14.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q14 = obj.getJSONArray("q14");
                        JSONObject pregunta = q14.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox15.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q15 = obj.getJSONArray("q15");
                        JSONObject pregunta = q15.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox16.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q16 = obj.getJSONArray("q16");
                        JSONObject pregunta = q16.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox17.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q17 = obj.getJSONArray("q17");
                        JSONObject pregunta = q17.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox18.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q18 = obj.getJSONArray("q18");
                        JSONObject pregunta = q18.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox19.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q19 = obj.getJSONArray("q19");
                        JSONObject pregunta = q19.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox20.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q20 = obj.getJSONArray("q20");
                        JSONObject pregunta = q20.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox21.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q21 = obj.getJSONArray("q21");
                        JSONObject pregunta = q21.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                if(checkBox22.isChecked()){
                    try {
                        JSONObject obj = new JSONObject(loadJSONFromAsset());
                        JSONArray q22 = obj.getJSONArray("q22");
                        JSONObject pregunta = q22.getJSONObject(0);
                        for(int i = 1; i <= pregunta.length() - 1; i++){
                            String respuesta = pregunta.getString("a"+i);
                            if(!respuestaFinal.contains(respuesta)){
                                respuestaFinal.add(respuesta);
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                intent.putExtra("respuestas", (Serializable) respuestaFinal);
                startActivity(intent);
            }
        });

        try {
            JSONObject obj = new JSONObject(loadJSONFromAsset());
            List<String> allNames = new ArrayList<String>();
            int length = obj.length();
            for(int j = 1; j <= obj.length(); j++){
                JSONArray q1 = obj.getJSONArray("q"+j);
                for(int i = 0; i < q1.length(); i++) {
                    JSONObject actor = q1.getJSONObject(i);
                    String name = actor.getString("question");
                    allNames.add(name);
                }
            }

            checkBox.setText(allNames.get(0));
            checkBox2.setText(allNames.get(1));
            checkBox3.setText(allNames.get(2));
            checkBox4.setText(allNames.get(3));
            checkBox5.setText(allNames.get(4));
            checkBox6.setText(allNames.get(5));
            checkBox7.setText(allNames.get(6));
            checkBox8.setText(allNames.get(7));
            checkBox9.setText(allNames.get(8));
            checkBox10.setText(allNames.get(9));
            checkBox11.setText(allNames.get(10));
            checkBox12.setText(allNames.get(11));
            checkBox13.setText(allNames.get(12));
            checkBox14.setText(allNames.get(13));
            checkBox15.setText(allNames.get(14));
            checkBox16.setText(allNames.get(15));
            checkBox17.setText(allNames.get(16));
            checkBox18.setText(allNames.get(17));
            checkBox19.setText(allNames.get(18));
            checkBox20.setText(allNames.get(19));
            checkBox21.setText(allNames.get(20));
            checkBox22.setText(allNames.get(21));

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        respuestaFinal.clear();
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
                intent = new Intent(MainActivity.this, help.class);
                startActivity(intent);
                return true;

            case R.id.action_favorite:
                intent = new Intent(MainActivity.this, info.class);
                startActivity(intent);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
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

}
