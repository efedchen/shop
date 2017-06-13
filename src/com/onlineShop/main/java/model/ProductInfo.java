package com.onlineShop.main.java.model;

import com.onlineShop.main.java.entity.Product;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


public class ProductInfo{
    private String code;
    private String name;
    private double price;

    private boolean newProduct;

    private CommonsMultipartFile fileData;

    public ProductInfo(){}

    public ProductInfo(Product product) {
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNewProduct() {
        return newProduct;
    }

    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }

    public CommonsMultipartFile getFileData() {
        return fileData;
    }

    public void setFileData(CommonsMultipartFile fileData) {
        this.fileData = fileData;
    }
}