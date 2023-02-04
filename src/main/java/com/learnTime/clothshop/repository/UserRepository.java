package com.learnTime.clothshop.repository;

import com.learnTime.clothshop.model.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 30,September 2022
 *
 * @Company Data Grid Limited
 * @Address 14/A(new), Dhanmondi R/A, Dhaka 1209.
 * @Email shohrab.datagridltd@gmail.com
 */

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

  public boolean existsByEmail(String email);

  public UserModel findByEmail(String email);







}
