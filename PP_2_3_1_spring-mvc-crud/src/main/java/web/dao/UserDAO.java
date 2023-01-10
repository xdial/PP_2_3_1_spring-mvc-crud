package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    public List<User> getAllUsers();

    public void createUser(User user);

    public User getUser(Integer id);

    public User updateUser(User user, int id);

    public void deleteUser(Integer id);

}