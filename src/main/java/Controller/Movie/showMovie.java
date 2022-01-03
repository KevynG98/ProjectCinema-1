package Controller.Movie;
import Model.Movie;
import java.util.Map;
import java.util.Scanner;
import static Model.Movies.movieList;
import static Controller.Movie.CrudMovie.readMovie;
import static UI.UIUserMenu.userMenu;

public class showMovie {
    public static void showMovies(){
        try{
            //Recupera todos los usuarios existentes
         readMovie();
            for (Map.Entry<String,Movie> data: movieList.entrySet()) {
                System.out.println(data.getValue());
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        int response;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1.Back");
            response = Integer.parseInt(sc.nextLine());
            if (response == 1) {
                userMenu();
            } else {
                System.out.println("Error");
            }
        }while(response!=0);
    }
}
