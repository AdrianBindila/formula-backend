package org.formula.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController("auth")
public class AuthController {

    @GetMapping("/start")
    public ResponseEntity<Object> start(){
        log.info("Passed the landing page!");
        return ResponseEntity.ok("lol");
    }
}
