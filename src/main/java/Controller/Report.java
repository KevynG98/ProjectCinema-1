package Controller;

import static Controller.Movie.CrudMovie.readMovie;
import static Model.Movies.movieList;

public class Report {


    void ticketSold(String title, int price, int numTickets){
        readMovie();
        int sold = 0;
        if (movieList.containsKey(title)) {
            sold += numTickets;
        }
            int total = sold * numTickets;
       }
}

/*spider

1

5 USD

1 2 3

*/
//--> title precio numTickets
