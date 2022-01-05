package UI.AdminOptions.MovieOptions;
import java.util.Scanner;
import static Controller.Movie.reMovie.reMovies;

public class UIReMovie {
    public static void reMovie(){
        int response;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Title movie");
            String title = sc.nextLine();
            System.out.println("Ticket price");
            String price = sc.nextLine();
            System.out.println("Premiere date (DD-MM-YY)");
            String premiere = sc.nextLine();

            System.out.println("1.Confirm");
            System.out.println("2.To rewrite");
            System.out.println("3.back");
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1 ->{
                    reMovies(title,premiere,Integer.parseInt(price));
                    response = 0;
                }
                case 2 -> response = 1;
                case 3 -> response= 0;
                default -> System.out.println("Option invalid");
            }
        }while(response != 0);
    }
}
