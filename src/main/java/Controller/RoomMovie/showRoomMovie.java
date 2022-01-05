package Controller.RoomMovie;

import Model.RoomMovieModel.RoomMovie;

import java.util.Map;

import static Controller.RoomMovie.CrudRoomMovie.readRoomMovie;
import static Model.RoomMovieModel.RoomMovies.roomMovieList;

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
