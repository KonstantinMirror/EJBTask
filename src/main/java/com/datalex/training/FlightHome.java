package com.datalex.training;

import javax.ejb.EJBHome;
import java.rmi.RemoteException;


public interface FlightHome extends EJBHome {
    Flight create()throws RemoteException;
}
