package com.learntime.clothShop.services;

import com.learntime.clothShop.model.ReservationModel;
import com.learntime.clothShop.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    ReservationRepository mReservationRepository;

    @Override
    public ReservationModel insert(ReservationModel reservationModel){

        return  mReservationRepository.save(reservationModel);
    }
    @Override
    public Optional<ReservationModel> findById(Long id) {

        return mReservationRepository.findById(id);
    }

    @Override
    public List<ReservationModel> findAll() {

        return mReservationRepository.findAll();
    }

    @Override
    public ReservationModel update(ReservationModel reservationModel){
        return  mReservationRepository.save(reservationModel);
    }
}
