package com.neosoft.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableOAuth2Sso
@RestController
public class OauthController {

    @RequestMapping("/github")
    public String msg(Principal principal) {

        return "Hi "+principal.getName()+" welcome to spring security application";
    }
}
