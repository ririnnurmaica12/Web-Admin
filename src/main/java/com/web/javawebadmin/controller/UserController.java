package com.web.javawebadmin.controller;

import com.web.javawebadmin.model.User;
import com.web.javawebadmin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/admin")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String getRegister (){
        return "register";
    }


    @PostMapping(path = "/register", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public String postRegister(@RequestParam Map<String, Object> payload) {

        User user = new User(
                (String) payload.get("username"),
                (String) payload.get("email"),
                 BCrypt.hashpw((String) payload.get("password"), BCrypt.gensalt()),
                (String) payload.get("firstname"),
                (String) payload.get("lastname"),
                (String) payload.get("address"));
        userRepository.save(user);
        return "login";
    }


    @GetMapping("/login")
    public String getLogin (){
        return "login";
    }

    @GetMapping("/logout")
    public String getlogout (){
        return "login";
    }

    @GetMapping("/about")
    public String getAbout (){
        return "about";
    }

}
