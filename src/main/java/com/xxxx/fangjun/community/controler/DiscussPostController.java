package com.xxxx.fangjun.community.controler;

import com.xxxx.fangjun.community.entity.DiscussPost;
import com.xxxx.fangjun.community.entity.Page;
import com.xxxx.fangjun.community.entity.User;
import com.xxxx.fangjun.community.service.DiscussPostService;
import com.xxxx.fangjun.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DiscussPostController {
    @Autowired
    private DiscussPostService discussPostService;

    @Autowired
    private UserService userService;


    @RequestMapping(path = "/index",method = RequestMethod.GET)
    public String getAllPost(Model model, Page page){
        page.setRows(discussPostService.selectDiscussPostRows(0));
        page.setPath("/index");
        List<DiscussPost> list = discussPostService.getDiscussPost(0,page.getOffset(),page.getLimit());
        List<Map<String, Object>> discussPosts = new ArrayList<>();
        if (list != null) {
            for (DiscussPost post : list) {
                Map<String, Object> map = new HashMap<>();
                map.put("post", post);
                User user = userService.findUserById(post.getUserId());
                map.put("user", user);
                discussPosts.add(map);
            }
        }
        //将model 数据传递给 view
        model.addAttribute("discussPosts", discussPosts);
        return "/index";
    }
}
