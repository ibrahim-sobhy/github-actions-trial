package com.trial.basic;

import java.util.Objects;

public class HelloWorld {
    public String sayHello(String name) {
        if (Objects.isNull(name)) {
            name = "there";
        }
        return "Hello, " + name;
    }

    public String sayHello(String firstName, String lastName) {
        if (Objects.isNull(firstName)) {
            firstName = "there";
        }
        if (Objects.isNull(lastName)) {
            lastName = "";
        }

        return String.format("Hello, %s %s", firstName, lastName);
    }
}
