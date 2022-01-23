package Controller.Movie;
import java.util.Scanner;
import static Controller.Movie.CrudMovie.*;
import static Model.MovieModel.Movies.movieList;
import static UI.AdminOptions.MovieOptions.UIReMovie.reMovie;

public class reMovie {

    public static void reMovies(String title,String premiere, int price){
        Scanner sc = new Scanner(System.in);
        try {
            CrudMovie movie = new CrudMovie();
            //Recupera movies actuales
            movie.read();

                if(movieList.containsKey(title)){
                    System.out.println("This name is not Available");
                    System.out.println("Please write a title Available");
                    sc.nextLine();
                    reMovie();
                }else{
                    movie.setMovie(title, premiere, price);
                    movie.write();
                }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
