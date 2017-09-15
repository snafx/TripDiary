package com.snafx.TripDiary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/")
public class MainController {

    @GetMapping(value = "/home")
    public String home() {
        return "index";
    }

    @GetMapping(value = "/")
    public String home1() {
        return "index";
    }
}
