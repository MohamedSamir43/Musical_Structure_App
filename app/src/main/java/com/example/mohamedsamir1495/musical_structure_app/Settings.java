package com.example.mohamedsamir1495.musical_structure_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Mapping buttons
        Button registerSpotifyButton = (Button) findViewById(R.id.buttonRegister);
        Button loginSpotifyButton = (Button) findViewById(R.id.buttonLogin);
        Button logintoSpotifyViaFacebook = (Button) findViewById(R.id.loginViaFacebook);
        Button logintoSpotifyViaGoogle = (Button) findViewById(R.id.loginViaGoogle);

        Button nowIsPlayingTopMenuButton = (Button) findViewById(R.id.settingsMenuNowIsPlaying);
        Button albumsTopMenuButton = (Button) findViewById(R.id.settingsMenuAlbums);
        Button artistTopMenuButton = (Button) findViewById(R.id.settingsMenuArtist);
        Button musicStoreTopMenuButton = (Button) findViewById(R.id.settingsMenuMusicStore);

        // Listeners for info buttons
        // CLICKS ON TOP MENU BUTTONS:
        nowIsPlayingTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(Settings.this, NowIsPlaying.class);
                startActivity(nowIsPlayingIntent);
            }
        });

        albumsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AlbumsIntent = new Intent(Settings.this, Albums.class);
                startActivity(AlbumsIntent);
            }
        });

        artistTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ArtistIntent = new Intent(Settings.this, Artist.class);
                startActivity(ArtistIntent);
            }
        });

        musicStoreTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MusicStoreIntent = new Intent(Settings.this, MusicStore.class);
                startActivity(MusicStoreIntent);
            }
        });

        registerSpotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.settings_register_message, Toast.LENGTH_SHORT).show();
            }
        });

        loginSpotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.settings_login_message, Toast.LENGTH_SHORT).show();
            }
        });

        logintoSpotifyViaFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.settings_login_message, Toast.LENGTH_SHORT).show();
            }
        });

        logintoSpotifyViaGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.settings_login_message, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
