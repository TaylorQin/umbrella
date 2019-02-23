package com.misky.umbrella.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("remiburse")
public class ReimbursementController {

    @RequestMapping("init")
    public HashMap<String,Object> init() {
        return new HashMap<>();
    }

    @RequestMapping(value="addInit", method=RequestMethod.GET)
    public HashMap<String,Object> requestMethodName(@RequestParam String param) {
        return new HashMap<String,Object>();
    }
    
}