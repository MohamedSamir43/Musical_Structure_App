package Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mohamedsamir1495.musical_structure_app.NowPlaying;
import com.example.mohamedsamir1495.musical_structure_app.R;

import java.util.ArrayList;
import java.util.List;

import Models.AlbumModel;
import Models.StoreItemModel;

public class MusicStoreListAdapter extends ArrayAdapter<StoreItemModel> {
    private Context mContext;
    private List<StoreItemModel> storeItemList = new ArrayList<StoreItemModel>();

    public MusicStoreListAdapter(Context context, ArrayList<StoreItemModel> list) {
        super(context, android.R.layout.simple_list_item_1, list);
        mContext = context;
        storeItemList = list;
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.store_item_row_cell, parent, false);

        StoreItemModel currentItem = storeItemList.get(position);

        TextView bandNameTV = (TextView) listItem.findViewById(R.id.nameOfBand);
        bandNameTV.setText(currentItem.getAlbumBand());

        TextView albumName = (TextView) listItem.findViewById(R.id.nameOfAlbum);
        albumName.setText(currentItem.getAlbumName());

        ImageView albumCoverIV = (ImageView) listItem.findViewById(R.id.coverOfAlbum);
        albumCoverIV.setImageResource(currentItem.getAlbumCoverImageId());

        ImageButton infoAlbumIB = (ImageButton) listItem.findViewById(R.id.infoAlbum);
        ImageButton addToShoppingCartAlbumIB = (ImageButton) listItem.findViewById(R.id.addToShoppingCartAlbum);

        infoAlbumIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Info about album "+Integer.toString(position+1), Toast.LENGTH_SHORT).show();

            }
        });

        // CLICKS ON PLAY ADD TO PLAYLIST BUTTON:  Show the toast with description of activity
        addToShoppingCartAlbumIB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Album has been added to Shopping Card", Toast.LENGTH_SHORT).show();
            }
        });
        return listItem;
    }
}
