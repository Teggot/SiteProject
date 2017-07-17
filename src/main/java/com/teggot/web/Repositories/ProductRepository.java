package com.teggot.web.Repositories;

import com.teggot.web.Models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String>{

    public List<Product> findByName(String _name);
    public List<Product> findByWidth(int _width);
    public List<Product> findByHeight(int _height);
    public List<Product> findByLon(int _lon);
    public List<Product> findByPrice(int _price);

}
