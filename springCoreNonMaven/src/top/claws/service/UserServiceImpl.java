package top.claws.service;

import top.claws.dao.UserDao;

/**
 * @author claws
 * @since 2023/4/16
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        System.out.println("User service adding...");
        userDao.add();
    }
}
