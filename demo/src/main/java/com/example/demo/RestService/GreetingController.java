package com.example.demo.RestService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;
/*Anotacion REST para indicar el tipo de arquitectura*/
@RestController
public class GreetingController {
    public static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /*Definimos la ruta */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name",defaultValue = "World")String name){
        return new Greeting(counter.incrementAndGet(),String.format(template,name));
    }
}
