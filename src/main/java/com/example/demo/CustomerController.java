package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class CustomerController {

    @GetMapping({"/","/customer"})
    public String customerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer";
    }

    @PostMapping("/customer")
    public String customerSubmit(@ModelAttribute Customer customer) {
        return "result";
    }

    /*
        @PostMapping
        public ResponseEntity<Customer> customer(@RequestParam Customer customer) {
        customer.setF();
        customer.setL();
        return new ResponseEntity<>(customer, HttpStatus.CREATED);
    }
     */

}

