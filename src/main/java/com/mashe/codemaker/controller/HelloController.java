package com.mashe.codemaker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zfystart
 * @data 2020/3/7 - 14:47
 */
@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name")String name , Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
