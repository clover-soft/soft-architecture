package TicketService.Repo;
import java.util.List;
import TicketService.User;
public interface IUserRepo {
    void addUser(User user);
    void removeUser(User user);
    List<User> getUsers();
    void updateUser(User user);
}