package com.yikeo.dbadmin.modules.database.web;

import com.yikeo.dbadmin.modules.database.enums.JdbcDriverEnum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("database")
public class DatabaseController {

    @RequestMapping("connect")
    public String connect(Model model) {

        model.addAttribute("jdbcDrivers", JdbcDriverEnum.values());

        return "database/connect";
    }

    @RequestMapping("test")
    @ResponseBody
    public String test(String driver, String url, String user, String password, Model model) {
        System.out.println(driver);
        System.out.println(url);
        System.out.println(user);
        System.out.println(password);
        return "test";
    }
}
