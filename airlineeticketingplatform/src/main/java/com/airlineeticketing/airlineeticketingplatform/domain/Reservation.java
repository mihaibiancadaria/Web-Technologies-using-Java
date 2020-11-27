package com.airlineeticketing.airlineeticketingplatform.domain;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends Abstract {
    @OneToOne
    private Passenger passenger;
    @OneToOne
    private Flight flight;
    @OneToOne
    private Seat seat;
    @OneToOne
    private Service service;

    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Seat getSeat() {
        return seat;
    }
    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Service getService() {
        return service;
    }
    public void setService(Service service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "passenger=" + passenger +
                ", flight=" + flight +
                ", seat=" + seat +
                ", service=" + service +
                '}';
    }

}
