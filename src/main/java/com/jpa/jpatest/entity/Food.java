package com.jpa.jpatest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/*
create table food
(
    food_id bigint       not null
        primary key,
    name    varchar(255) null,
    price   int          null
);
*/
@Getter
@Setter
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(strategy = GenerationType.TABLE) => 예외 발생
//    @GeneratedValue(strategy = GenerationType.SEQUENCE) => 예외 발생
    private Long foodId;

    private String name;

    private Integer price;
}
