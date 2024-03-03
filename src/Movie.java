public class Movie {
    String title;
    private String director;

    private int length;
    private int year;
    private String genre;
    private boolean movieColour;

    // Constructor
    public Movie(String title, String director, int length, int year, String genre, boolean movieColour) {
        this.title = title;
        this.director = director;
        this.length = length;
        this.year = year;
        this.genre = genre;
        this.movieColour = movieColour;
    }

    // Getter metoder
    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }


    public boolean getColour() {
        return movieColour;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Director: " + director +
                ", Length: " + length + ", Year: " + year +
                ", Genre: " + genre + ", Movie Colour: " + (movieColour ? "Coloured" : "Black and White");
    }


    public void setDirector(String director) {
        this.director = director;
    }
    public void setTitle (String title){
    this.title = title;

    }
    public void setLength(int length){
        this.length = length;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setGenre(String genre){
    this.genre= genre;
    }
    public void setMovieColour(Boolean movieColour){
        this.movieColour = movieColour;
    }

}
