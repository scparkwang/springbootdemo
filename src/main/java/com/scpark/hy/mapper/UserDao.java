package com.scpark.hy.mapper;


import com.scpark.hy.domain.UserModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserDao {
    UserModel selectUserById(@Param("userId") Long userId);

    UserModel selectUserByPhoneOrEmail(@Param("emailOrPhone") String emailOrPhone);

    ArrayList<UserModel> selectAllUser();
}
