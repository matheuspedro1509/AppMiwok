package com.example.matheus.appcurso3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamiliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_view);

        final ArrayList<Palavra> words = new ArrayList<Palavra>();
        words.add(new Palavra("father", "әpә", R.drawable.family_father,R.raw.family_father));
        words.add(new Palavra("mother", "әṭa", R.drawable.family_mother,R.raw.family_mother));
        words.add(new Palavra("son", "angsi", R.drawable.family_son,R.raw.family_son));
        words.add(new Palavra("daughter", "tune", R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Palavra("older brother", "taachi", R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new Palavra("younger brother", "chalitti", R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Palavra("older sister", "teṭe", R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Palavra("younger sister", "kolliti", R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Palavra("grandmother ", "ama", R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Palavra("grandfather", "paapa", R.drawable.family_grandfather,R.raw.family_grandfather));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        PalavraAdapter adapter = new PalavraAdapter(this, words,R.color.category_family);

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
                Palavra palavra = words.get(position);
                MediaPlayer player = MediaPlayer.create(FamiliaActivity.this,palavra.getmAudio());
                player.start();
            }
        });

    }
}
