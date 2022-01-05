package UI.UserOptions;

import Controller.Movie.CrudMovie;
import Model.RoomMovieModel.RoomMovie;
import Model.TicketModel.Ticket;

import java.util.Map;
import java.util.Scanner;

import static Controller.Room.CrudRoom.readRoom;
import static Controller.Room.CrudRoom.updateRoom;
import static Controller.RoomMovie.showRoomMovie.showRoomMovies;
import static Model.MovieModel.Movies.movieList;
import static Model.RoomMovieModel.RoomMovies.roomMovieList;
import static Model.RoomModel.Rooms.roomList;
import static Utils.Mailing.Mail.SendTicketTo;

public class UITicketMenu {

    public static void UIBuyTicket() throws Exception {

        showRoomMovies();
        Ticket MailSender= new Ticket();
        int response;
        Scanner sc = new Scanner(System.in);
        StringBuilder Seat = new StringBuilder();
        System.out.println("Choose number movie");
        response = Integer.parseInt(sc.nextLine());
        CrudMovie movie = new CrudMovie();

        for (Map.Entry<Integer, RoomMovie> data: roomMovieList.entrySet()) {
            if(data.getKey().equals(response)){
                String roomKey=  data.getValue().getRoom();
                String movieKey = data.getValue().getTitle();
                movieKey = movieKey.toLowerCase();
                System.out.println(movieKey);
                movie.read();

                if(roomList.containsKey(roomKey) && movieList.containsKey(movieKey)){
                    System.out.println(movieKey);
                    System.out.println(roomKey.toUpperCase());

                    roomList.get(roomKey).print();
                    System.out.println("How many seats you want?");
                    int seatsNumber = Integer.parseInt(sc.nextLine());

                    MailSender.setMovieTitle(movieKey);
                    MailSender.setSitsAmount(seatsNumber);
                    MailSender.setDate(movieList.get(movieKey).getPremiere());
                    MailSender.setPrice(movieList.get(movieKey).getPrice()*seatsNumber);

                    for(int i =0; i< seatsNumber; i++) {
                        System.out.println("You are selecting your seat number: "+ (i+1));
                        System.out.println("Insert Row: ");
                        String y = sc.nextLine();
                        y = y.toUpperCase();
                        System.out.println("Insert Column: ");
                        int x = Integer.parseInt(sc.nextLine());
                        Seat.append(" "+y+x+" ");
                        roomList.get(roomKey).activateSit(y, x);
                    }
                    System.out.println("The total price is: "+MailSender.getPrice());
                    MailSender.setSeat(Seat.toString());
                }
            }
        }





        System.out.println("1.Confirm");
        System.out.println("2.back");
        System.out.println("3.exit");
        response = Integer.parseInt(sc.nextLine());
        switch (response) {
            case 1 -> {
                updateRoom();
                SendTicketTo(MailSender);
                System.out.println();
            }

            case 2-> UIBuyTicket();

            case 3-> System.out.println("Exiting from buy ticket system!!");

        }
    }
}
