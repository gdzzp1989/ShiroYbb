package com.ybb.shiro.dao;

import com.ybb.shiro.entity.User;

import java.util.List;

public interface UserDao {

    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}
