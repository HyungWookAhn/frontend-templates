package kr.co.bomapp.frontend.thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String goLogin(Map<String, Object> model) {
        model.put("id", "administrator");
        model.put("password", "password");
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
