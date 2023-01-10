package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public void createUser(User user);
    public User getUser(int id);
    public User updateUser(User user, int id);
    public void deleteUser(Integer id);
}