package com.example.matheus.appcurso3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_view);

        final ArrayList<Palavra> words = new ArrayList<Palavra>();
        words.add(new Palavra("Where are you going?", "minto wuksus",R.raw.phrase_where_are_you_going));
        words.add(new Palavra("What is your name?", "tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        words.add(new Palavra("My name is...", "oyaaset...",R.raw.phrase_my_name_is));
        words.add(new Palavra("How are you feeling?", "michәksәs?",R.raw.phrase_how_are_you_feeling));
        words.add(new Palavra("I’m feeling good.", "kuchi achit",R.raw.phrase_im_feeling_good));
        words.add(new Palavra("Are you coming?", "әәnәs'aa?",R.raw.phrase_are_you_coming));
        words.add(new Palavra("Yes, I’m coming.", "hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        words.add(new Palavra("I’m coming.", "әәnәm",R.raw.phrase_im_coming));
        words.add(new Palavra("Let’s go.", "yoowutis",R.raw.phrase_lets_go));
        words.add(new Palavra("Come here.", "әnni'nem",R.raw.phrase_come_here));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PalavraAdapter adapter = new PalavraAdapter(this, words,R.color.category_phrases);

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
                MediaPlayer player = MediaPlayer.create(FrasesActivity.this,palavra.getmAudio());
                player.start();
            }
        });
    }
}
