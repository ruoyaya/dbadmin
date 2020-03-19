package com.yikeo.dbadmin.modules.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("example")
public class ExampleController {
    @RequestMapping("")
    public String index() {
        return "example/index";
    }
}