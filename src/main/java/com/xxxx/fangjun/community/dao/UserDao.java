package com.xxxx.fangjun.community.dao;

import com.xxxx.fangjun.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    User selectUserById(int userid);
}
