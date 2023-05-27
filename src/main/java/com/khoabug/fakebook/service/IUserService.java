package com.khoabug.fakebook.service;

import com.khoabug.fakebook.model.User;
import com.khoabug.fakebook.paging.PageRequest;

import java.util.List;

/**
 * @author : DangKhoa
 * @since : 3/6/2023, Mon
 **/
public interface IUserService {
    List<User> findAll(PageRequest pageRequest);

    int getTotalUser(Object... parameters);

    User isValid(Object... parameters);


}
