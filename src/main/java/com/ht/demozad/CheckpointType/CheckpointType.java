package com.ht.demozad.CheckpointType;

import com.ht.demozad.Characteristic.Characteristic;

import javax.persistence.*;
import java.util.List;

//Checkpoint Type
@Entity
@Table(name = "CheckpointType")
public class CheckpointType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Status of the package at the time of the scan event
    private String status;

    //Message describing the performed action e.g.: attempted delivery, departed from warehouse...
    private String message;

    //Date
    private String date;

    //Location display name
    private String checkPost;

    //Local administrative name such as a city, town, municipality or council, partido, concello, etc.
    // that might comprise smaller entities
    private String city;

    //Region, state, or province
    private String stateOrProvince;

    //Country(ISO 3166-1 alpha-3 digit code) that the address is in
    private String country;

    //List of characteristics
    @OneToMany
    private List<Characteristic> characteristics;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCheckPost() {
        return checkPost;
    }

    public void setCheckPost(String checkPost) {
        this.checkPost = checkPost;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateOrProvince() {
        return stateOrProvince;
    }

    public void setStateOrProvince(String stateOrProvince) {
        this.stateOrProvince = stateOrProvince;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }
}
