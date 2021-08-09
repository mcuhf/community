package com.xxxx.fangjun.community.service.impl;

import com.xxxx.fangjun.community.dao.DiscussPostDao;
import com.xxxx.fangjun.community.entity.DiscussPost;
import com.xxxx.fangjun.community.service.DiscussPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscussPostServiceImpl implements DiscussPostService {

    @Autowired
    private DiscussPostDao discussPostDao;

    @Override
    public List<DiscussPost> getDiscussPost(int userId, int offset, int limit){
        List<DiscussPost> allDiscussPost = discussPostDao.getAllDiscussPost(userId, offset, limit);
        return allDiscussPost;
    }

    @Override
    public int selectDiscussPostRows(int userId){
        int count = discussPostDao.selectDiscussPostRows(userId);
        return count;
    }
}
