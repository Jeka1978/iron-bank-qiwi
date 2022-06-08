package com.qiwi.ironbank.ironbankqiwi;

import com.qiwi.ironbank.ironbankqiwi.controllers.IronBankController;
import com.qiwi.ironbank.ironbankqiwi.services.IronBankService;
import com.qiwi.ironbank.ironbankqiwi.services.PredictionService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Arrays;

@SpringBootApplication
public class IronBankQiwiApplication {

    public static void main(String[] args) {

        System.setProperty("java.awt.headless", "false");
        ConfigurableApplicationContext context = SpringApplication.run(IronBankQiwiApplication.class);
        System.out.println();
        System.out.println("**********");
        System.out.println(context.getBean(PredictionService.class).getClass());
        System.out.println(context.getBean(IronBankService.class).getClass());
        System.out.println(context.getBean(IronBankController.class).getClass());
        System.out.println("**********");
        System.out.println("bean names: ");


        System.out.println();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println();
        System.out.println(context.getBeanDefinitionCount());
        System.out.println("no more");
        System.out.println();
    }

}
