package com.example.mohamedsamir1495.musical_structure_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MusicStore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_store);


        // Mapping buttons for MusicStore screen
        ImageButton infoButtonAlbum1 = (ImageButton) findViewById(R.id.infoAlbum1);
        ImageButton infoButtonAlbum2 = (ImageButton) findViewById(R.id.infoAlbum2);
        ImageButton infoButtonAlbum3 = (ImageButton) findViewById(R.id.infoAlbum3);
        ImageButton infoButtonAlbum4 = (ImageButton) findViewById(R.id.infoAlbum4);

        ImageButton addToShoppingCartButtonAlbum1 = (ImageButton) findViewById(R.id.addToShoppingCartAlbum1);
        ImageButton addToShoppingCartButtonAlbum2 = (ImageButton) findViewById(R.id.addToShoppingCartAlbum2);
        ImageButton addToShoppingCartButtonAlbum3 = (ImageButton) findViewById(R.id.addToShoppingCartAlbum3);
        ImageButton addToShoppingCartButtonAlbum4 = (ImageButton) findViewById(R.id.addToShoppingCartAlbum4);

        Button nowIsPlayingTopMenuButton = (Button) findViewById(R.id.settingsMenuNowIsPlaying);
        Button albumsTopMenuButton = (Button) findViewById(R.id.settingsMenuAlbums);
        Button artistTopMenuButton = (Button) findViewById(R.id.settingsMenuArtist);
        Button settingsTopMenuButton = (Button) findViewById(R.id.settingsTopMenuSettings);

        // Listeners for info buttons
        // CLICKS ON TOP MENU BUTTONS:
        nowIsPlayingTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(MusicStore.this, NowIsPlaying.class);
                startActivity(nowIsPlayingIntent);
            }
        });

        albumsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AlbumsIntent = new Intent(MusicStore.this, Albums.class);
                startActivity(AlbumsIntent);
            }
        });


        artistTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ArtistIntent = new Intent(MusicStore.this, Artist.class);
                startActivity(ArtistIntent);
            }
        });

        settingsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SettingsIntent = new Intent(MusicStore.this, Settings.class);
                startActivity(SettingsIntent);
            }
        });

        infoButtonAlbum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Info about album 1", Toast.LENGTH_SHORT).show();
            }
        });

        infoButtonAlbum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Info about album 2", Toast.LENGTH_SHORT).show();
            }
        });

        infoButtonAlbum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Info about album 3", Toast.LENGTH_SHORT).show();
            }
        });

        infoButtonAlbum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Info about album 4", Toast.LENGTH_SHORT).show();
            }
        });

        // Listeners for Add Shopping Card Buttons
        addToShoppingCartButtonAlbum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Album has been added to Shopping Card", Toast.LENGTH_SHORT).show();
            }
        });

        addToShoppingCartButtonAlbum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Album has been added to Shopping Card", Toast.LENGTH_SHORT).show();
            }
        });

        addToShoppingCartButtonAlbum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Album has been added to Shopping Card", Toast.LENGTH_SHORT).show();
            }
        });

        addToShoppingCartButtonAlbum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Album has been added to Shopping Card", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
