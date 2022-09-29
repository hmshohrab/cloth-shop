package com.learnTime.clothshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BISMILLAH HIR RAHMAN NIR RAHIM
 * Created by Shohrab Hossen on 19,September,2022
 *
 * @Company Minisoft Park
 * @Address 18/Kha, West Nakhalpara, Tejgaon, Dhaka-1215
 * @Email shohrab.minisoftpark@gmail.com
 */

@Entity
@Table(name = "users")
public class UserModel {
   @Id
   @Column(name = "id", nullable = false)
   private Long id;

   String name;
   String age;

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }


   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAge() {
      return age;
   }

   public void setAge(String age) {
      this.age = age;
   }
}
