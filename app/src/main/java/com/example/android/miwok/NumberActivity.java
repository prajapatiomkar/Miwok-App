package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumberActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Create an array of word
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One", "lutti"));
        words.add(new Word("Two", "oṭiiko"));
        words.add(new Word("Three", "tolookoshu"));
        words.add(new Word("Four", "oyyissa"));
        words.add(new Word("Five", "mashhokka"));
        words.add(new Word("Six", "temmokka"));
        words.add(new Word("Seven", "kenekkaku"));
        words.add(new Word("Eight", "kawwinṭa"));
        words.add(new Word("Nine", "Wo'e"));
        words.add(new Word("Ten", "na’aacha"));
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