package com.example.mohamedsamir1495.musical_structure_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Albums extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the ImageButtons for playing specific album
        ImageButton playAlbumOne = (ImageButton) findViewById(R.id.playAlbum1);
        ImageButton playAlbumTwo = (ImageButton) findViewById(R.id.playAlbum2);

        ImageButton addToPlayListAlbumOne = (ImageButton) findViewById(R.id.addToPlayListAlbumOne);
        ImageButton addToPlayListAlbumTwo = (ImageButton) findViewById(R.id.addToPlayListAlbumTwo);

        Button nowIsPlayingTopMenuButton = (Button) findViewById(R.id.settingsMenuNowIsPlaying);
        Button artistTopMenuButton = (Button) findViewById(R.id.settingsMenuArtist);
        Button musicStoreTopMenuButton = (Button) findViewById(R.id.settingsMenuMusicStore);
        Button settingsTopMenuButton = (Button) findViewById(R.id.settingsTopMenuSettings);


        // CLICKS ON TOP MENU BUTTONS:
        nowIsPlayingTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(Albums.this, NowIsPlaying.class);
                startActivity(nowIsPlayingIntent);
            }
        });

        artistTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ArtistIntent = new Intent(Albums.this, Artist.class);
                startActivity(ArtistIntent);
            }
        });

        musicStoreTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MusicStoreIntent = new Intent(Albums.this, MusicStore.class);
                startActivity(MusicStoreIntent);
            }
        });

        settingsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SettingsIntent = new Intent(Albums.this, Settings.class);
                startActivity(SettingsIntent);
            }
        });


        // CLICKS ON PLAY BUTTONS:  Move user to the "Now is playing" screen and play selected album
        playAlbumOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(Albums.this, NowIsPlaying.class);
                startActivity(nowIsPlayingIntent);
            }
        });

        playAlbumTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(Albums.this, NowIsPlaying.class);
                startActivity(nowIsPlayingIntent);
            }
        });

        // CLICKS ON PLAY ADD TO PLAYLIST BUTTON:  Show the toast with description of activity
        addToPlayListAlbumOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Album has been added to playlist", Toast.LENGTH_SHORT).show();
            }
        });

        addToPlayListAlbumTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Album has been added to playlist", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
