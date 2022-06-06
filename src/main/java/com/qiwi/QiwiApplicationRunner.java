package com.qiwi;

import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class QiwiApplicationRunner {
    public static ConfigurableApplicationContext run(Class<?> mainConfigurationClass) {
        //todo fix this method. In addition of creating and returning a context, you need to find
        // all AutoConfiguraions (find all values of org.springframework.boot.autoconfigure.EnableAutoConfiguration
        // and print it
        // bonus - make them activated
        return null;
    }
}
