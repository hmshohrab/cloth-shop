package com.learntime.clothShop.repository;


import com.learntime.clothShop.model.CategoryModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationModel, Long> {
}
