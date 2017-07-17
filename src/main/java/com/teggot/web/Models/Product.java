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
    public int width,height,length;

    public Product() {}

    public Product(String _name, String _description,int _width,int _height,int _length,int _price) {
        this.name = _name;//
        this.description = _description;//
        this.width = _width;
        this.height = _height;
        this.size = _width+"x"+_height;//
        this.length = _length;//
        this.priceStr = _price+"грн/куб";//
        this.price = _price;
    }

    @Override
    public String toString() {
        return String.format("Product(name = '%s', description = '%s', size = '%s', price = '%s')",name,description,size,priceStr);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPriceStr() {
        return priceStr;
    }

    public void setPriceStr(String priceStr) {
        this.priceStr = priceStr;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
