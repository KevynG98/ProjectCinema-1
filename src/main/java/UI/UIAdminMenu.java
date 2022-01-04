package UI;


import java.util.Scanner;
import static Controller.Admin.showAdmin.showAdmins;
import static Controller.Movie.reMovie.reMovies;
import static Controller.User.showUser.showUsers;
import static UI.UIMenu.showMenu;
import static UI.UIRegisterAdmin.registerAdmin;
import static UI.UIRoom.roomMenu;

import Utils.Auth.UserLogged;

public class UIAdminMenu {

    public static void adminMenu() {
        int response = 0;
        do {
            System.out.println();
            System.out.println("1. Show users");
            System.out.println("2. Show Admin");
            System.out.println("3. Register admin");
            System.out.println("4. Register Movie");
            System.out.println("5. Room Menu");
            System.out.println("0. Logout");
            Scanner sc = new Scanner(System.in);
            response = Integer.parseInt(sc.nextLine());
            switch (response) {
                case 1 -> showUsers();
                case 2-> showAdmins();
                case 3 -> registerAdmin();
                case 4 -> UIMovie.movieMenu();
                case 5 -> roomMenu();
                case 0 -> showMenu();
                default -> System.out.println("The Number is not valid");
            }
        }
            while (response != 0) ;
    }
}