package com.monster.zone.controller;

import com.monster.zone.common.entity.Result;
import com.monster.zone.common.utils.ResultUtil;
import com.monster.zone.service.BooksBiz;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/zone")
public class BooksController {

    @Resource
    private BooksBiz booksBiz;

    @GetMapping("/books")
    public Result getBooks(@RequestParam("userId") Long userId) {

        return ResultUtil.success(booksBiz.getBooks(userId));
    }
}
