package com.qiwi.ironbank;

import com.qiwi.QiwiApplicationRunner;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = QiwiApplicationRunner.run(Conf.class);
        System.out.println();
    }
}
