package Reports;

import static Controller.Movie.CrudMovie.readMovie;
import static Model.Movies.movieList;

public class Report{


    void ticketSold(String title, int price, int numTickets){
        readMovie();
        int sold = 0;
        if (movieList.containsKey(title)) {
            sold += numTickets;
        }
            int total = sold * numTickets;
       }

}

/*
* que pelicula quieres ?
* cuando la quieres?
* mostrar matris
* cuantos tickets ? 3
* cuales asientos ?
* el precio es x
* confirmar ?
* - > title, price, numTickets

 */
