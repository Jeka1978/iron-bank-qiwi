package com.qiwi.ironbank.legacy;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Singleton
public class QiwiLegacyService {

    @PostConstruct
    public void init(){
        System.out.println("Qiwi legacy service working...");
    }
}
