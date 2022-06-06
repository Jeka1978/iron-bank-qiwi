package com.qiwi.ironbank.ironbankqiwi.controllers;

import com.qiwi.ironbank.ironbankqiwi.services.IronBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Evgeny Borisov
 */
@RestController
public class IronBankController {

    @Autowired
    private IronBankService bankService;

    @GetMapping("/loan")
    public String loan(@RequestParam String name, @RequestParam double amount) {
        return bankService.loan(name, amount);
    }
}
