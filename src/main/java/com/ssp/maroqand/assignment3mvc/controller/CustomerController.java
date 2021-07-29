package com.ssp.maroqand.assignment3mvc.controller;

import com.ssp.maroqand.assignment3mvc.Service.CustomerService;
import com.ssp.maroqand.assignment3mvc.Service.OtherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping(path = "/customer")
//@PreAuthorize("hasRole('ROLE_USER')")
public class CustomerController {

    @Autowired
    private OtherService otherService;

    @Autowired
    private CustomerService customerService;

//    @PostMapping(path = "/customOrder")
//    public ResponseEntity customOrder(@RequestBody List<OrderDTO> orderDTOList, @CurrentUser Customer customer){
//        return otherService.customOrder(orderDTOList, customer);
//    }

//    @PostMapping(path = "/addKarzinka")
//    public ResponseEntity addKarzinka(@RequestBody OrderDTO orderDTO, @CurrentUser String userName){
//        return otherService.karzinka(orderDTO, userName);
//    }
//
//    @GetMapping(path = "/getKarzinka")
//    public ResponseEntity getKarzinka(@CurrentUser String telNomer){
//        return otherService.getKarzinka(telNomer);
//    }
//
//    @PostMapping(path = "/buy")
//    public ResponseEntity buy(@RequestParam double summa, @CurrentUser String telNomer){
//        return customerService.buy(summa, telNomer);
//    }
//
//    @GetMapping(path="/payment")
//    public ResponseEntity payment(@CurrentUser String telNomer){
//        return customerService.payment(telNomer);
//    }

    @DeleteMapping(path ="/deleteDetails")
    public ResponseEntity deleteDetails(@RequestParam Long id){
        return customerService.deleteDetails(id);
    }

//    @PutMapping(path = "/updateDetails")
//    public ResponseEntity updateDetails(@RequestParam Long id, @RequestParam short quantity, @CurrentUser String telNomer){
//        return customerService.updateDetails(id, quantity, telNomer);
//    }
//
//    @GetMapping(path = "/getAllInvoices")
//    public ResponseEntity getAllInvoices(@CurrentUser String telNomer){
//        return customerService.getAllInvoices(telNomer);
//    }

}
