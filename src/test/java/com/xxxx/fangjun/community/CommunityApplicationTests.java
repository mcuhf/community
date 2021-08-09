package com.xxxx.fangjun.community;


import com.xxxx.fangjun.community.entity.DiscussPost;
import com.xxxx.fangjun.community.service.DiscussPostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;


@SpringBootTest
@ContextConfiguration(classes = ComunityApplication.class)
class CommunityApplicationTests  {

    @Autowired
    private DiscussPostService discussPostService;

    @Test
    public void test1(){
        List<DiscussPost> discussPost = discussPostService.getDiscussPost(101, 1, 10);
        for (DiscussPost dis:discussPost){
            System.out.println(dis);
        }
    }

    @Test
    public void test2(){
        System.out.println(discussPostService.selectDiscussPostRows(0));
    }

}
