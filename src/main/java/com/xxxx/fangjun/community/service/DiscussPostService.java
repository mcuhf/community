package com.xxxx.fangjun.community.service;

import com.xxxx.fangjun.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiscussPostService {

    List<DiscussPost> getDiscussPost(int userId, int offset, int limit);

    int selectDiscussPostRows(@Param("userId") int userId);
}
