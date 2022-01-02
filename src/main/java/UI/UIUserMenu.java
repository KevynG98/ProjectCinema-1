package UI;
import java.util.Scanner;
import static Controller.Movie.showMovie.showMovies;
import static UI.UIMenu.showMenu;

public class UIUserMenu {
    public static void userMenu(){
        int response = 0;
        do {
            System.out.println();
            System.out.println("User");
            System.out.println("Welcome " + UIAuthUser.userLogged.getNickname());
            System.out.println("1. Show Movies");
            System.out.println("0. Logout");
            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());
            switch (response){
                case 1 -> showMovies();
                case 0 -> showMenu();
                default -> System.out.println("The Number is not valid");
            }
        } while(response != 0);
    }


}
