package com.khoabug.fakebook.mapper.impl;

import com.khoabug.fakebook.mapper.RowMapper;
import com.khoabug.fakebook.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAuthMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet resultSet) {
        User user = new User();
        try {
            user.setId(resultSet.getLong("UserID"));
            user.setUserName(resultSet.getString("Uname"));
            user.setEmail(resultSet.getString("Email"));
            user.setStatus(resultSet.getInt("status"));
            user.setPassword(resultSet.getString("Password"));
        } catch (SQLException exception) {
            return null;
        }
        return user;
    }
}
