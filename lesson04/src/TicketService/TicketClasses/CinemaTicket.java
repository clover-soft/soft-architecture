package TicketService.TicketClasses;
public class CinemaTicket extends Ticket {
    private String movieName;
    private String cinemaName;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    @Override
    public void printTicketDetails() {
        System.out.println("Cinema Ticket Details:");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Cinema Name: " + cinemaName);
        System.out.println("Root Number: " + getRootNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Place: " + getPlace());
        System.out.println("Date: " + getDate());
        System.out.println("Is Valid: " + isValid());
    }
}