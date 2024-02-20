package com.example.awsServiceDemoTest2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class NewController {

    @GetMapping("")
    public String welcome() {
        return "Startsida";
    }
}
