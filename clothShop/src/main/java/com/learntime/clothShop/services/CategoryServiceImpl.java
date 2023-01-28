package com.learntime.clothShop.services;

import com.learntime.clothShop.model.CategoryModel;
import com.learntime.clothShop.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 13,January 2023
 *
 * @Company Data Grid Limited
 * @Address 14/A(new), Dhanmondi R/A, Dhaka 1209.
 * @Email shohrab.datagridltd@gmail.com
 */
@Component
class CategoryServiceImpl implements  CategoryService {

    @Autowired
    CategoryRepository mCategoryRepository;

    @Override
    public CategoryModel insert(CategoryModel categoryModel){

        return  mCategoryRepository.save(categoryModel);
    }
    @Override
    public Optional<CategoryModel> findById(Long id){

        return mCategoryRepository.findById(id);
    }

    @Override
    public List<CategoryModel> findAll(){

        return mCategoryRepository.findAll();
    }

    @Override
    public CategoryModel update(CategoryModel categoryModel){
        return  mCategoryRepository.save(categoryModel);
}
