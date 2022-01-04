package Controller.Room;
import Model.Room;
import java.util.Map;
import java.util.Scanner;
import static Controller.Room.CrudRoom.readRoom;
import static Model.Rooms.roomList;


public class showRoom {
    public static void showRooms(){
            try{
                //Recupera todos los room
                readRoom();
                //Recorre los room
                for (Map.Entry<String, Room> data: roomList.entrySet()) {
                    System.out.println(data.getValue());
                }
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        Scanner sc = new Scanner(System.in);

        }
    }

