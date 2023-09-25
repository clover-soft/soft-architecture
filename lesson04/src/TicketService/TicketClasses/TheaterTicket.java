package TicketService.TicketClasses;
public class TheaterTicket extends Ticket {
    private String playName;
    private String theaterName;

    public String getPlayName() {
        return playName;
    }

    public void setPlayName(String playName) {
        this.playName = playName;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    @Override
    public void printTicketDetails() {
        System.out.println("Theater Ticket Details:");
        System.out.println("Play Name: " + playName);
        System.out.println("Theater Name: " + theaterName);
        System.out.println("Root Number: " + getRootNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Place: " + getPlace());
        System.out.println("Date: " + getDate());
        System.out.println("Is Valid: " + isValid());
    }
}