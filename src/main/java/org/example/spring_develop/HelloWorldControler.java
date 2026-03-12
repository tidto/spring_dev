package org.example.spring_develop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControler {
    @GetMapping("/hello")
    public String getName(@RequestParam("name") String name) {
        return "hi" + name;
    }
    @GetMapping("/student")
    public Student getStudent(@RequestParam String firstName, @RequestParam String lastName) {
        return new Student("hello", "world");
    }

    @GetMapping("/student/{firstName}/{lastName}")
    public Student getStudent2(@PathVariable String firstName, @PathVariable String lastName){
        return new Student(firstName, lastName);
    }

}
