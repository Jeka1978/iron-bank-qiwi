package com.qiwi.ironbank.ironbankqiwi.testexamples;

import com.qiwi.ironbank.ironbankqiwi.QiwiTestConf;
import com.qiwi.ironbank.ironbankqiwi.services.IronBankService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;

import java.util.Arrays;

@SpringBootTest(classes = QiwiTestConf.class)
@ActiveProfiles("WINTER_IS_HERE")
//@SpringBootTest
//@ContextConfiguration(classes = QiwiTestConf.class)
class IronBankQiwiApplicationTests {
    static {
        System.setProperty("java.awt.headless", "false");
    }


    @Autowired
    ApplicationContext context;


    @Test
    void contextLoads() {
        System.out.println();
        System.out.println("bean names: ");
        System.out.println();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println();
        System.out.println(context.getBeanDefinitionCount());
        System.out.println("no more");
        System.out.println();
    }

}
