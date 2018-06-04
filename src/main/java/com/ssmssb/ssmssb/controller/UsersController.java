package com.ssmssb.ssmssb.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("")
@CrossOrigin
public class UsersController {
    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/user")
    public Principal user(Principal user) {
        return user;
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/admin")
        public String securedUser(){
            return "Welcome admin to this tutorial ";
        }

}
