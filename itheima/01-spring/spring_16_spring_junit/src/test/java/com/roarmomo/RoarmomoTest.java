package com.roarmomo;

import com.roarmomo.config.RoarmomoSpringConfig;
import com.roarmomo.domain.RoarmomoBFO;
import com.roarmomo.service.RoarmomoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RoarmomoSpringConfig.class)
public class RoarmomoTest {
    @Autowired
    private RoarmomoService roarmomoService;

    @Test
    public void test(){
        RoarmomoBFO roarmomoBFO = new RoarmomoBFO();
        roarmomoBFO.setName("陈龙");
        roarmomoBFO.setYear("2023");
        roarmomoBFO.setMonth("03");
        System.out.println(roarmomoService.queryByName(roarmomoBFO).toString());
    }

}