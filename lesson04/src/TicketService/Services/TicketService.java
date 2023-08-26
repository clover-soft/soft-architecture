package TicketService.Services;
import TicketService.TicketClasses.Ticket;
import TicketService.Repo.ITicketRepo;
import java.util.List;

// Класс TicketService
public class TicketService {
    private ITicketRepo ticketRepo;

    public TicketService(ITicketRepo ticketRepo) {
        this.ticketRepo = ticketRepo;
    }

    public void addTicket(Ticket ticket) {
        ticketRepo.addTicket(ticket);
    }

    public void removeTicket(Ticket ticket) {
        ticketRepo.removeTicket(ticket);
    }

    public List<Ticket> getTickets() {
        return ticketRepo.getTickets();
    }
}