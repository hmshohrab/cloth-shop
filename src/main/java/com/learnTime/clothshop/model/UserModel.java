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
   @Column(name = "id", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;



   @Column(name = "firstName", nullable = false)
   private String firstName;
   @Column(name = "lastName", nullable = false)
   String lastName;
   @Column( name = "email",nullable = false)
   String email;
   @Column(name = "password", nullable = false)
   String password;


/*
   @OneToMany//(fetch = FetchType.EAGER)
   @JoinTable(
           name = "user_role",
           joinColumns = @JoinColumn(name = "product_id"),
           inverseJoinColumns = @JoinColumn(name = "category_id")
   )

   private final Set<Category> mCategories = new HashSet<>();

   public void addCategory(Category category) {
      this.mCategories.add(category);
   }
*/


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
}
