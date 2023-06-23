package com.example.demo.RestService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*Anotacion para indicar que es una aplicacion de Spring Boot*/
@SpringBootApplication
public class RestServiceApplication {
    public static void main(String[] args) {
        /*Llamada para ejecutar la app*/
        SpringApplication.run(RestServiceApplication.class,args);
    }
}
