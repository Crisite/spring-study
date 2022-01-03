package com.crisite.dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component(value = "card")
public class UserCard {
    @Value("1")
    private int id;
    private String name;
    private int cardId;
}
