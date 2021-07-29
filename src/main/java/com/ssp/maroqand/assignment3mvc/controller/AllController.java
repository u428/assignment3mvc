package com.ssp.maroqand.assignment3mvc.controller;

import com.ssp.maroqand.assignment3mvc.Service.CustomerService;
import com.ssp.maroqand.assignment3mvc.Service.OtherService;
import com.ssp.maroqand.assignment3mvc.model.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path = "/all")
public class AllController {

    @Autowired
    private OtherService otherService;

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String get(Model model){
        model.addAttribute("message", "Hello Ulugbek");
        return "pages/home";
    }



    @GetMapping(path = "/sortProductByCategory")
    public ResponseEntity sortProductByCategory(@RequestParam Long id, @RequestParam int limit, @RequestParam int page){
        return otherService.sortProductByCategory(id, limit, page);
    }

    @GetMapping(path = "/getProducts")
    public ResponseEntity getAllProduct(@RequestParam int limit, @RequestParam int page){
        return otherService.getAllProducts(page, limit);
    }

//    @PreAuthorize("hasAuthority('read')")
    @GetMapping(path = "/getproduct")
    public ResponseEntity<Product> getProductById(@RequestParam Long id){
        return otherService.getProductById(id);
    }


//    @GetMapping(path = "/image")
//    public ResponseEntity image(@RequestParam Long id) throws MalformedURLException {
//        return otherService.image(id);
//    }

//    @PreAuthorize("hasAuthority('read')")


//    @PreAuthorize("hasAuthority('read')")
//    @GetMapping(path = "/getCurrentCustomer")
//    public ResponseEntity getCurrentCustomer(@CurrentUser String telNomer){
//        return customerService.getCurrentCustomer(telNomer);
//    }

//    @PreAuthorize("hasAuthority('read')")
//    @GetMapping(path="/getRole")
//    public ResponseEntity getRole(@CurrentUser String telnomer){
//        return customerService.getRole(telnomer);
//    }



}
