package com.example.spring_jsp_demo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import com.example.spring_jsp_demo.controller.bean.User;
import com.example.spring_jsp_demo.dao.UserDao;


@Repository
public class UserDaoImpl implements UserDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User getUserById(String userId) {
        String sql = "SELECT user_pswd FROM user WHERE user_id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{userId}, (rs, rowNum) -> {
            User user = new User();
            user.setUserId(userId);
            user.setPassword(rs.getString(1));
            return user;
        });
    }

    @Override
    public int createNewUser(User user) {
        String sql = "INSERT INTO user (user_id, user_pswd) VALUES (?, ?)";
        return jdbcTemplate.update(sql, user.getUserId(), user.getPassword());
    }
}

