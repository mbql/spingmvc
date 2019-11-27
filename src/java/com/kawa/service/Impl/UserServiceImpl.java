package com.kawa.service.Impl;

import com.kawa.dao.UserDao;
import com.kawa.pojo.User;
import com.kawa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userdao;

    public User getFindId(int id) {
        return userdao.findId(id);
    }
}
