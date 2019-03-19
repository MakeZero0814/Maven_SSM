package com.cslb.controller;

import com.cslb.service.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Login
{
    @Autowired
    private PersonServiceImpl personServiceImpl;
    @RequestMapping("/Login")
    public String Login(){

        System.out.println("===================");
        return "index.jsp";
    }

    @RequestMapping("/selectById")
    public String selectById(){
       System.out.println(personServiceImpl.selectById(1));
        return "/main.jsp";
    }
}
