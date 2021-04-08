package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(){ return "index";}

    @RequestMapping("/stepOne")
    public String showStepOne(){ return "pages/stepOne";}

    @RequestMapping("/stepTwo")
    public String showStepTwo(){ return "pages/stepTwo";}

    @RequestMapping("/stepThree")
    public String showStepThree(){ return "pages/stepThree";}

}
