package Controller.RoomMovie;

import Model.Room;
import Model.RoomMovie;

import java.util.Map;
import java.util.Scanner;

import static Controller.Room.CrudRoom.readRoom;
import static Controller.Room.CrudRoom.updateRoom;
import static Controller.RoomMovie.CrudRoomMovie.readRoomMovie;
import static Model.RoomMovies.roomMovieList;
import static Model.Rooms.roomList;

public class showRoomMovie {
    public static void showRoomMovies(){
       readRoomMovie();
        try{
            //Recupera todos los room
            //Recorre los room
            for (Map.Entry<Integer, RoomMovie> data: roomMovieList.entrySet()) {
                System.out.println(data.getKey()+". "+data.getValue());
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
