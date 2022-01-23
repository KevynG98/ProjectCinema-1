package Controller.RoomMovie;

import Model.RoomMovieModel.RoomMovie;

import java.util.Map;
import java.util.Scanner;

import static Controller.RoomMovie.CrudRoomMovie.*;
import static Model.RoomMovieModel.RoomMovies.roomMovieList;
import static UI.AdminOptions.RoomOptions.UIRegisterRoomMovie.reRoomMovie;


public class ReRoomMovie {
    public static void reRoomMovies(String title,String room){
        Scanner sc = new Scanner(System.in);
        try{
            //Recupera usuarios actuales y add nuevos
            CrudRoomMovie RoomMovie = new CrudRoomMovie();
            RoomMovie.read();

                //Registra nuevos usuarios
                    if(roomMovieList.containsKey(title)){
                        System.out.println("this name is not available");
                        System.out.println("please write an available Room");
                        sc.nextLine();
                    }else{
                        RoomMovie.setRoomMovie(title,room);
                        RoomMovie.write();
                    }

        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
