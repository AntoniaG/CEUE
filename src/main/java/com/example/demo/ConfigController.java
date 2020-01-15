package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;


@Controller
public class ConfigController {

    @GetMapping ("/handlebar")
    public String config(Model model){
        System.out.println("hello world");
        RestTemplate restTemplate = new RestTemplate();

        model.addAttribute("hbTypes", restTemplate.getForObject(
                "https://www.maripavi.at/produkt/lenkertyp", String[].class));
        return "handlebar";
    }


}



