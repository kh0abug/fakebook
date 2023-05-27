package com.khoabug.fakebook.dao;

import com.khoabug.fakebook.mapper.RowMapper;

import java.util.List;

/**
 * @author : DangKhoa
 * @since : 3/2/2023, Thu
 **/
public interface GenericDAO<T> {

    String URL =
            "jdbc:sqlserver://localhost:1433;"
                    + "database=fakebook;"
                    + "user=sa;"
                    + "password=123456;"
                    + "encrypt=false;"
                    + "trustServerCertificate=false;"
                    + "loginTimeout=30;";

    String SQLSERVER_DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    List<T> query(String sql, RowMapper<T> mapper, Object... parameters);

    void update(String sql, Object... parameters);

    int count(String sql, Object... parameters);
}
