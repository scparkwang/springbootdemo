package com.scpark.hy.service.impl;


import com.scpark.hy.mapper.UserDao;
import com.scpark.hy.domain.UserModel;
import com.scpark.hy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public UserModel getUserById(Long userId) {

        return userDao.selectUserById(userId);
    }
    
    public UserModel getUserByPhoneOrEmail(String emailOrPhone ) {
        return userDao.selectUserByPhoneOrEmail(emailOrPhone);
    }
    
    public ArrayList<UserModel> getAllUser() {
        return userDao.selectAllUser();
    }
}
