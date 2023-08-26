package TicketService;
import TicketService.TicketCalsses.Ticket;
public class TicketValidator {
    public boolean validateTicket(Ticket ticket) {
        // Логика для проверки валидности билета
        return ticket.isValid();
    }
}