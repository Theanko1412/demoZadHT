package com.ht.demozad.CheckpointType;

import java.util.List;

//Checkpoint Type
public class CheckpointType {

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
    private List characteristics;

}
