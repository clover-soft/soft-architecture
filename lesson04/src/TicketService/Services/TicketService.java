package TicketService.Services;
import TicketService.TicketCalsses.Ticket;
import java.util.List;
import java.util.ArrayList;
public class TicketService {
    private List<Ticket> tickets;

    public TicketService() {
        tickets = new ArrayList<>();
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