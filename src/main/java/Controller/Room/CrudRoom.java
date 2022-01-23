package Controller.Room;
import Model.RoomModel.Room;
import Utils.Files.FileManage;
import Utils.Interfaces.ICrud;
import java.io.*;
import java.util.Map;
import static Model.RoomModel.Rooms.roomList;

public class CrudRoom implements ICrud {
    Room room;
    FileManage file;
    public CrudRoom(){file = new FileManage("Room");}
    public Room getRoom() {
        return room;
    }
    public void setRoom(String name,String date){
        int sits[][] = new int[5][5];
        this.room = new Room((roomList.isEmpty())?1:roomList.size()+1,name,date,sits);
    }
    @Override
    public void read() {
        try {
            this.file.setInput();
            roomList  = (Map<String, Room>) this.file.getInput() ;
            this.file.closeInputStream();
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
        }
    }
    @Override
    public void write() {
        try {
            roomList.put(room.getName(),getRoom());
            this.file.OutputStreamProcess(roomList);
            this.file.closeOutputStream();
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
        }
    }

   /*public static void updateRoom(){
        try{
            File file = new File("Data/Room.txt");
            ObjectOutputStream writeData = new ObjectOutputStream(new FileOutputStream(file));
            writeData.writeObject(roomList);
            writeData.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }*/
}
