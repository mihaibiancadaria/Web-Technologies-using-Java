package com.airlineeticketing.airlineeticketingplatform.domain;
import javax.persistence.Entity;

@Entity
public class Route extends Abstract{

    private String departureAirport;
    private String arrivalAirport;
    private int transportationFee;

    public String getDepartureAirport() {
        return departureAirport;
    }
    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getTransportationFee() {
        return transportationFee;
    }
    public void setTransportationFee(int transportationFee) {
        this.transportationFee = transportationFee;
    }

    @Override
    public String toString() {
        return "Route{" +
                "departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                ", transportationFee=" + transportationFee +
                '}';
    }
}
