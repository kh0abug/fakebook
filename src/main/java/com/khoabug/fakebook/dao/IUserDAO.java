package com.khoabug.fakebook.dao;

import com.khoabug.fakebook.model.User;
import com.khoabug.fakebook.paging.PageRequest;

import java.util.List;

/**
 * @author : DangKhoa
 * @since : 3/6/2023, Mon
 **/
public interface IUserDAO extends GenericDAO<User> {
    List<User> findAll(PageRequest pageRequest);

    void save(User user);

    User isValid(Object... parameter);

    int getTotalItem(Object... parameter);
}