package tech.logikode.mussik;

import java.util.ArrayList;

class Genres {
    private final ArrayList<Genre> genres;

    Genres() {
        genres = createGenres();
    }

    ArrayList<Genre> getGenres() {
        return genres;
    }

    private ArrayList<Genre> createGenres() {
        ArrayList<Genre> genresList = new ArrayList<>();
        
        genresList.add(new Genre("Jazz", R.drawable.jazz_cover));
        genresList.add(new Genre("Rock", R.drawable.rock_and_roll_cover));
        genresList.add(new Genre("Dance", R.drawable.dance_cover));
        genresList.add(new Genre("Pop", R.drawable.pop_cover));
        genresList.add(new Genre("Rap", R.drawable.rap_cover));
        genresList.add(new Genre("Chill", R.drawable.chill_cover));
        genresList.add(new Genre("Country", R.drawable.country_cover));
        genresList.add(new Genre("Classical", R.drawable.classical_cover));

        return genresList;
    }
}
