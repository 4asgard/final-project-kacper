package com.wsb.logintegra.thymeleaflayout;

import com.wsb.logintegra.thymeleaflayout.person.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class ThymeleafLayoutApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafLayoutApplication.class, args);
        Person.people = new ArrayList<>();
        Person.people.add(new Person(1, "agnieszka", "agnieszka@wsb.com", true, "ADMIN"));
        Person.people.add(new Person(2, "piotr", "piotr@wsb.com", true, "USER"));
        Person.people.add(new Person(3, "noname", "noname@wsb.com", true, "USER"));
    }

}
