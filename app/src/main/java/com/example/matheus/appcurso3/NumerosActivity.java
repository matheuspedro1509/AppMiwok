package com.example.matheus.appcurso3;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumerosActivity extends AppCompatActivity {


    private AudioManager audio;

    private MediaPlayer media;

    private MediaPlayer.OnCompletionListener mCompletion= new MediaPlayer.OnCompletionListener() {

        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_view);
        audio= (AudioManager) getSystemService(this.AUDIO_SERVICE);

        final ArrayList<Palavra> palavras = new ArrayList<Palavra>();


        palavras.add(new Palavra("one", "lutti", R.drawable.number_one, R.raw.number_one));
        palavras.add(new Palavra("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        palavras.add(new Palavra("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        palavras.add(new Palavra("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        palavras.add(new Palavra("five", "massokka", R.drawable.number_five, R.raw.number_five));
        palavras.add(new Palavra("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        palavras.add(new Palavra("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        palavras.add(new Palavra("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        palavras.add(new Palavra("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        palavras.add(new Palavra("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));


        PalavraAdapter adapter = new PalavraAdapter(this, palavras, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Palavra palavra = palavras.get(position);
                media = MediaPlayer.create(NumerosActivity.this, palavra.getmAudio());
                media.start();

                media.setOnCompletionListener(mCompletion);

            }
        });
    }
    //METODO PARA ECONOMIZAR MEMORIA
    private void releaseMediaPlayer(){
        // If the media player is not null, then it may be currently playing a sound.
        if (media != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            media.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            media = null;
        }
    }


    }

