package TicketService;
import java.util.ArrayList;
import java.util.List;

import TicketService.TicketCalsses.Ticket;
public class ShoppingCart {
    private List<Ticket> tickets;

    public ShoppingCart() {
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public void removeTicket(Ticket ticket) {
        tickets.remove(ticket);
    }

    public List<Ticket> getTickets() {
        return tickets;
    }
}
