package za.co.dvt.ssoauthimpl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "helloworld";
    }

}
