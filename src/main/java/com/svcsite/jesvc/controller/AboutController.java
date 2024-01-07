package com.svcsite.jesvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/about")
    public String goPage(Model model) {
        model.addAttribute("msg", "안녕하세요, 반갑습니다!");
        return "about/about";
    }
}
