package com.onlineShop.main.java.dao;

import com.onlineShop.main.java.entity.Product;
import com.onlineShop.main.java.model.PaginationResult;
import com.onlineShop.main.java.model.ProductInfo;

public interface ProductDAO {
    public Product findProduct(String code);

    public ProductInfo findProductInfo(String code) ;


    public PaginationResult<ProductInfo> queryProducts(int page,
                                                       int maxResult, int maxNavigationPage  );

    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                                                       int maxNavigationPage, String likeName);

    public void save(ProductInfo productInfo);
}
