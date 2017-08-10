package com.scpark.hy.service;

import com.scpark.hy.domain.UserModel;

import java.util.ArrayList;

public interface UserService {
    ArrayList<UserModel> getAllUser();

    UserModel getUserByPhoneOrEmail(String emailOrPhone );

    UserModel getUserById(Long userId);

}
