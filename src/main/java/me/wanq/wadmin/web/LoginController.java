package me.wanq.wadmin.web;

import me.wanq.wadmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@Controller
public class LoginController {

    @Autowired
    UserService userService;

    @GetMapping("/login.html")
    public String login() {
        return "login.html";
    }
}
