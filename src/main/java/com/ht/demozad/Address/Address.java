package com.ht.demozad.Address;


import com.ht.demozad.AddressRoleReference.AddressRoleReference;
import com.ht.demozad.Audit.Audit;
import com.ht.demozad.GeoCode.GeoCode;
import com.ht.demozad.Location.Location;
import com.ht.demozad.TimePeriod.TimePeriod;
import com.ht.demozad.VersionReference.VersionReference;

import java.util.List;

/*Structured textual way of describing how to find a Property in an urban area
        (country properties are often defined differently).*/
public class Address {

    //Unique identifier of the address
    private String id;

    //An URI used to access to the address resource
    private String href;

    private AddressRoleReference addressRole;

    private TimePeriod validFor;

    //Number identifying a specific property on a public street.
    // It may be combined with streetNrLast for ranged addresses
    private String streetNr;

    //The first street number suffix
    private String streetNrSuffix;

    //Last number in a range of street numbers allocated to a property
    private String streetNrLast;

    //Last street number suffix for a ranged address
    private String streetNrLastSuffix;

    //Name of the street or other street type
    private String streetName;

    //Alley, avenue, boulevard, brae, crescent, drive, highway, lane, terrace, parade, place, tarn, way, wharf
    private String streetType;

    //A modifier denoting a relative direction
    private String streetSuffix;

    //Descriptor for a postal delivery area, used to speed and simplify the delivery of mail (also known as zipcode)
    private String postcode;

    //Locality (suburb, principality, ...)
    private String locality;

    //City that the address is in
    private String city;

    //The State or Province that the address is in
    private String stateOrProvince;

    //Country(ISO 3166-1 alpha-3 digit code) that the address is in
    private String Country;

    private GeoCode geoCode;

    //Full address name used for presentation purposes
    private String fullAddressName;

    //List of characteristics
    private List characteristics;

    private Location location;

    //Addressing within a property (building, floor, ...)
    private List subAddress;

    private String note;

    private Audit audit;

    private VersionReference addressSpecRef;


}
