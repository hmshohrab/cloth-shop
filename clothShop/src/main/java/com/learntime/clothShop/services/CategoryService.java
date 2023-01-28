package com.learntime.clothShop.services;

import com.learntime.clothShop.model.CategoryModel;

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


public interface CategoryService {

    public CategoryModel insert(CategoryModel categoryModel);
    public Optional<CategoryModel> findById(Long id);

    public List<CategoryModel> findAll();

    public CategoryModel update(CategoryModel categoryModel);



}
