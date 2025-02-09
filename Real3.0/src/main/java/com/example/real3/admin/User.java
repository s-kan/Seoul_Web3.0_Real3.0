package com.example.real3.admin;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class User {
    @Id
    private String id;

    private String name;
    private String userId;
    private String passWord;
    private String birth;
    private String sex;

    private Account account;

    public User(String name, String userId, String password, String birth, String sex, Account account) {
        this.name = name;
        this.userId = userId;
        this.passWord = password;
        this.birth = birth;
        this.sex = sex;
        this.account = account;
    }
}
