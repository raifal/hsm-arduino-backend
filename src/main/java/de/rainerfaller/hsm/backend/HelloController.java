package de.rainerfaller.hsm.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, path = "/hsm/hello")
    public @ResponseBody
    String lightOn() {

        return "processed2";
    }
}
