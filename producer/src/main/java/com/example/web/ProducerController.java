package com.example.web;


import com.example.publisher.ProducerPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private ProducerPublisher producerPublisher;

    @PostMapping("/send/{message}")
    public void publish(@PathVariable String message){
        producerPublisher.send(message);
    }
}
