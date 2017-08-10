package com.scpark.hy.controller;

;
import com.scpark.hy.domain.UserModel;
import com.scpark.hy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/Get")
    public UserModel GetByUserByPhoneOrEmail(@RequestBody UserModel userModel){
        return userService.getUserByPhoneOrEmail(userModel.getUserPhone());
    }
    @RequestMapping("/GetAll")
    public ArrayList<UserModel> GetALl(){
        return userService.getAllUser();
    }
}
