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
            movieList = (Map<String, Movie>) recoveryData.readObject();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }

    }
    public static void writeNewMovie(String title,String premiere,int price){
        try{
            File file = new File("Data/Movies.txt");
            movieList.put(title, new Movie(movieList.size()+1,title,premiere, price));
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(movieList);
            writeData.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public static void writeMovie(String title,String premiere, int price){
        try{
            File file = new File("Data/Movies.txt");
            movieList.put(title, new Movie(1, title, premiere, price));
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(movieList);
            writeData.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

}
