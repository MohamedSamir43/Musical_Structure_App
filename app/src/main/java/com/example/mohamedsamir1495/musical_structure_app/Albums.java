package com.example.mohamedsamir1495.musical_structure_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import Adapters.AlbumAdapter;
import Adapters.ArtistAdapter;
import Models.AlbumModel;
import Models.ArtistModel;
import butterknife.BindView;
import butterknife.ButterKnife;

public class Albums extends AppCompatActivity {

    @BindView(R.id.settingsMenuNowPlaying)
    Button nowPlayingTopMenuButton;

    @BindView(R.id.settingsMenuArtist)
    Button artistTopMenuButton;

    @BindView(R.id.settingsMenuMusicStore)
    Button musicStoreTopMenuButton;

    @BindView(R.id.settingsTopMenuSettings)
    Button settingsTopMenuButton;

    @BindView(R.id.albumsList)
    ListView albumsList;

    AlbumAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);
        ButterKnife.bind(this);
        // Find the ImageButtons for playing specific album



        // CLICKS ON TOP MENU BUTTONS:
        nowPlayingTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(Albums.this, NowPlaying.class);
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
        ArrayList<AlbumModel> mList = new ArrayList<>();
        mList.add(new AlbumModel(getString(R.string.amr_diab_artist), getString(R.string.amr_diab_album),R.drawable.amr_diab_album));
        mList.add(new AlbumModel(getString(R.string.cheb_khaled_artist), getString(R.string.cheb_khaled_album),R.drawable.cheb_khaled_album));
        mList.add(new AlbumModel(getString(R.string.eminem_artist), getString(R.string.eminem_album),R.drawable.eminem_album));


        mAdapter = new AlbumAdapter(this,mList);
        albumsList.setAdapter(mAdapter);

    }
}
