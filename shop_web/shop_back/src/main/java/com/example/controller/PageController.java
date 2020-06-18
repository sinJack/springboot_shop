package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@RequestMapping("page")
@Controller
public class PageController {

    @RequestMapping("/{toPage}")
    public String toPage(@PathVariable("toPage")String toPage){
        return toPage;
    }
}
