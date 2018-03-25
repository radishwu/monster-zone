package com.monster.zone.service.impl;

import com.monster.zone.dao.mapper.BooksMapper;
import com.monster.zone.domain.entity.BookEntity;
import com.monster.zone.service.BooksBiz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BooksBizImpl implements BooksBiz {

    @Resource
    private BooksMapper booksMapper;

    @Override
    public List<BookEntity> getBooks(Long userId) {

        List<BookEntity> res = booksMapper.listBooks(userId);
        return res;
    }
}
