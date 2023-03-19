package com.roarmomo;

import com.roarmomo.config.RoarmomoSpringConfig;
import com.roarmomo.dao.RoarmomoDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RooarmomoMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(RoarmomoSpringConfig.class);
        RoarmomoDao roarmomoDao = ctx.getBean(RoarmomoDao.class);
        roarmomoDao.select();

    }
}
