package com.xxxx.fangjun.community.service.impl;

import com.xxxx.fangjun.community.dao.UserDao;
import com.xxxx.fangjun.community.entity.User;
import com.xxxx.fangjun.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(int userId){
        return userDao.selectUserById(userId);
    }
}
