package com.ssp.maroqand.assignment3mvc.controller;

import com.ssp.maroqand.assignment3mvc.Service.AdminService;
import com.ssp.maroqand.assignment3mvc.Service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class RestControllers {

    @Autowired
    private AdminService adminService;

    @Autowired
    private OtherService otherService;

    @GetMapping(path = "/getAllCategory")
    public ResponseEntity getAllCategpry(){
        return otherService.getAllcategory();
    }

    @PostMapping(path = "/addCategory")
    public ResponseEntity addCategory(@RequestParam String categoryName){
        return adminService.addCategory(categoryName);
    }

    @PutMapping(path = "/putcategory")
    public ResponseEntity putcategory(@RequestParam Long id, @RequestParam String categoryName){
        return adminService.putcategory(id, categoryName);
    }

    @DeleteMapping(path = "/deleteCategory")
    public ResponseEntity deleteCategory(@RequestParam Long id){
        return adminService.deleteCategory(id);
    }
}
