package TicketService.Services;
import java.util.ArrayList;
import java.util.List;

import TicketService.User;

public class UserService {
    private List<User> users;

    public UserService() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public List<User> getUsers() {
        return users;
    }
}
