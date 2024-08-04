package com.example.springWebFormToOracle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SubscriberController {

    @GetMapping("/form")
    public String showForm() {
        return "form";
    }

    @PostMapping("/saveSubscriber")
    public String saveSubscriber(
            @RequestParam("subscName") String subscName,
            @RequestParam("subscSurname") String subscSurname,
            @RequestParam("msisdn") String msisdn,
            @RequestParam("tariffId") Long tariffId) {

        DataStore.setSubscName(subscName);
        DataStore.setSubscSurname(subscSurname);
        DataStore.setMsisdn(msisdn);
        DataStore.setTariffId(tariffId);

        System.out.println("Kaydedilen Veriler: ");
        System.out.println("İsim: " + DataStore.getSubscName());
        System.out.println("Soyisim: " + DataStore.getSubscSurname());
        System.out.println("MSISDN: " + DataStore.getMsisdn());
        System.out.println("Tariff ID: " + DataStore.getTariffId());


        return "form";
    }
}
