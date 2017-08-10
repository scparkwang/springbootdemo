package com.scpark.hy.service;

import com.scpark.hy.domain.TuserModel;
import com.scpark.hy.domain.UserModel;

import java.util.ArrayList;

public interface TUserService
{

    TuserModel getUserByPhoneOrEmail(String emailOrPhone );

}
