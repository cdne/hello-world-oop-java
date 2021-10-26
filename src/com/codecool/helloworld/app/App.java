package com.codecool.helloworld.app;
import com.codecool.helloworld.hello.HelloWorld;

public class App {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        if(args.length >= 1) helloWorld.welcome(args[0]);
    }
}
