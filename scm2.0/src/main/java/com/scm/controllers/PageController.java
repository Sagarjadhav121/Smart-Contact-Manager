package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

  @RequestMapping("/home")
  public String Home(Model model) {
    model.addAttribute("name", "Substring Technologies");
    model.addAttribute("youtubeChannel", "Magnet Coding");
    model.addAttribute("githubRepo", "https://github.com/Sagarjadhav121");
    return "Home";
  }

  // about route

  @RequestMapping("/about")
  public String About() {
    return "About";
  }

  //services route

  @RequestMapping("/services")
  public String Services() {
    return "Services";
  }

  //contact route
  @GetMapping("/contact")
  public String contact() {
    return "contact";
  }
   //login route
   @GetMapping("/login")
   public String login() {
    return "login";
   }

    //signup route
    @GetMapping("/signup")
    public String signup() {
      return "signup";
    }
 


}
