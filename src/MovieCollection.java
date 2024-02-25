import java.util.ArrayList;

public class MovieCollection {
    private ArrayList<Movie> collection;

    public MovieCollection() {
        collection = new ArrayList<>();
    }

    // Method to add a movie to the collection
    public void addMovie(String title, String director, int length, int year, String genre, boolean movieColour) {
        Movie movie = new Movie(title, director, length, year, genre, movieColour);
        collection.add(movie);
    }

    // Method to get the entire collection
    public ArrayList<Movie> getCollection() {
        return collection;
    }
    // Method to search for a movie by title
    public Movie searchByTitle(String title) {
        for (Movie movie : collection) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie; // Return the movie if found
            }
        }
        return null; // Return null if movie not found
    }
}
