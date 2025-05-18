package com.email.controller;

import com.email.dto.EmailRequest;
import com.email.service.EmailGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/email")
public class EmailGeneratorController {

    @Autowired
    private EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate-email")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String reply = this.emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(reply);
    }
}
