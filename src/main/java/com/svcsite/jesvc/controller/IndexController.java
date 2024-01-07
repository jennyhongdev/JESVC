package com.svcsite.jesvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String goPage(Model model) {
        model.addAttribute("msg", "안녕하세요, 반갑습니다!");
        return "index/index";
    }

    @GetMapping("/index")
    public String goPageIndex(Model model) {
        model.addAttribute("msg", "안녕하세요, 반갑습니다!");
        return "index/index";
    }


}
