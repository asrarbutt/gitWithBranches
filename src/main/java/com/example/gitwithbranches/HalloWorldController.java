package com.example.gitwithbranches;

import org.springframework.web.bind.annotation.GetMapping;

public class HalloWorldController {

    @GetMapping
    public String welcome(){
        return "Hallo World";
    }
}
