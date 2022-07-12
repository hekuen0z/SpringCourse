package by.hekuenoz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author hekuen0z - Alexei Kaptur
 */
@Controller
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(@RequestParam(value = "name", required = false) String name,
                            Model model){
        model.addAttribute("message", name);

        return "first/hello";
    }

    @GetMapping("/goodBye")
    public String goodByePage() {
        return "first/goodbye";
    }
}
