package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by @author Kalmaasali on 19/04/2020.
 **/
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}
