package UI;

import java.util.Scanner;
import static Controller.Room.reRoom.reRooms;


public class UIReRoom {
    public static void IreRoom() {
            int response;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Room name");
                String name = sc.nextLine();
                System.out.println("date room dd-mm-yy");
                String date = sc.nextLine();

                System.out.println("1.confirm");
                System.out.println("2.exit");
                response = Integer.parseInt(sc.nextLine());

                switch (response) {
                    case 1-> reRooms(name,date);
                    case 2-> response = 0;
                    default -> System.out.println("invalid option");
                }

            }while(response != 0);
    }
}
