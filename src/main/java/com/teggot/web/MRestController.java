package com.teggot.web;

import com.teggot.web.Models.AllFinder;
import com.teggot.web.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MRestController {

    @Autowired
    ProductRepository repository;

    @RequestMapping("/getAll")
    public AllFinder greeting() {
        return new AllFinder(repository.findAll());
    }
}