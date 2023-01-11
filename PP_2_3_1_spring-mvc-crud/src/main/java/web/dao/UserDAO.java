package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void createUser(User user);

    User getUser(Integer id);

    User updateUser(User user, int id);

    void deleteUser(Integer id);

}