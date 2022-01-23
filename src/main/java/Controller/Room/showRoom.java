package Controller.Room;
import Model.RoomModel.Room;
import java.util.Map;
import java.util.Scanner;
import static Model.RoomModel.Rooms.roomList;

public class showRoom {
    public static void showRooms(){
            try{
                //Recupera todos los room
                CrudRoom room = new CrudRoom();
                room.read();
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

