package Controller.RoomMovie;

import Model.RoomMovieModel.RoomMovie;
import Utils.Files.FileManage;
import Utils.Interfaces.ICrud;
import java.util.Map;
import static Model.RoomMovieModel.RoomMovies.roomMovieList;

public class CrudRoomMovie implements ICrud {

    RoomMovie roomMovie;
    FileManage file;

    public CrudRoomMovie(){
        file = new FileManage("RoomMovie");
    }
    public RoomMovie getRoomMovie(){
        return roomMovie;
}
    public void setRoomMovie(String title, String room){
        this.roomMovie = new RoomMovie(title,room);
}
    @Override
    public void read() {
        try {
            this.file.setInput();
            roomMovieList  = (Map<Integer, RoomMovie>) this.file.getInput() ;
            this.file.closeInputStream();
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
        }
    }
    @Override
    public void write() {
        try {
            roomMovieList.put((roomMovieList.isEmpty())?1:roomMovieList.size()+1, getRoomMovie());
            this.file.OutputStreamProcess(roomMovieList);
            this.file.closeOutputStream();
        } catch (Exception e) {
            if(e.getMessage() != null)
                System.err.println(e.getMessage());
        }
    }


}
