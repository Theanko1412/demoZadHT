package com.ht.demozad.Address;


import com.ht.demozad.AddressRoleReference.AddressRoleReference;
import com.ht.demozad.Audit.Audit;
import com.ht.demozad.Characteristic.Characteristic;
import com.ht.demozad.GeoCode.GeoCode;
import com.ht.demozad.Location.Location;
import com.ht.demozad.SubAddress.SubAddress;
import com.ht.demozad.TimePeriod.TimePeriod;
import com.ht.demozad.VersionReference.VersionReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

/*Structured textual way of describing how to find a Property in an urban area
        (country properties are often defined differently).*/
@Entity
@Table(name = "Address")
public class Address {

    //Unique identifier of the address
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    //An URI used to access to the address resource
    private String href;

    @OneToOne
    private AddressRoleReference addressRole;

    @OneToOne
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

    @OneToOne
    private GeoCode geoCode;

    //Full address name used for presentation purposes
    private String fullAddressName;

    //List of characteristics
    @OneToMany
    private List<Characteristic> characteristics;

    @OneToOne
    private Location location;

    //Addressing within a property (building, floor, ...)
    @OneToMany
    private List<SubAddress> subAddress;

    private String note;

    @OneToOne
    private Audit audit;

    @OneToOne
    private VersionReference addressSpecRef;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public AddressRoleReference getAddressRole() {
        return addressRole;
    }

    public void setAddressRole(AddressRoleReference addressRole) {
        this.addressRole = addressRole;
    }

    public TimePeriod getValidFor() {
        return validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }

    public String getStreetNr() {
        return streetNr;
    }

    public void setStreetNr(String streetNr) {
        this.streetNr = streetNr;
    }

    public String getStreetNrSuffix() {
        return streetNrSuffix;
    }

    public void setStreetNrSuffix(String streetNrSuffix) {
        this.streetNrSuffix = streetNrSuffix;
    }

    public String getStreetNrLast() {
        return streetNrLast;
    }

    public void setStreetNrLast(String streetNrLast) {
        this.streetNrLast = streetNrLast;
    }

    public String getStreetNrLastSuffix() {
        return streetNrLastSuffix;
    }

    public void setStreetNrLastSuffix(String streetNrLastSuffix) {
        this.streetNrLastSuffix = streetNrLastSuffix;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetType() {
        return streetType;
    }

    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    public String getStreetSuffix() {
        return streetSuffix;
    }

    public void setStreetSuffix(String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
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
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public GeoCode getGeoCode() {
        return geoCode;
    }

    public void setGeoCode(GeoCode geoCode) {
        this.geoCode = geoCode;
    }

    public String getFullAddressName() {
        return fullAddressName;
    }

    public void setFullAddressName(String fullAddressName) {
        this.fullAddressName = fullAddressName;
    }

    public List<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<SubAddress> getSubAddress() {
        return subAddress;
    }

    public void setSubAddress(List<SubAddress> subAddress) {
        this.subAddress = subAddress;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Audit getAudit() {
        return audit;
    }

    public void setAudit(Audit audit) {
        this.audit = audit;
    }

    public VersionReference getAddressSpecRef() {
        return addressSpecRef;
    }

    public void setAddressSpecRef(VersionReference addressSpecRef) {
        this.addressSpecRef = addressSpecRef;
    }
}
