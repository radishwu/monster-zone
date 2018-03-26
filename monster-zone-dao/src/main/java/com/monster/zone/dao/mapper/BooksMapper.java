package com.monster.zone.dao.mapper;

import com.monster.zone.domain.entity.BookEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksMapper {

    List<BookEntity> listBooks(@Param("userId") Long userId, @Param("page") int page, @Param("pageSize") int pageSize);
}
