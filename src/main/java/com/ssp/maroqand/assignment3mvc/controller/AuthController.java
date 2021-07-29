package com.ssp.maroqand.assignment3mvc.controller;


import com.ssp.maroqand.assignment3mvc.Service.CustomerService;
import com.ssp.maroqand.assignment3mvc.Service.OtherService;
import com.ssp.maroqand.assignment3mvc.model.secure.CustomerLogin;
import com.ssp.maroqand.assignment3mvc.model.secure.CustomerSignUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.model.IModel;

import javax.validation.Valid;
import java.net.MalformedURLException;

@Controller
@RequestMapping(path="/auth")
public class AuthController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private OtherService otherService;

    @GetMapping(path = "/login")
    public String login(){
        return "/auth/login";
    }

    @GetMapping(path = "/signUp")
    public String getSignUp(Model model){
        model.addAttribute("user", new CustomerSignUp());
        return "/auth/signup";
    }

    @PostMapping(path = "/signUp")
    public String signUp(@Valid CustomerSignUp customerSignUp){
        System.out.println(customerSignUp.toString());
        customerService.signUp(customerSignUp);
        return "redirect:/auth/login";
    }

    @GetMapping(path = "/checkTelNomer")
    public ResponseEntity checkTelNomer(@RequestParam int tel){
        return customerService.checkTelNomer(tel);
    }

    @GetMapping(path = "/image")
    public ResponseEntity image(@RequestParam Long id) throws MalformedURLException {
        return otherService.image(id);
    }
}