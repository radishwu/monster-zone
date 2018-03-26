package com.monster.zone.controller;

import com.monster.zone.common.entity.Result;
import com.monster.zone.common.utils.ResultUtil;
import com.monster.zone.domain.request.BookRequest;
import com.monster.zone.service.BooksBiz;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/zone")
public class BooksController {

    @Resource
    private BooksBiz booksBiz;

    @GetMapping("/books")
    public Result getBooks(
            @RequestParam("userId") Long userId,
            @RequestParam("page") Integer page,
            @RequestParam(value = "pageSize", required = false, defaultValue = "20") Integer pageSize
    ) {

        if (null == pageSize || 0 >= pageSize) pageSize = 20;
        if (0 >= page) page = 1;

        return ResultUtil.success(booksBiz.getBooks(userId, page, pageSize));
    }

    @PostMapping("/book/add")
    public Result addBook(@Valid @RequestBody BookRequest bookRequest, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(-1, bindingResult.getFieldError().getDefaultMessage());
        }

        return ResultUtil.success(booksBiz.addBook(0L, bookRequest));
    }
}
