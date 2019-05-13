package com.example.blogsitegroup3a;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeControllerMichael {




    @RequestMapping("/Github2")
    public String Github2() { return "Github2"; }

    @RequestMapping ("/Github")
    public String Github() {return "Github";}

    @RequestMapping("/Github3")
    public String Github3() { return "Github3";}

    @RequestMapping ("/CoreJava")
    public String CoreJava() { return "CoreJava";}

    @RequestMapping ("/CoreJava2")
    public String CoreJava2() {return "CoreJava2";}

    @RequestMapping ("/CoreJava3")
    public String CoreJava3() {return "CoreJava3";}

    @RequestMapping ("/ProgramDesign")
    public String ProgramDesign2() {return "ProgramDesign";}

    @RequestMapping ("/ProgramDesign2")
    public String HomeControllerMichael() {return "ProgramDesign2";}




}
