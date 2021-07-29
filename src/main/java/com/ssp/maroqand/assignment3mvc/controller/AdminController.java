package com.ssp.maroqand.assignment3mvc.controller;

import com.ssp.maroqand.assignment3mvc.Service.AdminService;
import com.ssp.maroqand.assignment3mvc.model.dto.SetProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;


@Controller
@RequestMapping(path = "/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping(path = "/category")
    public String getOnCategory(){
        return "pages/admin/category";
    }

    @GetMapping(path = "/allPayments")
    public ResponseEntity allPayments(){
        return adminService.allPayments();
    }

    @GetMapping(path = "/allInvoices")
    public ResponseEntity allInvoices(){
        return adminService.allInvoices();
    }

    @PostMapping(path = "/addProduct",
            consumes = {"multipart/form-data", "application/json"})
    public ResponseEntity setProduct(@ModelAttribute SetProductDto setProductDto) throws IOException {
        return adminService.setProduct(setProductDto);
    }

    @PutMapping(path="/putProduct/{id}")
    public ResponseEntity putProduct(@PathVariable Long id, @RequestBody SetProductDto setProductDto){
        return adminService.putProduct(id, setProductDto);
    }

    @DeleteMapping(path = "/deleteProduct")
    public ResponseEntity deleteProduct(@RequestParam Long id) throws IOException {
        return adminService.deleteProduct(id);
    }

    @PutMapping(path = "/changeProductPhoto")
    public ResponseEntity changeProductPhoto(@RequestParam Long productPhotoId, @ModelAttribute MultipartFile multipartFile){
        return adminService.changeProductPhoto(productPhotoId, multipartFile);
    }

    @DeleteMapping(path = "/deleteProductPhoto")
    public ResponseEntity deleteProductPhoto(@RequestParam Long id){
        return adminService.deleteProductPhoto(id);
    }



    @GetMapping(path = "/getIncome")
    public ResponseEntity getIncome(@RequestParam Date start, @RequestParam Date end){
        return adminService.getIncome(start, end);
    }

}
