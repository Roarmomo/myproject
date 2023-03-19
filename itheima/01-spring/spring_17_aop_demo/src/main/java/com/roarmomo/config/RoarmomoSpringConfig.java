package com.roarmomo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration

@ComponentScan("com.roarmomo")
@EnableAspectJAutoProxy
public class RoarmomoSpringConfig {
}
