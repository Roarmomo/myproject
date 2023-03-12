package com.roarmomo.dao.impl;


import com.roarmomo.dao.RoarmomoDao;
import org.springframework.stereotype.Repository;

@Repository("RoarmomoDao")
public class RoarmomoDaoImpl implements RoarmomoDao {

    public void save() {
        System.out.println("RoarmomoDao save ...");
    }
}
