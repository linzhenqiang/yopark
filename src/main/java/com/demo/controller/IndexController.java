package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/getIndex")
    public ModelAndView index(){
        ModelAndView mav=new ModelAndView("haha");
        return mav;
    }
}
