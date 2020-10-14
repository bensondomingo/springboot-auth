package com.example.timestamp;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping(path = "/api")
public class TimestampController {
    
    @GetMapping("/now")
    public Timestamp timestamp() {
        return new Timestamp();
    }
}
