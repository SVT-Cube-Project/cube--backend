package com.svt.cube.controller;

import com.svt.cube.entity.Consumer;
import com.svt.cube.repository.ConsumerRepository;
import com.svt.cube.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/consumer")
public class ConsumerController {

    private final ConsumerService consumerService;
    private final ConsumerRepository consumerRepository;

    @Autowired
    public ConsumerController(ConsumerService consumerService, ConsumerRepository consumerRepository) {
        this.consumerService = consumerService;
        this.consumerRepository = consumerRepository;
    }

    @CrossOrigin
    @GetMapping
    public List<Consumer> getConsumers() {
        return consumerService.getConsumers();
    }

    @PostMapping("/sign-up")
    public Void processRegister(@RequestBody Consumer consumer) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(consumer.getPassword());
        consumer.setPassword(encodedPassword);
        // add part for date, depends of front
        // consumer.setBirthDate();
        Consumer newConsumer = consumer;

        consumerRepository.save(newConsumer);
        return null;
    }
}
