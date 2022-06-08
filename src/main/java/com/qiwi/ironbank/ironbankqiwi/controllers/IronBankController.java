package com.qiwi.ironbank.ironbankqiwi.controllers;

import com.qiwi.ironbank.ironbankqiwi.services.IronBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@RestController
public class IronBankController {

    @Autowired
    private IronBankService bankService;

    @Autowired
    private Environment environment;

    @Value("${qiwi.location}")
    private String qiwiLocation;

    @PostConstruct
    public void printQiwiLocation() {
        System.out.println("qiwiLocation = " + qiwiLocation);

    }

    @GetMapping("/loan")
    public String loan(@RequestParam String name, @RequestParam double amount) {
        return bankService.loan(name, amount);
    }
}
