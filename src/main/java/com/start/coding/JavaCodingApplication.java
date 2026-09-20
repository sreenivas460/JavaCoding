package com.start.coding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCodingApplication {

    public static void main(String[] args) {
        System.out.println("Starting the Java Coding Application...");
        SpringApplication.run(JavaCodingApplication.class, args);
        System.out.println("Java Coding Application completed successfully.");
    }

}
