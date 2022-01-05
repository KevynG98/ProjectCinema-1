package Controller.Movie;
import java.util.Scanner;
import static Controller.Movie.CrudMovie.*;
import static Model.MovieModel.Movies.movieList;
import static UI.AdminOptions.MovieOptions.UIReMovie.reMovie;

public class reMovie {

    public static void reMovies(String title,String premiere, int price){
        Scanner sc = new Scanner(System.in);
        try {
            CrudMovie Movie = new CrudMovie();
            //Recupera movies actuales
            Movie.read();


                if(movieList.containsKey(title)){
                    System.out.println("This name is not Available");
                    System.out.println("Please write a title Available");
                    sc.nextLine();
                    reMovie();
                }else{
                    Movie.setMovie(title, premiere, price);
                    Movie.write();
                }


        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
