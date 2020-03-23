package com.yikeo.dbadmin.modules.home.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("")
    public String index(Model model) {
        return "home/index";
    }

    @RequestMapping("locale")
    public String locale(Model model) {
        return "home/locale";
    }
}