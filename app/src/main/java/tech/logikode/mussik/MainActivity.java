package tech.logikode.mussik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView genresGrid = findViewById(R.id.genresGrid);
        Genres genres = new Genres();

        GenreAdapter genreAdapter = new GenreAdapter(this, genres.getGenres());

        genresGrid.setAdapter(genreAdapter);
    }
}
