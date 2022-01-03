package com.crisite.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component(value = "user")
@Qualifier(value = "card")
public class Users {
    private int id;
    private String name;
    private String address;
    @Autowired
    private UserCard userCard;
}
