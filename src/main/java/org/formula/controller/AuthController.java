package org.formula.controller;

import lombok.extern.slf4j.Slf4j;
import org.formula.dto.LoginDTO;
import org.formula.dto.RegisterDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/start")
    public ResponseEntity<Object> start() {
        log.info("Passed the landing page!");
        return ResponseEntity.ok("lol");
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody LoginDTO loginDTO) {
        log.info("Logged in user {}", loginDTO.getUsername());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody RegisterDTO registerDTO) {
        log.info("Registered user {}", registerDTO.getUsername());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/csrf")
    public CsrfToken getCsrf(CsrfToken token){
        return token;
    }
}
