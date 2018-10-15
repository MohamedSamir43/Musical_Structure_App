package com.example.mohamedsamir1495.musical_structure_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.nowPlaying) LinearLayout nowPlaying;
    @BindView(R.id.albums) LinearLayout albums;
    @BindView(R.id.artists) LinearLayout artists;
    @BindView(R.id.musicStore) LinearLayout musicStore;
    @BindView(R.id.settings) LinearLayout settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        // Find the Layout that shows the Now Is Playing category

        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(MainActivity.this, NowIsPlaying.class);
                startActivity(nowIsPlayingIntent);
            }
        });

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this, Albums.class);
                startActivity(albumsIntent);
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent artistsIntent = new Intent(MainActivity.this, Artist.class);
                startActivity(artistsIntent);
            }
        });

        musicStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent musicStoreIntent = new Intent(MainActivity.this, MusicStore.class);
                startActivity(musicStoreIntent);
            }
        });

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent settingsIntent = new Intent(MainActivity.this, Settings.class);
                startActivity(settingsIntent);
            }
        });

    }
}
