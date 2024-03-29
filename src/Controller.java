import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Controller {
    private List<Movie> collection;

    public Controller() {
        this.collection = new ArrayList<>();
    }

    public void addMovie(String title, String director, int length, int year, String genre, boolean movieColour) {
        Movie movie = new Movie(title, director, length, year, genre, movieColour);
        collection.add(movie);
    }

    public List<Movie> getMovies() {
        return collection;
    }

    public Movie searchByTitle(String title) {
        for (Movie movie : collection) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null; // Return null if movie not found
    }

    public static void editMovie(String title, String newTitle, String director, int length, int year, String genre, boolean movieColour) {
        ArrayList<Movie> moviesToEdit = new ArrayList<>();
        for (Movie movie : moviesToEdit) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                moviesToEdit.add(movie);
            }
        }

        if (!moviesToEdit.isEmpty()) {
            Movie movieToEdit = moviesToEdit.get(0);

            movieToEdit.setTitle(newTitle);
            movieToEdit.setDirector(director);
            movieToEdit.setMovieColour(movieColour);
            movieToEdit.setLength(length);
            movieToEdit.setYear(year);
            movieToEdit.setGenre(genre);
        } else {
            System.out.println("Der blev ikke fundet en film med navnet " + title);
        }


    }
}
