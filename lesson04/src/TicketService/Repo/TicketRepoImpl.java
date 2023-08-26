package TicketService.Repo;
import java.util.ArrayList;
import java.util.List;
import TicketService.TicketClasses.*;
// Реализация интерфейса ITicketRepo
public class TicketRepoImpl implements ITicketRepo {
    private List<Ticket> ticketList;

    public TicketRepoImpl() {
        this.ticketList = new ArrayList<>();
    }

    @Override
    public void addTicket(Ticket ticket) {
        ticketList.add(ticket);
    }

    @Override
    public void removeTicket(Ticket ticket) {
        ticketList.remove(ticket);
    }

    @Override
    public List<Ticket> getTickets() {
        return ticketList;
    }
}
