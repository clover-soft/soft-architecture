package TicketService.TicketClasses;
import java.time.LocalDateTime;

public abstract class Ticket {
    private long rootNumber;
    private double price;
    private int place;
    private LocalDateTime date;
    private boolean isValid;

    public long getRootNumber() {
        return rootNumber;
    }

    public void setRootNumber(long rootNumber) {
        this.rootNumber = rootNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public abstract void printTicketDetails();
}
