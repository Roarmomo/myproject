package com.roarmomo.dao.impl;

import com.roarmomo.dao.RoarmomoDao;
import org.springframework.stereotype.Repository;

@Repository
public class RoarmomoDaoImpl implements RoarmomoDao {
    public void save() {
        //记录程序当前执行执行（开始时间）
        Long startTime = System.currentTimeMillis();
        //业务执行万次
        for (int i = 0;i<10000;i++) {
            System.out.println("book dao save ...");
        }
        //记录程序当前执行时间（结束时间）
        Long endTime = System.currentTimeMillis();
        //计算时间差
        Long totalTime = endTime-startTime;
        //输出信息
        System.out.println("执行万次消耗时间：" + totalTime + "ms");
    }

    public void update(){
        System.out.println("book dao update ...");
    }

    public void delete(){
        System.out.println("book dao delete ...");
    }

    public void select(){System.out.println("book dao select ...");}
}
