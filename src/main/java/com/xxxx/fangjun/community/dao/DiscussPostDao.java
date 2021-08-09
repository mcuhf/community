package com.xxxx.fangjun.community.dao;

import com.xxxx.fangjun.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostDao {
    //查询所有的帖子，分页展示，以及根据id是否为0，动态拼接SQL
    List<DiscussPost> getAllDiscussPost(int userId,int offset,int limit);
    //根据用户ID查询该用户下的 所有帖子的总数量
    int selectDiscussPostRows(@Param("userId") int userId);
}
