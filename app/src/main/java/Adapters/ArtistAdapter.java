package Adapters;

import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mohamedsamir1495.musical_structure_app.R;

import java.util.ArrayList;
import java.util.List;

import Models.ArtistModel;

public class ArtistAdapter extends ArrayAdapter<ArtistModel> {
    private Context mContext;
    private List<ArtistModel> artistList = new ArrayList<ArtistModel>();

    public ArtistAdapter(Context context, ArrayList<ArtistModel> list) {
        super(context, android.R.layout.simple_list_item_1, list);
        mContext = context;
        artistList = list;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.artist_row_cell, parent, false);

        ArtistModel currentArtist = artistList.get(position);

        TextView artistNameTV = (TextView) listItem.findViewById(R.id.artist_name);
        artistNameTV.setText(currentArtist.getArtistName());

        TextView artistAboutTV = (TextView) listItem.findViewById(R.id.artist_about);
        artistAboutTV.setText(currentArtist.getArtistAbout());

        ImageView artistImageIV = (ImageView) listItem.findViewById(R.id.artist_image);
        artistImageIV.setImageResource(currentArtist.getArtistImageId());

        Button readMoreBtn = (Button)listItem.findViewById(R.id.readMoreButtonArtist);
        readMoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Function not implemented. Missing Intent for opening browser", Toast.LENGTH_SHORT).show();
            }
        });
        return listItem;
    }
}

