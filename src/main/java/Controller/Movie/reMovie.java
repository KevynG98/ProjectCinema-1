package Controller.Movie;
import Model.Movie;
import java.util.Map;
import java.util.Scanner;
import static Controller.Movie.CrudMovie.*;
import static Model.Movies.movieList;
import static UI.UIReMovie.reMovie;

public class reMovie {

    public static void reMovies(String title,String premiere){
        Scanner sc = new Scanner(System.in);
        try {
            //Recupera movies actuales
            readMovie();
            if(movieList.size()>=1) {
                for(Map.Entry<Integer,Movie> data : movieList.entrySet()){
                    if(data.getValue().getTitle().equals(title)){
                        System.out.println("This name is not Available");
                        System.out.println("Please write a title Available");
                        sc.nextLine();
                        reMovie();
                    }else{
                        writeNewMovie(title, premiere);
                    }
                }
            }else if( movieList.size()<1){
          //Registra nuevos Movies si no hay ninguno
                writeMovie(title, premiere);
             }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
