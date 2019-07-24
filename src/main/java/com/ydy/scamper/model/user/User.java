package com.ydy.scamper.model.user;


import com.ydy.scamper.common.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;

@Getter
@Setter
public class User extends BaseEntity<User> {

    @Id
    private String id;

    private String username;

    private String password;

    private String email;

    private String delStatus;

    private String mobile;

}