package com.trial.basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelloWorldTest {

    @Test
    public void simple() {
        new HelloWorld().sayHello("Ibrahim");
        assertTrue(true);
    }

    @Test
    public void emptyName() {
        String greeting = new HelloWorld().sayHello(null);
        assertTrue(greeting.contains("there"));
    }

    @Test
    public void sayHelloFullName() {
        String greeting = new HelloWorld().sayHello("John", "Wenzy");
        assertEquals("Hello, John Wenzy", greeting);
    }

    @Test
    public void sayHelloFirstName() {
        String greeting = new HelloWorld().sayHello("John", null);
        assertEquals("Hello, John ", greeting);
    }

    @Test
    public void sayHelloNoFirstName() {
        String greeting = new HelloWorld().sayHello(null, null);
        assertEquals("Hello, there ", greeting);
    }
}