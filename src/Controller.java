import java.util.ArrayList;
public class Controller {
    private MovieCollection collection;

    public Controller() {
        collection = new MovieCollection();
    }

    public void addMovie(String title, String director, int length, int year, String genre) {
        collection.addMovie(title, director, length, year, genre);
    }
}
