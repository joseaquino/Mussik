package tech.logikode.mussik;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GenreAdapter extends ArrayAdapter<Genre> {
    GenreAdapter(Activity context, ArrayList<Genre> genres) {
        super(context, 0, genres);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View genreView = convertView;

        if (genreView == null) {
            genreView = LayoutInflater.from(getContext()).inflate(R.layout.genre_list_item, parent, false);
        }

        Genre currentGenre = getItem(position);

        TextView genreTitle = genreView.findViewById(R.id.genreTitle);
        genreTitle.setText(currentGenre.getTitle());

        ImageView coverImage = genreView.findViewById(R.id.coverImage);
        coverImage.setImageResource(currentGenre.getCoverImageId());

        return genreView;
    }
}
