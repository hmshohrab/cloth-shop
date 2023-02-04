package com.learntime.clothShop.services;


import com.learntime.clothShop.model.AvailableProductModel;

import java.util.List;
import java.util.Optional;

public interface AvailableProductService {

    public AvailableProductModel insert(AvailableProductModel availableProductModel);

    public AvailableProductModel update(AvailableProductModel availableProductModel);

    public Optional<AvailableProductModel> findById(Long id);

    public List<AvailableProductModel> findAll();
}
