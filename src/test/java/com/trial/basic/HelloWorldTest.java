package com.trial.basic;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class HelloWorldTest {

    @Test
    public void simple() {
        new HelloWorld().sayHello("Ibrahim");
        assertTrue(true);
    }
}