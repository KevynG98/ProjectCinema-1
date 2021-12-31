package Controller.Movie;
import Model.Movie;
import java.io.*;
import java.util.Map;
import static Model.Movies.movieList;

public class CrudMovie {

    public static void readMovie(){
        File file = new File("Data/Movies.txt");
        try{
            ObjectInputStream recoveryData = new ObjectInputStream(new FileInputStream(file));
            movieList = (Map<Integer, Movie>) recoveryData.readObject();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }

    }
    public static void writeNewMovie(String title,String premiere){
        try{
            File file = new File("Data/Movies.txt");
            movieList.put(movieList.size()+1, new Movie(movieList.size()+1,title,premiere));
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(movieList);
            writeData.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public static void writeMovie(String title,String premiere){
        try{
            File file = new File("Data/Movies.txt");
            movieList.put(1, new Movie(1, title, premiere));
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(movieList);
            writeData.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

}
