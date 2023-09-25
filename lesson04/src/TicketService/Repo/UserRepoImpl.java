package TicketService.Repo;

import java.util.ArrayList;
import java.util.List;
import TicketService.User;

// Реализация интерфейса IUserRepo
public class UserRepoImpl implements IUserRepo {
    private List<User> userList;

    public UserRepoImpl() {
        this.userList = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }

    @Override
    public void removeUser(User user) {
        userList.remove(user);
    }

    @Override
    public List<User> getUsers() {
        return userList;
    }

    @Override
    public void updateUser(User user) {
        // Реализация обновления информации о пользователе
    }
}