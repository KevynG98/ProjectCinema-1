package Controller.Room;

import java.util.Scanner;
import static Controller.Room.CrudRoom.*;
import static Model.RoomModel.Rooms.roomList;

public class reRoom {
    public static void reRooms(String name,String date){
        Scanner sc = new Scanner(System.in);
        try{
            //Recupera rooms actuales y add nuevos
            CrudRoom room  = new CrudRoom();
            room.read();
                //Registra nuevos room
                if(roomList.containsKey(name)){
                    System.out.println("this name is not available");
                    System.out.println("please write an available name");
                    sc.nextLine();
                   // IreRoom();
                }else {
                    room.setRoom(name,date);
                    room.write();
                }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
