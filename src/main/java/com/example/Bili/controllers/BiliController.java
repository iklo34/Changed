package com.example.Bili.controllers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BiliController {
    public  static  void  neg(){
        System.out.println("3");
    }

    @GetMapping("/")
    public String showForm() {
        return "form";
    }
    @PostMapping("/submitForm")
    public String submitForm(@RequestParam String name, @RequestParam int age, @RequestParam String nickname, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("nickname", nickname);
        model.addAttribute("Banger", age);
        return "display";
    }

    @GetMapping("/display")
    public String displayData() {
        return "display";
    }
}


