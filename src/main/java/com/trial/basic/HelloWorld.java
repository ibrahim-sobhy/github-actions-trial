package com.trial.basic;

import java.util.Objects;

public class HelloWorld {
    public String sayHello(String name) {
        if (Objects.isNull(name)) {
            name = "there";
        }
        return "Hello, " + name;
    }
}
