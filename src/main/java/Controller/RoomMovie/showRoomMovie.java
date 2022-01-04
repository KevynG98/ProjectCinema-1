package Controller.RoomMovie;

import Model.Room;
import Model.RoomMovie;

import java.util.Map;
import java.util.Scanner;

import static Controller.Room.CrudRoom.readRoom;
import static Controller.Room.CrudRoom.updateRoom;
import static Controller.RoomMovie.CrudRoomMovie.readRoomMovie;
import static Model.RoomMovies.roomMovieList;
import static Model.Rooms.roomList;

public class showRoomMovie {
    public static void showRoomMovies(){
       readRoomMovie();
        try{
            //Recupera todos los room
            //Recorre los room
            for (Map.Entry<Integer, RoomMovie> data: roomMovieList.entrySet()) {
                System.out.println(data.getKey()+". "+data.getValue());
            }
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        Scanner sc = new Scanner(System.in);

        int response;

            System.out.println("Choose number movie");
            response = Integer.parseInt(sc.nextLine());

        for (Map.Entry<Integer, RoomMovie> data: roomMovieList.entrySet()) {
            if(data.getKey().equals(response)){
              String roomKey=  data.getValue().getRoom();
              String movieKey = data.getValue().getTitle();
              readRoom();
              if(roomList.containsKey(roomKey)){
                  System.out.println(movieKey);
                  System.out.println(roomKey);
                  roomList.get(roomKey).print();
                  int response2;
                  do{
                      System.out.println("ingrese una fila");
                      String y =  sc.nextLine();
                      System.out.println("ingrese una columna");
                      int x = Integer.parseInt(sc.nextLine());
                      roomList.get(roomKey).activateSit(y,x);
                      updateRoom();

                      System.out.println("do you want more sits?");
                      System.out.println("1.Yes");
                      System.out.println("2.no");
                      response2 = Integer.parseInt(sc.nextLine());

                      switch (response2){
                        //  case 1 ->
                          // case2 -> registrarTicket(MovieKey);
                      }

                  }while(response2 != 0);




                }
            }
        }


    }
}
