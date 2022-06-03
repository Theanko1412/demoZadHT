package com.ht.demozad.GeoCode;

import javax.persistence.*;
import java.io.Serializable;

//Used to provide information on geographic code. Deprecated and shouldn't be used. Use "location" instead.
@Deprecated
@Entity
@Table(name = "GeoCode")
public class GeoCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Geographic latitude
    private String latitude;

    //Geographic longitude
    private String longitude;

    //Geodetic datum
    private String geographicDatum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getGeographicDatum() {
        return geographicDatum;
    }

    public void setGeographicDatum(String geographicDatum) {
        this.geographicDatum = geographicDatum;
    }
}
