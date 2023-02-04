package com.learntime.clothShop.services;

import com.learntime.clothShop.model.ProductModel;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public ProductModel insert(ProductModel productModel);
    public Optional<ProductModel> findById(Long id);

    public List<ProductModel> findAll();

    public ProductModel update(ProductModel productModel);
}
