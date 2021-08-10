package com.ten.webApp.service;

import com.ten.webApp.model.Alien;
import com.ten.webApp.repository.alienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Component
public class alienService {

    @Autowired
    alienRepo repo;

    public ModelAndView addAlien(Alien alien){
        ModelAndView mv = new ModelAndView("addAlien.jsp");
        mv.addObject(alien);
        repo.save(alien);
        return mv;
    }

    public ModelAndView getAlienById(int id) {
        ModelAndView mv = new ModelAndView("getAlienById.jsp");
        Alien alien = repo.findById(id).orElse(new Alien());
//        System.out.println(alien);
        mv.addObject("id",id);
        mv.addObject(alien);
        return mv;
    }

    public ModelAndView getAlienByTech(String tech) {
        ModelAndView mv = new ModelAndView("getAlienByTech.jsp");
        List <Alien> result = repo.findByTech(tech);
//        System.out.println(alien);
        mv.addObject("tech", tech);
        mv.addObject("result", result);
        return mv;
    }
}
