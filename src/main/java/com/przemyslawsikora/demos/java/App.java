/*
 * Copyright (C) 2018 Przemyslaw Sikora
 */

package com.przemyslawsikora.demos.java;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
