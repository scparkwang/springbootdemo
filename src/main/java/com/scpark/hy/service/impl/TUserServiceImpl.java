package com.scpark.hy.service.impl;

import com.scpark.hy.domain.TuserModel;
import com.scpark.hy.mapper.TuserModelMapper;
import com.scpark.hy.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class TUserServiceImpl implements TUserService
{
    @Autowired
    private TuserModelMapper tuserModelMapper;

    @Override
    public TuserModel getUserByPhoneOrEmail(String emailOrPhone) {
        return tuserModelMapper.selectUserByPhoneOrEmail(emailOrPhone);
    }
}
