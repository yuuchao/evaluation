package com.evaluation.controller;

import com.evaluation.repository.GirlRepository;
import com.evaluation.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GirlController {
    @Autowired
    private GirlRepository girlRepository;
    @GetMapping(value = "/girls")
    public Girl girlList(){

        return girlRepository.findByAge(13);
    }
    @GetMapping(value = "/girl")
    public Girl girl(){

        return girlRepository.findByAge(12);
    }
}
