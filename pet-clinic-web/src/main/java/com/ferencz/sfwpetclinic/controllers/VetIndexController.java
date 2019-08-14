package com.ferencz.sfwpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetIndexController {
    @RequestMapping({"vets","vets/index", "/vets/index.html"})
    public String listVets(){
        return "vets/index";
    }
}

//@Controller
//public class IndexController {
//    @RequestMapping({"", "/", "index", "index.html"})
//    public String index(){
//        return "index";
//    }
//}