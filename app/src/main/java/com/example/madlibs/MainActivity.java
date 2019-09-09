package com.example.madlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String cool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendInfo(View v)
    {
        EditText adj = (EditText) findViewById(R.id.adjEt);
        EditText adv = (EditText) findViewById(R.id.adverbEt);
        EditText noun = (EditText) findViewById(R.id.nounEt);
        EditText verb = (EditText) findViewById(R.id.verbEt);
        EditText place = (EditText) findViewById(R.id.placeEt);
        EditText name = (EditText) findViewById(R.id.nameEt);

        String adjString = adj.getText().toString();
        String advString = adv.getText().toString();
        String nounString = noun.getText().toString();
        String verbString = verb.getText().toString();
        String placeString = place.getText().toString();
        String nameString = name.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtra(MainActivity2.ADJ, adjString);
        intent.putExtra(MainActivity2.ADV, advString);
        intent.putExtra(MainActivity2.NOUN, nounString);
        intent.putExtra(MainActivity2.VERB, verbString);
        intent.putExtra(MainActivity2.PLACE, placeString);
        intent.putExtra(MainActivity2.NAME, nameString);

        startActivity(intent);

    }

}
