package kr.co.bomapp.frontend.velocity.controller;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String goLogin(Model model) {

        model.addAttribute("id", "administrator");
        model.addAttribute("password", "password");

        return "login";
    }

    @RequestMapping("/navbar")
    public String goNavbar(Map<String, Object> model) {
        return "navbar";
    }

    @RequestMapping("/index")
    public String goMain(Map<String, Object> model) {
        model.put("name", "John Doe");
        return "index";
    }

    @RequestMapping("/charts")
    public String goChart() {
        return "charts";
    }

    @RequestMapping("/tables")
    public String goTable() {
        return "tables";
    }

    @RequestMapping("/cards")
    public String goCard() {
        return "cards";
    }

    @RequestMapping("/register")
    public String goRegister() {
        return "register";
    }

    @RequestMapping("/forgotPassword")
    public String goForgotPassword() {
        return "forgot-password";
    }

    @RequestMapping("blank")
    public String goBlank() {
        return "blank";
    }
}
