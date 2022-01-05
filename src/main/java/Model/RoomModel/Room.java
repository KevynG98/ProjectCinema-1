package Model.RoomModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Locale;

import static Controller.Room.CrudRoom.updateRoom;

@AllArgsConstructor
@Setter
@Getter
public class Room implements Serializable {

    long id;
    String name;
    String date;
    int sits[][];



    public void init(){
       for (int i = 0; i< sits.length ; i++){
           for(int j = 0; j< sits.length; j++){
               sits[i][j] = 0;
           }
       }
       updateRoom();
   }

  public void print(){
      int x = 0;
      char c = 'A';
      for (int i = 0; i< sits.length; i++){
          for(int j = 0; j< sits.length; j++){
              if(i==0){
                  for(; x< sits.length+1; x++) {
                      System.out.print(x + " ");
                      System.out.print((x == sits.length)?"\n":"");
                  }

              }
              System.out.print(((j == 0)?c+" ":"")+sits[i][j]+" ");
              }
          ++c;
          System.out.println();
          }
      }

    public void activateSit(String row, int col){
        char c = 'A';
        int x = 0;

        for(; c <= 'Z'; ++c){
            if(row.equals(Character.toString(c))){
                break;
            }
            x++;
        }

        sits[x][col-1] = 1;
    }
    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", Name='" + getName() + '\'' +
                '}';
    }
}