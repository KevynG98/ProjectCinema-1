package UI;
import Model.Room;
import Utils.Auth.UserLogged;

import java.util.Scanner;
import static Controller.Movie.showMovie.showMovies;
import static Controller.RoomMovie.showRoomMovie.showRoomMovies;

public class UIUserMenu {
    public static void userMenu(){
        int response = 0;
        do {
            System.out.println();

            System.out.println("Welcome " + UserLogged.userLogged.getNickname());
            System.out.println("1. Show Movies");
            System.out.println("2. Choose Movies");
            System.out.println("0. Logout");
            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());

            switch (response){
                case 1 -> showMovies();
                case 2 -> showRoomMovies();
                case 0 -> response = 0;
                default -> System.out.println("The Number is not valid");
            }
        } while(response != 0);
    }


}
