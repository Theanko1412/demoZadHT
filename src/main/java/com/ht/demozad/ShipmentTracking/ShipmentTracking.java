package com.ht.demozad.ShipmentTracking;

import com.ht.demozad.Address.Address;
import com.ht.demozad.CustomerRefType.CustomerRefType;

import java.util.List;

//Shipment Tracking Type
public class ShipmentTracking {

    //Unique identifier of the shipment
    private String id;

    //Reference to the shipment to be queried or to perform actions on it via API
    private String href;

    //Carrier that is performing the shipment
    private String carrier;

    //Tracking code in the carrier network
    private String trackingCode;

    //URL to a public page provided by the carrier that shows tracking details for this tracker
    private String carrierTrackingUrl;

    //Date when the shipment began to be tracked
    private String trackingDate;

    //Current status of the package
    private String status;

    //Date when the tracking status last changed
    private String statusChangeDate;

    //Text describing the reason for the status of the tracking
    private String statusChangeReason;

    //Weight of the package in grams
    private Float weight;

    //Estimated deliveryDate
    private String estimatedDeliveryDate;

    private Address addressFrom;

    private Address addressTo;

    //Checkpoint Type
    private List checkpoint;

    //Order that triggered this shipment
    private List order;

    private CustomerRefType relatedCustomer;

    //Date when tracking shipment was created
    private String createDate;

    //List of characteristics
    private List characteristics;

}
