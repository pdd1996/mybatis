package com.paddy.dao;

import com.paddy.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
}
