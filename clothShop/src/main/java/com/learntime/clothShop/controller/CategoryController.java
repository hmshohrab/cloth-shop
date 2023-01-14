package com.learntime.clothShop.controller;

import com.learntime.clothShop.dto.CategoryDto;
import com.learntime.clothShop.manager.CategoryManager;
import com.learntime.clothShop.model.CategoryModel;
import com.learntime.clothShop.response.MessageResponse;
import com.learntime.clothShop.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 05,January 2023
 *
 * @Company Data Grid Limited
 * @Address 14/A(new), Dhanmondi R/A, Dhaka 1209.
 * @Email shohrab.datagridltd@gmail.com
 */
@RestController("/category")
class CategoryController {
   @Autowired
   CategoryService mCategoryService;

   @PostMapping("create")
   ResponseEntity<?> create(@RequestBody  CategoryDto dto){
      MessageResponse  validation = CategoryManager.validation(dto);
      if(!validation.isSuccess()){
         return ResponseEntity.badRequest().body(validation);
      }else {
         CategoryModel categoryModel = new CategoryModel();
         categoryModel.setName(dto.getName());
       CategoryModel isSaved =  mCategoryService.insert(categoryModel);
       return ResponseEntity.ok(isSaved);
      }
   }

   @PostMapping("update")
   ResponseEntity<?> update(@RequestBody  CategoryDto dto){
      MessageResponse  validation = CategoryManager.updatedValidation(dto);
      if(!validation.isSuccess()){
         return ResponseEntity.badRequest().body(validation);
      }else {
         CategoryModel categoryModel = new CategoryModel();
         categoryModel.setName(dto.getId());
         categoryModel.setName(dto.getName());
         CategoryModel isSaved =  mCategoryService.update(categoryModel);
         return ResponseEntity.ok(isSaved);
      }
   }

   @PostMapping("delete")
   ResponseEntity<?> delete(@RequestBody  CategoryDto dto){
      MessageResponse  validation = CategoryManager.deletedValidation(dto);
      if(!validation.isSuccess()){
         return ResponseEntity.badRequest().body(validation);
      }else {
         CategoryModel categoryModel = new CategoryModel();
         categoryModel.setName(dto.getId());
         categoryModel.setName(dto.getName());
         CategoryModel isSaved =  mCategoryService.update(categoryModel);
         return ResponseEntity.ok(isSaved);
      }
   }

   @PostMapping("read")
   ResponseEntity<?> read(@RequestBody  CategoryDto dto){
      MessageResponse  validation = CategoryManager.readValidation(dto);
      if(!validation.isSuccess()){
         return ResponseEntity.badRequest().body(validation);
      }else {
         CategoryModel categoryModel = new CategoryModel();
         categoryModel.setName(dto.getId());
         categoryModel.setName(dto.getName());
         CategoryModel isSaved =  mCategoryService.update(categoryModel);
         return ResponseEntity.ok(isSaved);
      }
   }

   @PostMapping("read")
   ResponseEntity<?> showAll(){
         return ResponseEntity.ok(mCategoryService.findAll());
   }


}
