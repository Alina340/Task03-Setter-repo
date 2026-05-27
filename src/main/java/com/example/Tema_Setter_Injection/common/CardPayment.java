package com.example.Tema_Setter_Injection.common;

import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentService{

    @Override
    public String processPayment(double amount) {
        return "Plata cu cardul " + amount + "ron a fost procesata";
    }

}
