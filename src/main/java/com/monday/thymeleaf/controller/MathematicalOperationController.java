package com.monday.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class BasicOperationController {
    @GetMapping("/basic_comparision_example")
    public String compare(){
        return "/basic_comparision_example";
    }
}
