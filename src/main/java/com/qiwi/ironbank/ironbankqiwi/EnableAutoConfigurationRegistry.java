package com.qiwi.ironbank.ironbankqiwi;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.core.type.AnnotationMetadata;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class EnableAutoConfigurationRegistry implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        List<String> autoConfigurationNames = SpringFactoriesLoader.loadFactoryNames(EnableAutoConfiguration.class, ClassLoader.getSystemClassLoader());
        System.out.println("I found next Auto Configurations: ");
        autoConfigurationNames.forEach(System.out::println);
        System.out.println("*********************");
        return autoConfigurationNames.toArray(String[]::new);
    }
}




