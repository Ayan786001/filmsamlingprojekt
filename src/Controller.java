import java.util.ArrayList;
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
}
