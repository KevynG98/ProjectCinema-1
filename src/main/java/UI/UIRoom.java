package UI;

import java.util.Scanner;
import static Controller.Room.showRoom.showRooms;
import static UI.UIReRoom.IreRoom;

public class UIRoom {

    public static void roomMenu(){
        int response;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Register Room");
            System.out.println("2.Show Room");
            System.out.println("3.Back");
            response = Integer.parseInt(sc.nextLine());

            switch (response) {
                case 1 -> IreRoom();
                case 2 -> showRooms();
                case 3 -> response = 0;
                default -> System.out.println("Invalid Option");
            }

        }while(response != 0 );
    }


}
