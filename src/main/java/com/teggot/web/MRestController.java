package com.teggot.web;

import com.teggot.web.Models.*;
import com.teggot.web.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MRestController {

    @Autowired
    ProductRepository repository;

    @RequestMapping("/getAll")
    public AllFinder allFinder() {
        return new AllFinder(repository.findAll());
    }
    @RequestMapping("/getByName")
    public ByNameFinder byNameFinder(@RequestParam("name")String _name){
        return new ByNameFinder(repository.findByName(_name));
    }

    @RequestMapping("/getByPrice")
    public ByPriceFinder byPriceFinder(@RequestParam("price")int _price){
        return new ByPriceFinder(repository.findByPrice(_price));
    }

    @RequestMapping("/getByHeight")
    public ByHeightFinder byHeightFinder (@RequestParam("height") int _height){
        return new ByHeightFinder(repository.findByHeight(_height));
    }

    @RequestMapping("/getByLength")
    public ByLengthFinder byLengthFinder (@RequestParam("length") int _length){
        return new ByLengthFinder(repository.findByLength(_length));
    }

    @RequestMapping("/getByWidth")
    public ByWidthFinder byWidthFinder (@RequestParam("width") int _width) {
        return new ByWidthFinder(repository.findByWidth(_width));
    }
}