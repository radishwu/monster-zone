package com.monster.zone.service;

import com.monster.zone.domain.entity.BookEntity;

import java.util.List;

public interface BooksBiz {

    List<BookEntity> getBooks(Long userId);
}
