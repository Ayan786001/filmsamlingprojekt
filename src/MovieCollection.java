import java.util.ArrayList;
public class MovieCollection {
private ArrayList<Movie> collection;
public MovieCollection(){
    collection= new ArrayList<Movie>();
}



    // Metode til at tilføje en film til samlingen
    public void addMovie(String title, String director, int length, int year, String genre) {
   Movie movie  = new Movie(title,director,length,year,genre );
   collection.add(movie);

    }
    public ArrayList<Movie> getCollection(){
        return  collection;
    }
}
