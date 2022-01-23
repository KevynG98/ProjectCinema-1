package Controller.Movie;
import Model.MovieModel.Movie;
import java.util.Map;
import java.util.Scanner;

import static Model.MovieModel.Movies.movieList;

public class showMovie {
    public static void showMovies(){
        try{
            //Recupera todos los usuarios existentes
            CrudMovie movie = new CrudMovie();
            movie.read();
            for (Map.Entry<String,Movie> data: movieList.entrySet()) {
                System.out.println(data.getValue());
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        Scanner sc = new Scanner(System.in);
    }
}
