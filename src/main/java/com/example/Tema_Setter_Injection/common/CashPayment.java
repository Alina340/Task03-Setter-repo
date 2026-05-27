package com.example.Tema_Setter_Injection.common;

import org.springframework.stereotype.Component;

@Component
public class CashPayment implements PaymentService{

    @Override
    public String processPayment(double amount) {
        return "Suma de " + amount + "ron a fost incasata";
    }

}
