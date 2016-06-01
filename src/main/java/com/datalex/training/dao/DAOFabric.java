package com.datalex.training.dao;


public class DAOFabric {

    public static IDAO getInstance(){
        return new DAOxml();
    }
}
