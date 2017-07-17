package com.teggot.web.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "products")
public class Product {
    @Id
    public String id;

    public String name;
    public String description;
    public String size;
    public String priceStr;
    public int price;
    public int width,height,lon;

    public Product() {}

    public Product(String _name, String _description,int _width,int _height,int _lon,int _price) {
        this.name = _name;
        this.description = _description;
        this.width = _width;
        this.height = _height;
        this.lon = _lon;
        this.size = _width+"x"+_height+"x"+_lon;
        this.priceStr = _price+"грн/куб";
        this.price = _price;
    }

    @Override
    public String toString() {
        return String.format("Product(name = '%s', description = '%s', size = '%s', price = '%s')",name,description,size,priceStr);
    }
}
