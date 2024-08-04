package com.example.springWebFormToOracle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

    @Autowired
    private SubscriberRepository subscriberRepository;

    @Scheduled(fixedRate = 10000)
    public void insertDataFromDataStore() {
        if (DataStore.getSubscName() != null) {
            Subscriber subscriber = new Subscriber();
            subscriber.setSubscName(DataStore.getSubscName());
            subscriber.setSubscSurname(DataStore.getSubscSurname());
            subscriber.setMsisdn(DataStore.getMsisdn());
            subscriber.setTariffId(DataStore.getTariffId());

            subscriberRepository.save(subscriber);
            System.out.println("Veri veritabanına eklendi: " + DataStore.getSubscName());

            DataStore.clearData();
        } else {
            System.out.println("DataStore'da ekleyecek veri bulunamadı.");
        }
    }
}
