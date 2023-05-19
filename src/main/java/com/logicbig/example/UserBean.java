package com.logicbig.example;

import javax.annotation.ManagedBean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@ManagedBean
@SessionScope
public class UserBean {
    private String name;

    public UserBean () {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
