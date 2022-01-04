package Controller.RoomMovie;

import Model.Room;
import Model.RoomMovie;

import java.util.Map;
import java.util.Scanner;

import static Controller.RoomMovie.CrudRoomMovie.readRoomMovie;
import static Model.RoomMovies.roomMovieList;

public class showRoomMovie {
    public static void showRoomMovies(){
        try{
            //Recupera todos los room
            readRoomMovie();
            //Recorre los room
            for (Map.Entry<Integer, RoomMovie> data: roomMovieList.entrySet()) {
                System.out.println(data.getKey()+". "+data.getValue());
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        Scanner sc = new Scanner(System.in);

    }
}
