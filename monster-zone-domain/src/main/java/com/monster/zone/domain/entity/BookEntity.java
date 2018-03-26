package com.monster.zone.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
public class BookEntity {

    private Long id;

    private String name;

    private String cover;

    private String author;

    private String translator;

    private Long price;

    private String press;

    private String intro;

    private Integer type;

    private Date createdTime;

    private Date updatedTime;
}
