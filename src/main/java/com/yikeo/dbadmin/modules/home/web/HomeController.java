package com.yikeo.dbadmin.modules.home.web;

import com.yikeo.dbadmin.common.enums.LanguageEnum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("")
    public String index(Model model) {

        System.out.println(LanguageEnum.values()[0]);
        model.addAttribute("languages",LanguageEnum.values());

        return "home/index";
    }
}