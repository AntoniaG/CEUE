package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;


@Controller
public class ConfigController {

    @GetMapping ("/handlebar")
    public String configHB(Model model){
        //System.out.println("hello world");
        RestTemplate restTemplate = new RestTemplate();

        model.addAttribute("hbTypes", restTemplate.getForObject(
                "https://www.maripavi.at/produkt/lenkertyp", String[].class));
        return "handlebar";
    }

    @GetMapping ("/material")
    public String configM(Model model){
        //System.out.println("hello world");
        RestTemplate restTemplate = new RestTemplate();

        model.addAttribute("mTypes", restTemplate.getForObject(
                "https://www.maripavi.at/produkt/material", String[].class));
        return "material";
    }

    @GetMapping ("/gear")
    public String configG(Model model){
        //System.out.println("hello world");
        RestTemplate restTemplate = new RestTemplate();

        model.addAttribute("gTypes", restTemplate.getForObject(
                "https://www.maripavi.at/produkt/schaltung", String[].class));
        return "gear";
    }

    @GetMapping ("/handle")
    public String configH(Model model){
        //System.out.println("hello world");
        RestTemplate restTemplate = new RestTemplate();

        model.addAttribute("hTypes", restTemplate.getForObject(
                "https://www.maripavi.at/produkt/griff", String[].class));
        return "handle";
    }


}



