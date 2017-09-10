package com.example.anthony.cybersecapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 * Created by Israel on 7/9/17.
 */

public class help extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);

        TextView email1 = (TextView) findViewById(R.id.email1);
        email1.setText(Html.fromHtml("<a href=\"mailto:anthonypaico.info@gmail.com\">Anthony Paico</a>"));
        email1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView email2 = (TextView) findViewById(R.id.email2);
        email2.setText(Html.fromHtml("<a href=\"mailto:anthonypaico.info@gmail.com\">Jorge Vela</a>"));
        email2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
