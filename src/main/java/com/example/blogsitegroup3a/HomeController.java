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

    @RequestMapping("/blogpost_html")
    public String blogposthtml(){
        return "blogpost_html";
    }

    @RequestMapping("/blogpost_css")
    public String blogpostcss(){
        return "blogpost_css";
    }

    @RequestMapping("/blogpost_bootstrap")
    public String blogpostbootstrap(){
        return "blogpost_bootstrap";
    }

    @RequestMapping("/profile_Jane")
    public String profileJane(){
        return "profile_Jane";
    }

    @RequestMapping("/profile_Mary")
    public String profileMary(){
        return "profile_Mary";
    }

    @RequestMapping("/blogpost_object1")
    public String blogpostobject1(){
        return "blogpost_object1";
    }

    @RequestMapping("/blogpost_object2")
    public String blogpostobject2(){
        return "blogpost_object2";
    }

    @RequestMapping("/blogpost_object3")
    public String blogpostobject3(){
        return "blogpost_object3";
    }
}
