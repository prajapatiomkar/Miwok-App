package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Create an array of word
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red", "yoyolli\n"));
        words.add(new Word("Black", "kululli"));
        words.add(new Word("White", "kelelli"));
        words.add(new Word("Green", "chititti"));
        words.add(new Word("Blue", "che˙we˙wwi\n"));
        words.add(new Word("Brown", "tatatti"));
        words.add(new Word("dusty yellow", "ṭopiisә"));
        words.add(new Word("mustard yellow", "chiwiiṭә"));
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}