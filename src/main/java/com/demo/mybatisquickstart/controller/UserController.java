package com.demo.mybatisquickstart.controller;

import com.demo.mybatisquickstart.dao.UserDao;
import com.demo.mybatisquickstart.model.User;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Author: Liuchong
 * Description:
 * date: 2020/2/27 0027 下午 9:41
 */
@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Resource
    private UserDao userDao;

    @RequestMapping(value = "/insertTest")
    @Transactional(rollbackFor = Exception.class)
    public void TransactionTest() throws InterruptedException {
        User user = new User();
        user.setAge(12);
        user.setName("刘冲");
        userDao.insert(user);

        Thread.sleep(1000 * 3);
        User user2 = new User();
        user2.setAge(122);
        user2.setName("刘冲2");
        userDao.insert(user2);
    }

}
