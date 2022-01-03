package UI;
import java.util.Scanner;
import static Controller.Movie.showMovie.showMovies;
import static UI.UIAdminMenu.adminMenu;
import static UI.UIReMovie.reMovie;

public class UIMovie {
    public static void movieMenu(){
        int response;
        do{
            System.out.println("Choose an Option");
            System.out.println("1.Add Movie");
            System.out.println("2.Show Movies");
            System.out.println("3.Back");
            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1 ->{
                    reMovie();
                }
                case 2 ->{
                    showMovies();
                }
                case 3 ->{
                    adminMenu();
                }
                default -> {
                    System.out.println("error");
                }
            }
        }while(response != 0);
    }

}
