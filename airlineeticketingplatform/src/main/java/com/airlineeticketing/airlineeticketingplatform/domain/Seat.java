package com.airlineeticketing.airlineeticketingplatform.domain;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Seat extends Abstract{
    private String seatNumber;
    @OneToOne
    private Flight flight;

    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatNumber='" + seatNumber + '\'' +
                ", flight=" + flight +
                '}';
    }
}
