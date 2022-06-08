package com.qiwi.ironbank.ironbankqiwi;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan(lazyInit = true,basePackages = "com.qiwi")
@EnableAutoConfiguration
public class QiwiTestConf {
    @Bean
    public float myAFloat() {
        return 12f;
    }


}
