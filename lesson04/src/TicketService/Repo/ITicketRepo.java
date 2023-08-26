package TicketService.Repo;
import java.util.List;
import TicketService.TicketClasses.*;
public interface ITicketRepo {
    void addTicket(Ticket ticket);
    void removeTicket(Ticket ticket);
    List<Ticket> getTickets();
}