package com.example.springWebFormToOracle;

import org.springframework.stereotype.Component;

@Component
public class DataStore {

    private static Long subscId;
    private static String subscName;
    private static String subscSurname;
    private static String msisdn;
    private static Long tariffId;

    public static Long getSubscId() {
        return subscId;
    }

    public static void setSubscId(Long subscId) {
        DataStore.subscId = subscId;
    }

    public static String getSubscName() {
        return subscName;
    }

    public static void setSubscName(String subscName) {
        DataStore.subscName = subscName;
    }

    public static String getSubscSurname() {
        return subscSurname;
    }

    public static void setSubscSurname(String subscSurname) {
        DataStore.subscSurname = subscSurname;
    }

    public static String getMsisdn() {
        return msisdn;
    }

    public static void setMsisdn(String msisdn) {
        DataStore.msisdn = msisdn;
    }

    public static Long getTariffId() {
        return tariffId;
    }

    public static void setTariffId(Long tariffId) {
        DataStore.tariffId = tariffId;
    }

    public static void clearData() {
        subscId = null;
        subscName = null;
        subscSurname = null;
        msisdn = null;
        tariffId = null;
    }
}
