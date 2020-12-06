package com.itheima.controller;

import com.itheima.pojo.Precout;
import com.itheima.service.PrecoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class PrecoutController {
    @Autowired
    PrecoutService precoutService;
    @RequestMapping("/list")
    public String findAll(Model model){
        List<Precout> precouts = precoutService.findAll();
        model.addAttribute("items",precouts);
        return "items";
    }

}
