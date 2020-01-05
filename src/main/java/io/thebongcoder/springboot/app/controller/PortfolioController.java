package io.thebongcoder.springboot.app.controller;

import io.thebongcoder.springboot.app.service.PortfolioQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PortfolioController {

    @Autowired
    PortfolioQueryService portfolioQueryService;

    @GetMapping("/")
    public String index(){
        return "redirect:/portfolio";
    }

    @GetMapping("/portfolio")
    public ModelAndView positions(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("positionsResponse", null);
        modelAndView.addObject("transaction", null);
        return modelAndView;
    }
}
