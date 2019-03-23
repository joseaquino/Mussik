package tech.logikode.mussik;

import java.util.ArrayList;

class Genres {
    private final ArrayList<Genre> genres = new ArrayList<>();

    Genres() {
        genres.add(new Genre("Jazz", R.drawable.jazz_cover));
        genres.add(new Genre("Rock", R.drawable.rock_and_roll_cover));
        genres.add(new Genre("Jazz", R.drawable.jazz_cover));
        genres.add(new Genre("Jazz", R.drawable.jazz_cover));
    }

    ArrayList<Genre> getGenres() {
        return genres;
    }
}
