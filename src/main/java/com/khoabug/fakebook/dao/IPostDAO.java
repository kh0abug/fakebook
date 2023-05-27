package com.khoabug.fakebook.dao;

import com.khoabug.fakebook.model.Post;
import com.khoabug.fakebook.paging.PageRequest;

import java.util.List;

public interface IPostDAO extends GenericDAO<Post> {
    List<Post> findAll(PageRequest pageRequest);

    void save(Post post);
}
