package com.ht.demozad.TimePeriod;

import javax.persistence.*;

@Entity
@Table(name = "TimePeriod")
public class TimePeriod {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Beginning of the time period
    private String startDateTime;

    //End of the time period
    private String endDateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        this.startDateTime = startDateTime;
    }

    public String getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(String endDateTime) {
        this.endDateTime = endDateTime;
    }
}
