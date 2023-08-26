package TicketService.TicketCalsses;
public class TrainTicket extends Ticket {
    private String trainNumber;
    private String railwayCompany;

    public String getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getRailwayCompany() {
        return railwayCompany;
    }

    public void setRailwayCompany(String railwayCompany) {
        this.railwayCompany = railwayCompany;
    }

    @Override
    public void printTicketDetails() {
        System.out.println("Train Ticket Details:");
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Railway Company: " + railwayCompany);
        System.out.println("Root Number: " + getRootNumber());
        System.out.println("Price: " + getPrice());
        System.out.println("Place: " + getPlace());
        System.out.println("Date: " + getDate());
        System.out.println("Is Valid: " + isValid());
    }
}