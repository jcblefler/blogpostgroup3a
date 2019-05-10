package com.example.blogsitegroup3a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping("/")
    public String homepage(){
        return "index";
    }

    @RequestMapping("/profileA")
    public String profileA(){
        return "profileA";
    }
    @RequestMapping("/blogpost_template")
    public String blogposttemplate(){
        return "blogpost_template";
    }
}
