package com.school.schoolmanagement.controller;

import com.school.schoolmanagement.config.JdbcConfig;
import com.school.schoolmanagement.models.Univ_user;
import com.school.schoolmanagement.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.awt.*;
import java.util.List;

@Controller
public class AppController {

    private void addUserToSession(Univ_user user, HttpSession session){
        session.setAttribute("users", user);
        session.setAttribute("user_name", user.getUser_name());
    }


    private JdbcConfig jdbcConfig = new JdbcConfig();
    private AppService appService = new AppService(jdbcConfig.dataSource());

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }

    @RequestMapping("/admin_login")
    public String admin_login(){
        return "admin_login.jsp";
    }

    @RequestMapping("/teacher_login")
    public String teacher_login(){
        return "teacher_login.jsp";
    }

    @RequestMapping("/student_login")
    public String student_login(){
        return "student_login.jsp";
    }

    @RequestMapping("/admin_validate")
    public ModelAndView admin_validate(@RequestParam("Username") String u_name, @RequestParam("password") String pwd){
        ModelAndView mv = new ModelAndView("admin_login.jsp");
        List<Univ_user> users = appService.checkUser(u_name, pwd, 117001);
        if (!users.isEmpty()){
            ModelAndView mvad = new ModelAndView("admin_home.jsp");
            return mvad;
        }
        mv.addObject("Error_text", "Invalid Credintials!");
        return mv;
    }

    @RequestMapping("/teacher_validate")
    public ModelAndView teacher_validate(@RequestParam("Username") String u_name, @RequestParam("password") String pwd){
        ModelAndView mv = new ModelAndView("teacher_login.jsp");
        List<Univ_user> users = appService.checkUser(u_name, pwd,117002);
        if (!users.isEmpty()){
            ModelAndView mvad = new ModelAndView("teacher_home.jsp");
            return mvad;
        }
        mv.addObject("Error_text", "Invalid Credintials!");
        return mv;
    }

    @RequestMapping("/student_validate")
    public ModelAndView student_validate(@RequestParam("Username") String u_name, @RequestParam("password") String pwd){
        ModelAndView mv = new ModelAndView("student_login.jsp");
        List<Univ_user> users = appService.checkUser(u_name, pwd, 117003);
        if (!users.isEmpty()){
            ModelAndView mvad = new ModelAndView("student_home.jsp");
            return mvad;
        }
        mv.addObject("Error_text", "Invalid Credintials!");
        return mv;
    }

}
