package com.example.mohamedsamir1495.musical_structure_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Settings extends AppCompatActivity {

    @BindView(R.id.buttonRegister)
    Button registerButton;

    @BindView(R.id.buttonLogin)
    Button loginButton;

    @BindView(R.id.loginViaFacebook)
    Button loginViaFacebook;

    @BindView(R.id.loginViaGoogle)
    Button loginViaGoogle;


    @BindView(R.id.settingsMenuNowPlaying)
    Button nowPlayingTopMenuButton;

    @BindView(R.id.settingsMenuAlbums)
    Button albumsTopMenuButton;

    @BindView(R.id.settingsMenuArtist)
    Button artistTopMenuButton;

    @BindView(R.id.settingsMenuMusicStore)
    Button musicStoreTopMenuButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);

        nowPlayingTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(Settings.this, NowPlaying.class);
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

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.settings_register_message, Toast.LENGTH_SHORT).show();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.settings_login_message, Toast.LENGTH_SHORT).show();
            }
        });

        loginViaFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.settings_login_message, Toast.LENGTH_SHORT).show();
            }
        });

        loginViaGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.settings_login_message, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
