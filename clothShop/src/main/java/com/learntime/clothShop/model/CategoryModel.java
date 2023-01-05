package com.learntime.clothShop.model;

import jakarta.persistence.*;

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 05,January 2023
 *
 * @Company Data Grid Limited
 * @Address 14/A(new), Dhanmondi R/A, Dhaka 1209.
 * @Email shohrab.datagridltd@gmail.com
 */
@Entity
@Table(name = "categories")
public class CategoryModel {
   @Id
   @Column(name = "id", nullable = false)
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;



   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }
}
