package io.thebongcoder.springboot.app.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String sayHello(Model model){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String userName;
        int i;
        if(principal instanceof UserDetails){
            userName = ((UserDetails) principal).getUsername();
        }
        else{
            userName = principal.toString();
        }
        System.out.println("User name is "+userName);
        model.addAttribute("userName", userName);
        return "hello";
    }

}
