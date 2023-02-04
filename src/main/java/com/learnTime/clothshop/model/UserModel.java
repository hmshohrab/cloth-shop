package com.learnTime.clothshop.model;

import javax.persistence.*;

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 29,September 2022
 *
 * @Company Data Grid Limited
 * @Address 14/A(new), Dhanmondi R/A, Dhaka 1209.
 * @Email shohrab.datagridltd@gmail.com
 */


@Entity
@Table(name = "users")
public class UserModel {
   @Id
   @Column(nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;

   private String firstName;
   String lastName;
   @Column(nullable = false)
   String email;
    String password;


   private String role;
   private String roleId;




   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getRole() {
      return role;
   }

   public void setRole(String role) {
      this.role = role;
   }

   public String getRoleId() {
      return roleId;
   }

   public void setRoleId(String roleId) {
      this.roleId = roleId;
   }
}