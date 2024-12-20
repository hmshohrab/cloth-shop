package com.learntime.clothShop.repository;


import com.learntime.clothShop.model.AvailableProductModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AvailableProductRepository extends JpaRepository<AvailableProductModel, Long> {
}
