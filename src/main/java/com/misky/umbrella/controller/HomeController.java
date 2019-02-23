package com.misky.umbrella.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping("")
    public String welcome() {
        return "Welcome, Taylor";
    }

    @RequestMapping("/test")
    public Map<String,Object> test(String userName) {
        Map<String, Object> result = new HashMap<>();
        result.put("name", userName);
        result.put("date", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
        return result;
    }

}