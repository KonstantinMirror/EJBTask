package com.datalex.training;


import com.datalex.training.bean.Customer;
import com.datalex.training.bean.FareFamily;
import com.datalex.training.bean.Reservation;
import com.datalex.training.dao.DAOFabric;
import com.datalex.training.dao.IDAO;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;
import java.rmi.RemoteException;

public class FlightBean implements SessionBean {
    @Override
    public void setSessionContext(SessionContext sessionContext) throws EJBException, RemoteException {
    }

    @Override
    public void ejbRemove() throws EJBException, RemoteException {
    }

    @Override
    public void ejbActivate() throws EJBException, RemoteException {
    }

    @Override
    public void ejbPassivate() throws EJBException, RemoteException {
    }

    public Customer getCustomer() throws RemoteException{
        IDAO dao = DAOFabric.getInstance();
        return dao.getCustomer("g:\\Training\\Source\\data.xml");
    }

    FareFamily getFareFamily() throws RemoteException{
        IDAO dao = DAOFabric.getInstance();
        return dao.getFareFamily("g:\\Training\\Source\\data.xml");
    }

    Reservation getReservation() throws RemoteException{
        IDAO dao = DAOFabric.getInstance();
        return dao.getReservation("g:\\Training\\Source\\data.xml");
    }



}
