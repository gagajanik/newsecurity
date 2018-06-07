package com.ssmssb.ssmssb.controller;

import com.ssmssb.ssmssb.common.Description;
import com.ssmssb.ssmssb.model.CredentialsDTO;
import com.ssmssb.ssmssb.model.User;
import com.ssmssb.ssmssb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.Optional;


@RequestMapping("")
@RestController
@CrossOrigin
public class UsersController {

    private UserRepository userRepository;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public UsersController(UserRepository userRepository, @Qualifier("customAuthenticationManager") AuthenticationManager authenticationManager) {
        this.userRepository = userRepository;
        this.authenticationManager = authenticationManager;
    }


    @GetMapping("/all")
    public Principal user(Principal user) {
        return user;
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/secured/all")
        public Principal securedUser(Principal user){
            return user;
        }


        @PostMapping(value = "/auth")
    public Optional<User> checkUsers(@RequestBody CredentialsDTO credentials){
//        System.out.println(credentials.getUsername()+" "+credentials.getPassword());
//        return userRepository.findByUsernameAndPassword(credentials.getUsername(),credentials.getPassword());
            String username = credentials.getUsername();
            String password = credentials.getPassword();
            UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(username, password);
            User user = new User();
            user.setUsername(username);
            token.setDetails(user);

            Authentication auth = authenticationManager.authenticate(token);
//            token.setDetails(new WebAuthenticationDetails(request));
            SecurityContextHolder.getContext().setAuthentication(auth);
            Optional<User> usersOptional = Optional.of((User) auth.getPrincipal());
            return usersOptional;
    }

    @PostMapping("/logout")
    public Description<Boolean> logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("movidaa");
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return Description.valid(true);
    }

}
