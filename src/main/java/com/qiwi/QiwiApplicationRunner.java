package com.qiwi;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class QiwiApplicationRunner {
    public static ConfigurableApplicationContext run(Class<?> mainConfigurationClass) {
        //todo fix this method. In addition of creating and returning a context, you need to find
        // all AutoConfiguraions (find all values of org.springframework.boot.autoconfigure.EnableAutoConfiguration
        // and print it
        // bonus - make them activated

        return new AnnotationConfigApplicationContext(mainConfigurationClass);
    }
}
