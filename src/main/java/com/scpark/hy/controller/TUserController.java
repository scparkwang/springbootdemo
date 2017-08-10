package com.scpark.hy.controller;

import com.scpark.hy.domain.TuserModel;
import com.scpark.hy.domain.UserModel;
import com.scpark.hy.service.TUserService;
import com.scpark.hy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/TUser")
public class TUserController {
    @Autowired
    private TUserService userService;
    @RequestMapping("/Get")
    public TuserModel GetByUserByPhoneOrEmail(){

        return userService.getUserByPhoneOrEmail("13285250574");
    }


}

