package com.example.mohamedsamir1495.musical_structure_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NowIsPlaying extends AppCompatActivity {

    // Mapping for all media player buttons

    @BindView(R.id.playSongButton)
    ImageButton playButton;

    @BindView(R.id.previousSongButton)
    ImageButton previousSongButton;

    @BindView(R.id.nextSongButton)
    ImageButton nextSongButton;

//    @BindView(R.id.repeatButton)
//    ImageButton repeatButton;
//
//    @BindView(R.id.shuffleButton)
//    ImageButton shuffleButton;
//
//    @BindView(R.id.buyCurrentSongButton)
//    ImageButton buyCurrentSongButton;

    // Mapping for all buttons in the top corner screen

    @BindView(R.id.TopMenuSettings)
    Button settingsTopMenuButton;

    @BindView(R.id.TopMenuAlbums)
    Button albumsTopMenuButton;

    @BindView(R.id.TopMenuArtist)
    Button artistTopMenuButton;

    @BindView(R.id.TopMenuMusicStore)
    Button musicStoreTopMenuButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_is_playing);
        ButterKnife.bind(this);




        // Listeners for info buttons
        // CLICKS ON TOP MENU BUTTONS
        albumsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AlbumsIntent = new Intent(NowIsPlaying.this, Albums.class);
                startActivity(AlbumsIntent);
            }
        });


        artistTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ArtistIntent = new Intent(NowIsPlaying.this, Artist.class);
                startActivity(ArtistIntent);
            }
        });

        musicStoreTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MusicStoreIntent = new Intent(NowIsPlaying.this, MusicStore.class);
                startActivity(MusicStoreIntent);
            }
        });

        settingsTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SettingsIntent = new Intent(NowIsPlaying.this, Settings.class);
                startActivity(SettingsIntent);
            }
        });

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Song is playing", Toast.LENGTH_SHORT).show();
            }
        });

        previousSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Switched to previous song", Toast.LENGTH_SHORT).show();
            }
        });

        nextSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Switched to next song", Toast.LENGTH_SHORT).show();
            }
        });

//        repeatButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Song will be repeated", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        shuffleButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Shuffle has been enabled", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        buyCurrentSongButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "You decided buy this song. Thank you.", Toast.LENGTH_SHORT).show();
//            }
//        });

    }
}
