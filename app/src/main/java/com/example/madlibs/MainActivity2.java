package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String adj = intent.getStringExtra(ADJ);
        String adv = intent.getStringExtra(ADV);
        String noun = intent.getStringExtra(NOUN);
        String verb = intent.getStringExtra(VERB);
        String place = intent.getStringExtra(PLACE);
        String name = intent.getStringExtra(NAME);

        String strDisplay = "There once was a person named " + name + " and they were " + adj + ". Everyone laughed at them for " + adv + " " + verb +
                            "everyday. " + name + "only liked to be at " + place + " because it was the only place that had a " + noun + ".";

        TextView str = (TextView) findViewById(R.id.info);
        str.setText(strDisplay);

    }

    public static final String ADJ = "adj";
    public static final String ADV = "adv";
    public static final String NOUN = "noun";
    public static final String VERB = "verb";
    public static final String PLACE = "place";
    public static final String NAME = "name";
}
