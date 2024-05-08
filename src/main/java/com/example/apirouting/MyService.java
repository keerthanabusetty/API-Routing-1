// Write your code here.
package com.example.apirouting;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyService {
    @GetMapping("/about") 
    public String apirouting() {
        return "About Page";
    }
}