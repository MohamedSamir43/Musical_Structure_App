package com.example.mohamedsamir1495.musical_structure_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import Adapters.ArtistAdapter;
import Models.ArtistModel;
import butterknife.BindView;
import butterknife.ButterKnife;

public class Artist extends AppCompatActivity {

    @BindView(R.id.settingsMenuNowPlaying)
    Button nowPlayingTopMenuButton;

    @BindView(R.id.settingsMenuAlbums)
    Button albumsTopMenuButton;

    @BindView(R.id.settingsMenuMusicStore)
    Button musicStoreTopMenuButton;

    @BindView(R.id.settingsTopMenuSettings)
    Button settingsTopMenuButton;

    @BindView(R.id.artistList)
    ListView artistList;

    private ArtistAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        ButterKnife.bind(this);

        // Mapping buttons

        // Listeners for buttons
        // CLICKS ON TOP MENU BUTTONS:
        nowPlayingTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(Artist.this, NowPlaying.class);
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

        ArrayList<ArtistModel> mList = new ArrayList<>();
        mList.add(new ArtistModel(getString(R.string.amr_diab_artist), getString(R.string.about_amr_diab),R.drawable.amr_diab));
        mList.add(new ArtistModel(getString(R.string.cheb_khaled_artist), getString(R.string.about_cheb_khaled),R.drawable.cheb_khaled));
        mList.add(new ArtistModel(getString(R.string.eminem_artist), getString(R.string.about_eminem),R.drawable.eminem));


        mAdapter = new ArtistAdapter(this,mList);
        artistList.setAdapter(mAdapter);
    }
}
