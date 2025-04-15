package services;

import models.User;
import java.util.*;

public class UserService {
    private Map<String, User> users = new HashMap<>();

    public boolean register(String username, String password) {
        if (users.containsKey(username)) return false;
        users.put(username, new User(username, password));
        return true;
    }

    public User login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.checkPassword(password)) return user;
        return null;
    }

    public User findUser(String username) {
        return users.get(username);
    }

    public Collection<User> getAllUsers() {
        return users.values();
    }
}
