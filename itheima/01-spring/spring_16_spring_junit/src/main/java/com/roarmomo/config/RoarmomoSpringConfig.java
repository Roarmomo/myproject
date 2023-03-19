//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.roarmomo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.roarmomo"})
@PropertySource({"classpath:jdbc.properties"})
@Import({RoarmomoJdbcConfig.class,RoarmomoMybatisConfig.class})
public class RoarmomoSpringConfig {
    public RoarmomoSpringConfig() {
    }
}
