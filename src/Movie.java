public class Movie {
    private String title;
    private String director;
    private int length;
    private int year;
    private String genre;

    // Constructor
    public Movie(String title, String director, int length, int year, String genre) {
        this.title = title;
        this.director = director;
        this.length = length;
        this.year = year;
        this.genre = genre;
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

}

