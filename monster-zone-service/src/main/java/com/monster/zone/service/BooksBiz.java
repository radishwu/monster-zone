package com.monster.zone.service;

import com.monster.zone.common.entity.ActionSuccessEntity;
import com.monster.zone.domain.entity.BookEntity;
import com.monster.zone.domain.request.BookRequest;

import java.util.List;

public interface BooksBiz {

    List<BookEntity> getBooks(Long userId, int page, int pageSize);

    ActionSuccessEntity addBook(Long userId, BookRequest bookRequest);
}
