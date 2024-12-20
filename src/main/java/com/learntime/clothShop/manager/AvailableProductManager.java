package com.learntime.clothShop.manager;

import com.learntime.clothShop.dto.AvailableProductDto;
import com.learntime.clothShop.response.MessageResponse;

public class AvailableProductManager {
//
//    String id;
//    String colour;
//    String quantity;
//    String size;

    public static MessageResponse validation(AvailableProductDto dto){

        if(dto.getColour().isEmpty()){
            return new MessageResponse(false, "Available Product not provided");
        }
        if(dto.getQuantity().isEmpty()){
            return new MessageResponse(false, "Available Product quantity not provided");
        }
        if(dto.getSize().isEmpty()){
            return new MessageResponse(false, "Available Product size not provided");
        }else {
            return new MessageResponse( "Product Successfully validated");
        }

    }

    //  idProduct primary and secondary also
//    only one for readValidation
        public static MessageResponse readValidation(AvailableProductDto dto){
            if(dto.getId().toString().isEmpty()){
                return new MessageResponse(false, "Product id not provided");
            }

            if(dto.getColour().isEmpty()){
                return new MessageResponse(false, "Available Product not provided");
            }
            if(dto.getQuantity().isEmpty()){
                return new MessageResponse(false, "Available Product quantity not provided");
            }
            if(dto.getSize().isEmpty()){
                return new MessageResponse(false, "Available Product size not provided");
            }else {
                return new MessageResponse( "Product Successfully validated");
            }

        }


    public static MessageResponse updatedValidation(AvailableProductDto dto){
        if(dto.getId().toString().isEmpty()){
            return new MessageResponse(false, "Product id not provided");
        }

        if(dto.getColour().isEmpty()){
            return new MessageResponse(false, "Available Product not provided");
        }
        if(dto.getQuantity().isEmpty()){
            return new MessageResponse(false, "Available Product quantity not provided");
        }
        if(dto.getSize().isEmpty()){
            return new MessageResponse(false, "Available Product size not provided");
        }else {
            return new MessageResponse( "Product Successfully validated");
        }

    }


    public static MessageResponse deletedValidation(AvailableProductDto dto){
        if(dto.getId().toString().isEmpty()){
            return new MessageResponse(false, "Product id not provided");
        }

        if(dto.getColour().isEmpty()){
            return new MessageResponse(false, "Available Product not provided");
        }
        if(dto.getQuantity().isEmpty()){
            return new MessageResponse(false, "Available Product quantity not provided");
        }
        if(dto.getSize().isEmpty()){
            return new MessageResponse(false, "Available Product size not provided");
        }else {
            return new MessageResponse( "Product Successfully validated");
        }

    }

}
