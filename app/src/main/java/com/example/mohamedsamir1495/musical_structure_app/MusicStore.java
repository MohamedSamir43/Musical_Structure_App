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
import Adapters.MusicStoreListAdapter;
import Models.AlbumModel;
import Models.StoreItemModel;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MusicStore extends AppCompatActivity {

    @BindView(R.id.settingsMenuNowPlaying)
    Button nowPlayingTopMenuButton;

    @BindView(R.id.settingsMenuAlbums)
    Button albumsTopMenuButton;

    @BindView(R.id.settingsMenuArtist)
    Button artistTopMenuButton;

    @BindView(R.id.settingsTopMenuSettings)
    Button settingsTopMenuButton;

    @BindView(R.id.storeItemList)
    ListView storeItemList;

    MusicStoreListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_store);
        ButterKnife.bind(this);

        // Mapping buttons for MusicStore screen


        // Listeners for info buttons
        // CLICKS ON TOP MENU BUTTONS:
        nowPlayingTopMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(MusicStore.this, NowPlaying.class);
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

        ArrayList<StoreItemModel> mList = new ArrayList<>();
        mList.add(new StoreItemModel(getString(R.string.amr_diab_artist), getString(R.string.amr_diab_album),R.drawable.amr_diab_album));
        mList.add(new StoreItemModel(getString(R.string.cheb_khaled_artist), getString(R.string.cheb_khaled_album),R.drawable.cheb_khaled_album));
        mList.add(new StoreItemModel(getString(R.string.eminem_artist), getString(R.string.eminem_album),R.drawable.eminem_album));


        mAdapter = new MusicStoreListAdapter(this,mList);
        storeItemList.setAdapter(mAdapter);
    }
}
