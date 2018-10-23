package Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mohamedsamir1495.musical_structure_app.Albums;
import com.example.mohamedsamir1495.musical_structure_app.NowPlaying;
import com.example.mohamedsamir1495.musical_structure_app.R;

import java.util.ArrayList;
import java.util.List;

import Models.AlbumModel;
import Models.ArtistModel;

public class AlbumAdapter extends ArrayAdapter<AlbumModel> {
    private Context mContext;
    private List<AlbumModel> albumList = new ArrayList<AlbumModel>();

    public AlbumAdapter(Context context, ArrayList<AlbumModel> list) {
        super(context, android.R.layout.simple_list_item_1, list);
        mContext = context;
        albumList = list;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.album_row_cell, parent, false);

        AlbumModel currentAlbum = albumList.get(position);

        TextView bandNameTV = (TextView) listItem.findViewById(R.id.nameOfBand);
        bandNameTV.setText(currentAlbum.getAlbumBand());

        TextView albumName = (TextView) listItem.findViewById(R.id.nameOfAlbum);
        albumName.setText(currentAlbum.getAlbumName());

        ImageView albumCoverIV = (ImageView) listItem.findViewById(R.id.coverOfAlbum);
        albumCoverIV.setImageResource(currentAlbum.getAlbumCoverImageId());

        ImageButton addToPlayListIB = (ImageButton) listItem.findViewById(R.id.addToPlayList);
        ImageButton playAlbumIB = (ImageButton) listItem.findViewById(R.id.playAlbum);

        playAlbumIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIsPlayingIntent = new Intent(mContext, NowPlaying.class);
                mContext.startActivity(nowIsPlayingIntent);
            }
        });

        // CLICKS ON PLAY ADD TO PLAYLIST BUTTON:  Show the toast with description of activity
        addToPlayListIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Album has been added to playlist", Toast.LENGTH_SHORT).show();
            }
        });
        return listItem;
    }
}
