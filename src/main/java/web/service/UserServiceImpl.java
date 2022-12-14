package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.User;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDao;

    @Override
    public List<User> allUsers() {
        return userDao.allUsers();
    }

    @Override
    public void addUser(User user) {
        if(user.getId() == null) {
            userDao.addUser(user);
        } else userDao.editUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.deleteUser(id);
    }

    @Override
    public User editUser(User user) {
        return userDao.editUser(user);
    }

    @Override
    public User getById(Long id) {
        return userDao.getById(id);
    }
}
