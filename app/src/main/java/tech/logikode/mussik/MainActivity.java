package tech.logikode.mussik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        genresGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent genreIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                genreIntent.putExtra("selectedGenre", position);
                startActivity(genreIntent);
            }
        });
    }
}
