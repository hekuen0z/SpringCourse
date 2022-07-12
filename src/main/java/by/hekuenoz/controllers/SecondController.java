package by.hekuenoz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hekuen0z - Alexei Kaptur
 */
@Controller
public class SecondController {

    @GetMapping("/exit")
    public String exit(){
        return "second/exit";
    }
}
