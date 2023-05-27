package com.khoabug.fakebook.dao.impl;

import com.khoabug.fakebook.dao.IUserDAO;
import com.khoabug.fakebook.mapper.impl.UserAuthMapper;
import com.khoabug.fakebook.mapper.impl.UserMapper;
import com.khoabug.fakebook.model.User;
import com.khoabug.fakebook.paging.PageRequest;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

/**
 * @author : DangKhoa
 * @since : 3/6/2023, Mon
 **/

@ApplicationScoped
public class UserDAO extends AbstractDAO<User> implements IUserDAO {

    @Override
    public List<User> findAll(PageRequest pageRequest) {
        StringBuilder sql = new StringBuilder("select * from users ");
        if (pageRequest != null && pageRequest.getSorter() == null) {
            sql.append("order by (SELECT NULL) OFFSET ? ROWS FETCH NEXT ? ROWS ONLY");
            return query(sql.toString(), new UserMapper(), pageRequest.getOffset(), pageRequest.getVisibleItem());
        } else if (pageRequest == null) {
            return query(sql.toString(), new UserMapper());
        } else {
            sql.append("order by ? ? OFFSET ? ROWS FETCH NEXT ? ROWS ONLY");
            return query(sql.toString(), new UserMapper(), pageRequest.getSorter().getSortBy(),
                    pageRequest.getSorter().getSortName(), pageRequest.getOffset(), pageRequest.getVisibleItem());
        }
    }

    @Override
    public void save(User user) {

    }

    @Override
    public User isValid(Object... parameter) {
        String sql = "select * from UserAuth where Email = ? and Password = ?";
        List<User> result = query(sql, new UserAuthMapper(), parameter);
        return result.isEmpty() ? null : result.get(0);
    }

    @Override
    public int getTotalItem(Object... parameter) {
        String sql = "select count(*) from users ";
        return count(sql);
    }
}
