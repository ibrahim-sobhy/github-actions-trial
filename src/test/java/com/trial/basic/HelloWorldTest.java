package com.trial.basic;

import org.junit.Test;

import static org.junit.Assert.fail;

public class HelloWorldTest {

    @Test
    public void simple() {
        new HelloWorld().sayHello("Ibrahim");
        fail();
    }
}