package Controller.RoomMovie;


import Model.RoomMovieModel.RoomMovie;
import java.io.*;
import java.util.Map;
import static Model.RoomMovieModel.RoomMovies.roomMovieList;


public class CrudRoomMovie {
    public static void readRoomMovie() {
        try {
            File file = new File("Data/RoomMovie.txt");
            //Recupera usuarios RoomMovies y add nuevos
            ObjectInputStream recoveryData = new ObjectInputStream(new FileInputStream(file));
            roomMovieList  = (Map<Integer, RoomMovie>) recoveryData.readObject();
            recoveryData.close();
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
        }
    }
    public static void writeNewRoomMovie(String title,String room){
        try{
            File file = new File("Data/RoomMovie.txt");
            roomMovieList.put(roomMovieList.size()+1, new RoomMovie(title,room));
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(roomMovieList);
            writeData.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public static void writeRoomMovie(String title,String room){
        try{
            File file = new File("Data/RoomMovie.txt");
            roomMovieList.put(1, new RoomMovie(title,room));
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(roomMovieList);
            writeData.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }

}
