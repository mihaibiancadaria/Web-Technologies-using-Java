package com.airlineeticketing.airlineeticketingplatform.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;


import java.sql.Timestamp;
import java.util.Date;

@Entity
public class Flight extends Abstract {

    private String flightNumber;
    private Date dateOfDeparture;
    private Timestamp estimatedTimeOfDeparture;
    private Timestamp estimatedTimeOfArrival;
    @OneToOne
    private Route route;

    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public java.util.Date getDateOfDeparture() { return dateOfDeparture; }
    public void setDateOfDeparture(java.util.Date dateOfDeparture) { this.dateOfDeparture = dateOfDeparture; }

    public Timestamp getEstimatedTimeOfDeparture() {
        return estimatedTimeOfDeparture;
    }
    public void setEstimatedTimeOfDeparture(Timestamp estimatedTimeOfDeparture) { this.estimatedTimeOfDeparture = estimatedTimeOfDeparture; }

    public Timestamp getEstimatedTimeOfArrival() {
        return estimatedTimeOfArrival;
    }
    public void setEstimatedTimeOfArrival(Timestamp estimatedTimeOfArrival) { this.estimatedTimeOfArrival = estimatedTimeOfArrival; }

    public Route getRoute() {
        return route;
    }
    public void setRoute(Route route) {
        this.route = route;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", dateOfDeparture='" + dateOfDeparture + '\'' +
                ", estimatedTimeOfDeparture='" + estimatedTimeOfDeparture + '\'' +
                ", estimatedTimeOfArrival='" + estimatedTimeOfArrival + '\'' +
                ", route=" + route +
                '}';
    }

}
