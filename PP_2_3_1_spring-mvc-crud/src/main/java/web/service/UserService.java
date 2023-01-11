package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void createUser(User user);

    User getUser(int id);

    User updateUser(User user, int id);

    void deleteUser(Integer id);
}