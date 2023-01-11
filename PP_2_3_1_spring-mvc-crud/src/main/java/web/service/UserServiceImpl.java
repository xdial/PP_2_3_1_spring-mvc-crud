package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUsers() {

        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void createUser(User user) {
        userDAO.createUser(user);

    }

    @Override
    public User getUser(int id) {

        return userDAO.getUser(id);
    }

    @Override
    @Transactional
    public User updateUser(User user, int id) {
        return userDAO.updateUser(user, id);
    }

    @Override
    @Transactional
    public void deleteUser(Integer id) {

        userDAO.deleteUser(id);
    }
}
