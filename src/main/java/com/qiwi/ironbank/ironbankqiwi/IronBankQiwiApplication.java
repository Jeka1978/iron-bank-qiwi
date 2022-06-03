package com.qiwi.ironbank.ironbankqiwi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class IronBankQiwiApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(IronBankQiwiApplication.class, args);
        System.out.println();
    }

}
