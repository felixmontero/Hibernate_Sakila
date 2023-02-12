package com.esliceu.sakila.controllers;

import com.esliceu.sakila.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    @Autowired
    CustomerService clientService;

    @GetMapping("/")
    public String homepage(Model model){
        return "homepage";
    }


}
