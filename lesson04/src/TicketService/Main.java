package TicketService;
import TicketService.Repo.*;
import TicketService.Services.*;
import TicketService.TicketClasses.TrainTicket;

public class Main {
    public static void main(String[] args) {
        // Создание репозитория пользователей и сервиса пользователей
        UserRepoImpl userRepo = new UserRepoImpl();
        UserService userService = new UserService(userRepo);

        // Создание репозитория билетов и сервиса билетов
        TicketRepoImpl ticketRepo = new TicketRepoImpl();
        TicketService ticketService = new TicketService(ticketRepo);

        // Создание пользователя и билета
        User user = new User(1, "Ivan", "Ivanov", "ivan123");
        TrainTicket ticket = new TrainTicket();

        // Установка значений для билета
        ticket.setDate(null);
        ticket.setPlace(1);
        ticket.setPrice(100);
        ticket.setRootNumber(1);
        ticket.setValid(true);
        ticket.setTrainNumber("123");
        ticket.setRailwayCompany("Railway");

        // Добавление пользователя и билета в соответствующие сервисы
        userService.addUser(user);
        ticketService.addTicket(ticket);

        // Добавление билета в корзину пользователя
        user.getShoppingCart().addTicket(ticket);

        // Вывод информации о пользователе и билетах
        System.out.println(user);
        System.out.println(ticketService.getTickets());
    }
}
