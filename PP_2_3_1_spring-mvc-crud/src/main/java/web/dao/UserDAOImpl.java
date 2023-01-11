package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();

    }

    @Override
    @Transactional
    public void createUser(User user) {
        entityManager.persist(user);
    }

    @Override
    @Transactional
    public User getUser(Integer id) {

        return entityManager.find(User.class, id);
    }

    @Override
    @Transactional
    public User updateUser(User user, int id) {
        User userToBeUpdated = getUser(id);
        userToBeUpdated.setName(user.getName());
        userToBeUpdated.setLastName(user.getLastName());
        userToBeUpdated.setPhoneNumber(user.getPhoneNumber());
        return entityManager.merge(userToBeUpdated);
    }

    @Override
    @Transactional
    public void deleteUser(Integer id) {
        entityManager.remove(getUser(id));
    }
}
