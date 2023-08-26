package TicketService.TicketClasses;
public class AirplaneTicket extends Ticket {
    private String flightNumber;
    private String airline;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public void printTicketDetails() {
        System.out.println("Airplane Ticket Details:");
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Airline: " + airline);
        System.out.println("Root Number: " + getRootNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Place: " + getPlace());
        System.out.println("Date: " + getDate());
        System.out.println("Is Valid: " + isValid());
    }
}