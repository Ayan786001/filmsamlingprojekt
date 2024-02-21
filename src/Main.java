import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        // Opret et filmobjekt
        Movie movie = new Movie(title, director, length, year, genre);

        // Test ved at udskrive filmobjektets indhold
        System.out.println("Movie added to collection:");
        System.out.println(movie);
    }
}
