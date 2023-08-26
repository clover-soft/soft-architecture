package TicketService;
import TicketService.TicketClasses.Ticket;
public class TicketValidator {
    public boolean validateTicket(Ticket ticket) {
        // Логика для проверки валидности билета
        return ticket.isValid();
    }
}