package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Ticket {
    private String movieTitle;
    private String Date;
    private int ticketAmount;
    private int price;
    private String seat;

    @Override
    public String toString() {
        return "Ticket{" +
                "MovieTitle='" + getMovieTitle() + '\'' +
                "Date='" + getDate() + '\'' +
                "Amount='" + getTicketAmount() + '\'' +
                "Price='" + getPrice() + '\'' +
                "Seat='" + getSeat() + '\'' +
                "}";
    }
}
