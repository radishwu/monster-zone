package com.monster.zone.domain.request;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

@Data
public class BookRequest {

    private Long userId;

    //书名
    @NotEmpty(message = "name不能为空")
    @Length(max = 50, message = "name不能超过50字符")
    private String name;

    //封面
    private String cover;

    //作者
    @NotEmpty(message = "author不能为空")
    private String author;

    //译者
    private String translator;

    //价格：分（单位）
    @NotNull(message = "")
    private Long price;

    //出版社
    @NotEmpty(message = "press不能为空")
    private String press;

    //简介
    private String intro;

    //类型
    private Integer type;
}
