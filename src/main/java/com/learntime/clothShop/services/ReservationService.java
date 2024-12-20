package com.learntime.clothShop.services;

import com.learntime.clothShop.model.ReservationModel;

import java.util.List;
import java.util.Optional;

public interface ReservationService {

    public ReservationModel insert(ReservationModel reservationModel);
    public Optional<ReservationModel> findById(Long id);

    public List<ReservationModel> findAll();

    public ReservationModel update(ReservationModel reservationModel);
}
