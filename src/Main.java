import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        int opret = 0;
        int SENTINEL = 2;
        while (opret != SENTINEL) {
            System.out.println("");
            System.out.println("Menu:");
            System.out.println("1. Opret en ny film");
            System.out.println("2. Afslut programmet");
            System.out.println("3. Her er din showliste");
            System.out.println("4. Søg efter en film");
            System.out.print("Vælg en handling: ");
            opret = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (opret) {
                case 1:
                    // Opret en ny film
                    // Indlæs data fra brugeren
                    System.out.println("Enter movie title:");
                    String title = scanner.nextLine();

                    System.out.println("Enter movie director:");
                    String director = scanner.nextLine();

                    System.out.println("Enter movie length in minutes:");
                    int length = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.println("Enter movie creation year:");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character

                    System.out.println("Enter movie genre:");
                    String genre = scanner.nextLine();

                    System.out.println("Is the movie in colour (yes or no)");
                    String input = scanner.next();
                    boolean movieColour = input.equalsIgnoreCase("yes");

                    controller.addMovie(title, director, length, year, genre, movieColour);
                    System.out.println(title + " Movie er lavet ");
                    break;
                case 2:
                    // Afslut programmet
                    System.out.println("Programmet afsluttes.");
                    break;
                case 3:
                    // Vis showliste
                    System.out.println("Here is your showliste of all the movies:");
                    for (Movie movie : controller.getMovies()) {
                        System.out.println(movie.toString());
                    }
                    break;
                case 4:
                    // Søg efter en film
                    System.out.println("Enter the title of the movie you want to search for:");
                    String searchTitle = scanner.nextLine();
                    Movie foundMovie = controller.searchByTitle(searchTitle);
                    if (foundMovie != null) {
                        System.out.println("Movie found: ");
                        System.out.println(foundMovie.toString());
                    } else {
                        System.out.println("Movie not found.");
                    }
                    break;
                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
            }
        }
        scanner.close();
    }
}
