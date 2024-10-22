package dev.naimsulejmani.webdevelopmentgrupi2.controllers;

import dev.naimsulejmani.webdevelopmentgrupi2.models.CompanyInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class TestController {

    private int homeCount;
    private int aboutCount;
    private int galleryCount;
    private int statsCount;

    /*
    This code snippet is a Java method that handles a GET request to the root URL ("/").
    It takes a Model object as a parameter, which is used to store and pass data to the view.

Inside the method, it adds two attributes to the Model object: "message" with the value "Hello World!" and "salary"
with a random number multiplied by 2000.

Finally, it returns the string "index", which is the name of the view that will be rendered and displayed to the user.
     */

    @GetMapping("/")
    public String index(Model model) {
        homeCount++;
        model.addAttribute("pageTitle", "Home Page");
        model.addAttribute("message", "Hello World!");
        model.addAttribute("salary", (Math.random()) * 2000);
        return "index";
    }

    // create about page
    @GetMapping("/about")
    public String about(Model model) {

        aboutCount++;
        model.addAttribute("pageTitle", "About Page");
        model.addAttribute("message", "About Page");
        model.addAttribute("currentYear", LocalDate.now().getYear());

        var companyInfo = new CompanyInfo("Profas Software", "Fushe Kosove ma lire ma qet", "0701234567");

        model.addAttribute("companyInfo", companyInfo);

        return "about";
    }

    // create gallery page
    @GetMapping("/gallery")
    public String gallery(Model model) {
        galleryCount++;
        model.addAttribute("pageTitle", "Gallery Page");
        model.addAttribute("message", "Gallery Page");
        return "gallery";
    }
    //create stats page
    @GetMapping("/stats")
    public String stats(Model model) {
        statsCount++;
        model.addAttribute("pageTitle", "Stats Page");
        model.addAttribute("message", "Stats Page");
        model.addAttribute("homeCount", homeCount);
        model.addAttribute("aboutCount", aboutCount);
        model.addAttribute("galleryCount", galleryCount);
        model.addAttribute("statsCount", statsCount);
        return "stats";
    }

}
















