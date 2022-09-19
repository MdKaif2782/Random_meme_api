package com.example.random_meme_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping("/api")
    public String api() {
        return "Hello from API!";
    }
    @GetMapping("/api/meme")
    public Post meme() {
        PostGrabber postGrabber = new PostGrabber();
        return postGrabber.getPost();
    }
}
