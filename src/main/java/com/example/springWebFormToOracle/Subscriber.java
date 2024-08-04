package com.example.springWebFormToOracle;

import jakarta.persistence.*;

@Entity
@Table(name = "subscriber")
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subscriber_seq_gen")
    @SequenceGenerator(name = "subscriber_seq_gen", sequenceName = "subscriber_seq", allocationSize = 1)
    private Long subscId;

    @Column(name = "subsc_name")
    private String subscName;

    @Column(name = "subsc_surname")
    private String subscSurname;

    @Column(name = "msisdn")
    private String msisdn;

    @Column(name = "tariff_id")
    private Long tariffId;


    public Long getSubscId() {
        return subscId;
    }

    public void setSubscId(Long subscId) {
        this.subscId = subscId;
    }

    public String getSubscName() {
        return subscName;
    }

    public void setSubscName(String subscName) {
        this.subscName = subscName;
    }

    public String getSubscSurname() {
        return subscSurname;
    }

    public void setSubscSurname(String subscSurname) {
        this.subscSurname = subscSurname;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public Long getTariffId() {
        return tariffId;
    }

    public void setTariffId(Long tariffId) {
        this.tariffId = tariffId;
    }
}
