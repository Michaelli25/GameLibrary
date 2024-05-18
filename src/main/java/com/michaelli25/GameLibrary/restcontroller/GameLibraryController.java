package com.michaelli25.GameLibrary.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameLibraryController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
    
}
