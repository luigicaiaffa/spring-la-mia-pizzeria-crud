package org.lessons.java.spring_la_mia_pizzeria_crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/pizzas")
public class PizzaController {
    
    @GetMapping("/index")
    public String index(Model model) {
        return "pizzas/index";
    }
    
}
