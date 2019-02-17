package com.example.misky.umbrella.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
    
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome, Taylor";
    }

    @RequestMapping("/test")
    public Map<String,Object> test(String userName) {
        Map<String, Object> result = new HashMap<>();
        result.put("name", userName);
        result.put("date", new Date());
        return result;
    }

}