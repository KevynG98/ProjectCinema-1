package Controller.Movie;
import Model.Movie;
import java.util.Map;
import java.util.Scanner;
import static Controller.Movie.CrudMovie.*;
import static Model.Movies.movieList;
import static UI.UIReMovie.reMovie;

public class reMovie {

    public static void reMovies(String title,String premiere, int price){
        Scanner sc = new Scanner(System.in);
        try {
            //Recupera movies actuales
            readMovie();
            if(movieList.isEmpty()) {
                //Registra nuevos Movies si no hay ninguno
                writeMovie(title, premiere,price);
            }else{

                if(movieList.containsKey(title)){
                    System.out.println("This name is not Available");
                    System.out.println("Please write a title Available");
                    sc.nextLine();
                    reMovie();
                }else{
                    writeNewMovie(title, premiere, price);
                }

             }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
