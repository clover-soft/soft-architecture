package TicketService.TicketClasses;
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
    @Override
    public String toString() {
        StringBuilder ticketDetails = new StringBuilder();
        ticketDetails.append("Train Ticket Details:\n");
        ticketDetails.append("Train Number: ").append(trainNumber).append("\n");
        ticketDetails.append("Railway Company: ").append(railwayCompany).append("\n");
        ticketDetails.append("Root Number: ").append(getRootNumber()).append("\n");
        ticketDetails.append("Price: ").append(getPrice()).append("\n");
        ticketDetails.append("Place: ").append(getPlace()).append("\n");
        ticketDetails.append("Date: ").append(getDate()).append("\n");
        ticketDetails.append("Is Valid: ").append(isValid()).append("\n");
        return ticketDetails.toString();
    }
    
}