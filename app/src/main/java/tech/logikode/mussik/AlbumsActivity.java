package tech.logikode.mussik;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        int genrePosition = getIntent().getIntExtra("selectedGenre", 0);

        Genres genres = new Genres();
        Genre selectedGenre = genres.getGenres().get(genrePosition);

        ImageView genreCoverImage = findViewById(R.id.genreCoverImage);
        genreCoverImage.setImageResource(selectedGenre.getCoverImageId());

        TextView selectedGenreTitle = findViewById(R.id.selectedGenreTitle);
        selectedGenreTitle.setText(selectedGenre.getTitle());
    }

}
