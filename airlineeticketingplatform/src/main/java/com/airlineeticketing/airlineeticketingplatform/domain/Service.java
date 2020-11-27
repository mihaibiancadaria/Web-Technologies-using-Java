package com.airlineeticketing.airlineeticketingplatform.domain;
import javax.persistence.Entity;

@Entity
public class Service extends Abstract {

    private String serviceName;
    private int serviceFee;


    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getServiceFee() {
        return serviceFee;
    }
    public void setServiceFee(int serviceFee) {
        this.serviceFee = serviceFee;
    }

    @Override
    public String toString() {
        return "Service{" +
                "serviceName='" + serviceName + '\'' +
                ", serviceFee=" + serviceFee +
                '}';
    }
}
