package com.learntime.clothShop.services;

import com.learntime.clothShop.model.ProductModel;
import com.learntime.clothShop.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository mProductRepository;

    @Override
    public ProductModel insert(ProductModel productModel){

        return  mProductRepository.save(productModel);
    }
    @Override
    public Optional<ProductModel> findById(Long id) {

        return mProductRepository.findById(id);
    }

    @Override
    public List<ProductModel> findAll() {

        return mProductRepository.findAll();
    }

    @Override
    public ProductModel update(ProductModel productModel){
        return  mProductRepository.save(productModel);
    }


}
