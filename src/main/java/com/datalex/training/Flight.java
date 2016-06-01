package com.datalex.training;


import com.datalex.training.bean.Customer;
import com.datalex.training.bean.FareFamily;
import com.datalex.training.bean.Reservation;

import javax.ejb.EJBObject;
import java.rmi.RemoteException;

public interface Flight extends EJBObject {
    Customer getCustomer() throws RemoteException;
    FareFamily getFareFamily() throws RemoteException;
    Reservation getReservation() throws RemoteException;
}
