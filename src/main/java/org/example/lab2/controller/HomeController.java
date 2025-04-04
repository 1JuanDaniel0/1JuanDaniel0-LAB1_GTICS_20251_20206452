package org.example.lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/paginaPrincipal", method = RequestMethod.GET)
    @ResponseBody
    public String paginaPrincipal() {
        return "vista";
    }
}
