package com.datalex.training.dao;


import com.datalex.training.bean.Customer;
import com.datalex.training.bean.FareFamily;
import com.datalex.training.bean.Reservation;

public interface IDAO {
    Reservation getReservation(String nameFile);
    Customer getCustomer(String nameFile);
    FareFamily getFareFamily(String nameFile);
}
