package Controller.Room;

import java.util.Scanner;
import static Controller.Room.CrudRoom.*;
import static Model.Rooms.roomList;
import static UI.UIReRoom.IreRoom;

public class reRoom {
    public static void reRooms(String name,String date){
        Scanner sc = new Scanner(System.in);
        try{
            //Recupera rooms actuales y add nuevos
            readRoom();
            if(roomList.isEmpty()) {
                //Registra nuevos room
               writeRoom(name,date);
            }else{
                //Registra nuevos room
                if(roomList.containsKey(name)){
                    System.out.println("this name is not available");
                    System.out.println("please write an available name");
                    sc.nextLine();
                    IreRoom();
                }else{
                    writeNewRoom(name,date);
                }
            }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
