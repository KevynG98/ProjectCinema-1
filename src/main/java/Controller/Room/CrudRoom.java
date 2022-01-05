package Controller.Room;
import Model.RoomModel.Room;
import java.io.*;
import java.util.Map;

import static Model.RoomModel.Rooms.roomList;

public class CrudRoom {
    public static void readRoom() {
        try {
            File file = new File("Data/Room.txt");
            //Recupera usuarios actuales y add nuevos
            ObjectInputStream recoveryData = new ObjectInputStream(new FileInputStream(file));
            roomList  = (Map<String, Room>) recoveryData.readObject();
            recoveryData.close();
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
        }
    }
    public static void writeNewRoom(String name,String date){
        try{
            File file = new File("Data/Room.txt");
            int sits[][] = new int[5][5];
            roomList.put(name, new Room(roomList.size()+1,name,date,sits));
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(roomList);
            writeData.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
    public static void writeRoom(String name,String date){
        try{
            int sits[][] = new int[5][5];
            File file = new File("Data/Room.txt");
            roomList.put(name, new Room(1,name,date,sits));
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(roomList);
            writeData.close();
        }catch (Exception e){
            System.err.println(e.getMessage());
        }
    }
    public static void updateRoom(){
        try{
            File file = new File("Data/Room.txt");
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(roomList);
            writeData.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}
