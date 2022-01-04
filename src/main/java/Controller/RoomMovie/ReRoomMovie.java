package Controller.RoomMovie;

import Model.RoomMovie;
import Model.RoomMovies;

import java.util.Map;
import java.util.Scanner;

import static Controller.RoomMovie.CrudRoomMovie.*;
import static Model.RoomMovies.roomMovieList;
import static UI.UIRegisterRoomMovie.reRoomMovie;


public class ReRoomMovie {
    public static void reRoomMovies(String title,String room){
        Scanner sc = new Scanner(System.in);
        try{
            //Recupera usuarios actuales y add nuevos
            readRoomMovie();
            if(roomMovieList.isEmpty()) {

                //Registra nuevos usuarios si no hay ninguno.
                writeRoomMovie(title,room);

            }else{
                //Registra nuevos usuarios
                for(Map.Entry<Integer, RoomMovie> data : roomMovieList.entrySet()){
                    if(data.getValue().getRoom().equals(room)){
                        System.out.println("this name is not available");
                        System.out.println("please write an available Room");
                        sc.nextLine();
                        reRoomMovie();
                    }else{
                        writeNewRoomMovie(title,room);
                    }
                }

            }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
