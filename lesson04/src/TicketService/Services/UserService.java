package TicketService.Services;
import java.util.List;
import TicketService.Repo.IUserRepo;
import TicketService.User;

// Класс UserService
public class UserService {
    private IUserRepo userRepo;

    public UserService(IUserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public void addUser(User user) {
        userRepo.addUser(user);
    }

    public void removeUser(User user) {
        userRepo.removeUser(user);
    }

    public List<User> getUsers() {
        return userRepo.getUsers();
    }

    public void updateUser(User user) {
        userRepo.updateUser(user);
    }
}
