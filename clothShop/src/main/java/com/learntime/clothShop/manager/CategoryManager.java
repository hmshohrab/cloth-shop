package com.learntime.clothShop.manager;

import com.learntime.clothShop.dto.CategoryDto;
import com.learntime.clothShop.response.MessageResponse;

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 14,January 2023
 *
 * @Company Data Grid Limited
 * @Address 14/A(new), Dhanmondi R/A, Dhaka 1209.
 * @Email shohrab.datagridltd@gmail.com
 */

public class CategoryManager {
    public static MessageResponse validation(CategoryDto dto){
        if(dto.getName().isEmpty()){
            return new MessageResponse(false, "Category name not provided");
        }else {
            return new MessageResponse("Successfully validated");
        }
    }
    public static MessageResponse updatedValidation(CategoryDto dto){
        if(dto.getId().isEmpty()){
            return new MessageResponse(false, "Category id not provided");
        }
        if(dto.getName().isEmpty()){
            return new MessageResponse(false, "Category name not provided");
        }else {
            return new MessageResponse("Successfully validated");
        }
    }
    public static MessageResponse deletedValidation(CategoryDto dto){
        if(dto.getId().isEmpty()){
            return new MessageResponse(false, "Category id not provided");
        }else {
            return new MessageResponse("Successfully validated");
        }
    }



    public static MessageResponse readValidation(String id){
        if(id.isEmpty()){
            return new MessageResponse(false, "Category id not provided");
        }else {
            return new MessageResponse("Successfully validated");
        }
    }
}
