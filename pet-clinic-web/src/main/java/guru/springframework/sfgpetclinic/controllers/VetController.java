package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by @author Kalmaasali on 19/04/2020.
 **/
@Controller
public class VetController {

    @RequestMapping({"vets", "vets/", "index", "vets/index.html"})
    public String listVets() {
        return "vets/index";
    }
}