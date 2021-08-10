package com.ten.webApp.controller;

import com.ten.webApp.model.Alien;
import com.ten.webApp.service.alienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class alienController {

    @Autowired
    alienService alienService;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("/addAlien")
    public ModelAndView addAlien(Alien alien){
        return alienService.addAlien(alien);
    }

    @RequestMapping("/getAlienById")
    public ModelAndView getAlienById(int id){
        return alienService.getAlienById(id);
    }

    @RequestMapping("/getAlienByTech")
    public ModelAndView getAlienById(String tech){
        return alienService.getAlienByTech(tech);
    }

}
