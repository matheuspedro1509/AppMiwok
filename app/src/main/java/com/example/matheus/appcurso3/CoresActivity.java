package com.example.matheus.appcurso3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_view);

        // Create a list of words
        final ArrayList<Palavra> words = new ArrayList<Palavra>();
        words.add(new Palavra("red", "weṭeṭṭi", R.drawable.color_red,R.raw.color_red));
        words.add(new Palavra("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        words.add(new Palavra("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        words.add(new Palavra("green", "chokokki", R.drawable.color_green,R.raw.color_green));
        words.add(new Palavra("brown", "ṭakaakki", R.drawable.color_brown,R.raw.color_brown));
        words.add(new Palavra("gray", "ṭopoppi", R.drawable.color_gray,R.raw.color_gray));
        words.add(new Palavra("black", "kululli", R.drawable.color_black,R.raw.color_black));
        words.add(new Palavra("white", "kelelli", R.drawable.color_white,R.raw.color_white));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PalavraAdapter adapter = new PalavraAdapter(this, words,R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Palavra palavra= words.get(position);
                MediaPlayer media = MediaPlayer.create(CoresActivity.this,palavra.getmAudio());
                media.start();
            }
        });
    }
}
