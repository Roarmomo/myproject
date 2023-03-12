package com.roarmomo.service.impl;

import com.roarmomo.service.RoarmomoService;
import org.springframework.stereotype.Service;

@Service("RoarmomoService")
public class RoarmomoImpl implements RoarmomoService {


    @Override
    public void save() {
        System.out.println("RoarmomoService save ...");
    }
}
