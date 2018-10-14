package com.example.mohamedsamir1495.musical_structure_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Mapping buttons
        Button readMoreArtist1 = (Button) findViewById(R.id.readMoreButtonArtist1);
        Button readMoreArtist2 = (Button) findViewById(R.id.readMoreButtonArtist2);
        Button readMoreArtist3 = (Button) findViewById(R.id.readMoreButtonArtist3);
        Button readMoreArtist4 = (Button) findViewById(R.id.readMoreButtonArtist4);

        Button nowIsPlayingTopMenuButton = (Button) findViewById(R.id.settingsMenuNowIsPlaying);
        Button albumsTopMenuButton = (Button) findViewById(R.id.settingsMenuAlbums);
        Button musicStoreTopMenuButton = (Button) findViewById(R.id.settingsMenuMusicStore);
        Button settingsTopMenuButton = (Button) findViewById(R.id.settingsTopMenuSettings);


        // Listeners for buttons
        // CLICKS ON TOP MENU BUTTONS:
        nowIsPlayingTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(Artist.this, NowIsPlaying.class);
                startActivity(nowIsPlayingIntent);
            }
        });

        albumsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AlbumsIntent = new Intent(Artist.this, Albums.class);
                startActivity(AlbumsIntent);
            }
        });

        musicStoreTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MusicStoreIntent = new Intent(Artist.this, MusicStore.class);
                startActivity(MusicStoreIntent);
            }
        });

        settingsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SettingsIntent = new Intent(Artist.this, Settings.class);
                startActivity(SettingsIntent);
            }
        });


        readMoreArtist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
            }
        });

        readMoreArtist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
            }
        });

        readMoreArtist3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
            }
        });

        readMoreArtist4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
