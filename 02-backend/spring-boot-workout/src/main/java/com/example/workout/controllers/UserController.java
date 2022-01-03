package com.example.workout.controllers;
import org.hibernate.mapping.Any;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collections;
import java.util.Map;
@CrossOrigin
@RestController
@RequestMapping(path="/api/user")
public class UserController {
    @GetMapping
    public Map<String, Any> showUser(@AuthenticationPrincipal OAuth2User principle) {
        return Collections.singletonMap("name", principle.getAttribute("name"));
    }
}
