package com.learntime.clothShop.manager;


import com.learntime.clothShop.dto.ProductDto;
import com.learntime.clothShop.response.MessageResponse;

public class ReservationManager {
    //id, idProduct, reference, status, expireDate
    public static MessageResponse validation(ReservationDto dto){
        if(dto.getReference().isEmpty()){
            return new MessageResponse(false, "Reservation not provided");
        }
        if(dto.getStatus().isEmpty()){
            return new MessageResponse(false, "Reservation not provided");
        }
        if(dto.getExpireDate().toString().isEmpty()){
            return new MessageResponse(false, "Reservation not provided");
        }
         else {
            return new MessageResponse( "Reservation Successfully validated");
        }
    }

    public static MessageResponse readValidation(ReservationDto dto){
        if(dto.getReference().isEmpty()){
            return new MessageResponse(false, "Reservation not provided");
        }
        if(dto.getStatus().isEmpty()){
            return new MessageResponse(false, "Reservation not provided");
        }
        if(dto.getExpireDate().toString().isEmpty()){
            return new MessageResponse(false, "Reservation not provided");
        }
        else {
            return new MessageResponse( "Reservation Successfully validated");
        }
    }

    public static MessageResponse updatedValidation(ReservationDto dto){
        if(dto.getReference().isEmpty()){
            return new MessageResponse(false, "Reservation not provided");
        }
        if(dto.getStatus().isEmpty()){
            return new MessageResponse(false, "Reservation not provided");
        }
        if(dto.getExpireDate().toString().isEmpty()){
            return new MessageResponse(false, "Reservation not provided");
        }
        else {
            return new MessageResponse( "Reservation Successfully validated");
        }

}

    public static MessageResponse deletedValidation(ReservationDto dto){
        if(dto.getReference().isEmpty()){
            return new MessageResponse(false, "Reservation not provided");
        }
        if(dto.getStatus().isEmpty()){
            return new MessageResponse(false, "Reservation not provided");
        }
        if(dto.getExpireDate().toString().isEmpty()){
            return new MessageResponse(false, "Reservation not provided");
        }
        else {
            return new MessageResponse( "Reservation Successfully validated");
        }
}
}
