package UI;
import java.util.Scanner;
import static Controller.Movie.reMovie.reMovies;
import static UI.UIMovie.movieMenu;

public class UIReMovie {
    public static void reMovie(){
        int response;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Title movie");
            String title = sc.nextLine();
            System.out.println("Premiere date (DD-MM-YY)");
            String premiere = sc.nextLine();
            System.out.println("1.Confirm");
            System.out.println("2.To rewrite");
            System.out.println("3.back");
            response = Integer.parseInt(sc.nextLine());
            switch (response){
                case 1 ->{
                    reMovies(title,premiere);
                    movieMenu();
                }
                case 2 -> reMovie();
                case 3 -> movieMenu();
                default -> System.out.println("error");
            }
        }while(response != 0);
    }
}
