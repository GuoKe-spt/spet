package cn.com.nobility.spet.controller;

import cn.com.nobility.po.BasePo;
import cn.com.nobility.po.User;
import cn.com.nobility.spet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: spt
 * @description:
 * @date: 2019/5/15 12:00
 */
@RestController
@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class UserController extends BasePo {

    @Autowired
    private UserService userService;

    private User user;

    public String addUser() {
        return userService.add(user);
    }

}
