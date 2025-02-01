package com.mycompany.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

@RestController
@RequestMapping("/api")
class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello, World!";
    }
}







// package com.mycompany.app;

// /**
//  * Hello world!
//  */
// public class App {

//     private static final String MESSAGE = "Hello World!";

//     public App() {}

//     public static void main(String[] args) {
//         System.out.println(MESSAGE);
//     }

//     public String getMessage() {
//         return MESSAGE;
//     }
// }
