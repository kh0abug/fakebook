package com.khoabug.fakebook.service.impl;


import com.khoabug.fakebook.dao.impl.UserDAO;
import com.khoabug.fakebook.model.User;
import com.khoabug.fakebook.paging.PageRequest;
import com.khoabug.fakebook.service.IUserService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

/**
 * @author : DangKhoa
 * @since : 3/6/2023, Mon
 **/

@ApplicationScoped
public class UserService implements IUserService {

    @Inject
    private UserDAO userDAO;

    @Override
    public List<User> findAll(PageRequest pageRequest) {
        return userDAO.findAll(pageRequest);
    }

    @Override
    public int getTotalUser(Object... parameters) {
        return userDAO.getTotalItem(parameters);
    }

    @Override
    public User isValid(Object... parameters) {
        return userDAO.isValid(parameters);
    }
}
