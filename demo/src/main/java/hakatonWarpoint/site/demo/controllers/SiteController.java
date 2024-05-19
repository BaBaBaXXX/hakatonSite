package hakatonWarpoint.site.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SiteController {

    @GetMapping("/lending")
    public String lending(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "lending";
    }
    @GetMapping("/product1")
    public String product1(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "product1";
    }
    @GetMapping("/product2")
    public String product2(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "product2";
    }
    @GetMapping("/product3")
    public String product3(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "product3";
    }
    @GetMapping("/product4")
    public String product4(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "product4";
    }
    @GetMapping("/product5")
    public String product5(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "product5";
    }
    @GetMapping("/product6")
    public String product6(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "product6";
    }
    @GetMapping("/product7")
    public String product7(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "product7";
    }
    @GetMapping("/product8")
    public String product8(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "product8";
    }
    @GetMapping("/product9")
    public String product9(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "product9";
    }


}
