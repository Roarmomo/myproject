//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.roarmomo.service.Impl;

import com.roarmomo.dao.RoarmomoDao;
import com.roarmomo.domain.RoarmomoBFO;
import com.roarmomo.service.RoarmomoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoarmomoServiceImpl implements RoarmomoService {
    @Autowired
    private RoarmomoDao roarmomoDao;

    public RoarmomoServiceImpl() {
    }

    public void save(RoarmomoBFO roarmomoBFO) {
        this.roarmomoDao.save(roarmomoBFO);
    }

    public RoarmomoBFO queryByName(RoarmomoBFO roarmomoBFO) {
        RoarmomoBFO roarmomoBFOInfo = this.roarmomoDao.queryByName(roarmomoBFO);
        return roarmomoBFOInfo;
    }
}
