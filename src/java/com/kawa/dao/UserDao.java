package com.kawa.dao;

import com.kawa.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User findId(int id);
}