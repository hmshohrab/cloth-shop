package com.learnTime.clothshop.controller;

import com.learnTime.clothshop.model.MessageResponse;
import com.learnTime.clothshop.repository.UserRepository;
import com.learnTime.clothshop.request.UserModelRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 15,September,2022
 *
 * @Company Minisoft Park
 * @Address 18/Kha, West Nakhalpara, Tejgaon, Dhaka-1215
 * @Email shohrab.minisoftpark@gmail.com
 */

@RestController
@RequestMapping("/api/auth")
class AuthController {

//ApiResponse<UserModel> mApiResponse = new ApiResponse<>();
//ApiResponse<RoleModel> mApiResponse1 = new ApiResponse<>();

    @Autowired
    UserRepository mUserRepository;


    @PostMapping("/registration")
    public ResponseEntity<?> registration(@RequestBody UserModelRequest userModelRequest) {
        boolean exists = mUserRepository.existsByEmail(userModelRequest.getEmail());
        if (exists) {
            return ResponseEntity.badRequest().body(new MessageResponse("Error: Email is already taken!"));
        }
        //database





        return ResponseEntity.ok(userModelRequest);
    }

}

/*

class ApiResponse<T>{
    T anyData;
    int stutus;
    String message;

    void saveMyData(T data){
        save(data);
    }

    T getMydata(){
        return anyData;
    }

    */
/* {
    status : true,
    massage: "any",
    data:{any}
    }*//*

}*/
