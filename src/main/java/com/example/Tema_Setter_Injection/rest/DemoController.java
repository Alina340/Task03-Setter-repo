package com.example.Tema_Setter_Injection.rest;

import com.example.Tema_Setter_Injection.common.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private PaymentService paymentService;

    //setter
    @Autowired
    @Qualifier("cardPayment")
    public void setPaymentService(PaymentService thePaymentService) {
        paymentService = thePaymentService;
    }

    @GetMapping("/payment")
    public String getProcessService(@RequestParam double amount) {
        return paymentService.processPayment(amount );
    }

}
