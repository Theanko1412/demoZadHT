package com.ht.demozad.ShipmentTracking;

import com.ht.demozad.Address.Address;
import com.ht.demozad.Characteristic.Characteristic;
import com.ht.demozad.CheckpointType.CheckpointType;
import com.ht.demozad.CustomerRefType.CustomerRefType;
import com.ht.demozad.OrderRefType.OrderRefType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

//Shipment Tracking Type
@Entity
@Table(name = "ShipmentTracking")
public class ShipmentTracking {

    enum status {
        initialized,
        inProcess,
        processed,
        shipped,
        inCustoms,
        delivered,
        returned,
        error
    }

    //Unique identifier of the shipment
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
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
    @Enumerated(EnumType.STRING)
    private status status;

    //Date when the tracking status last changed
    private String statusChangeDate;

    //Text describing the reason for the status of the tracking
    private String statusChangeReason;

    //Weight of the package in grams
    private Float weight;

    //Estimated deliveryDate
    private String estimatedDeliveryDate;

    @OneToOne
    private Address addressFrom;

    @OneToOne
    private Address addressTo;

    //Checkpoint Type
    @OneToMany
    private List<CheckpointType> checkpoint;

    //Order that triggered this shipment
    @OneToMany
    private List<OrderRefType> order;

    @OneToOne
    private CustomerRefType relatedCustomer;

    //Date when tracking shipment was created
    private LocalDate createDate;

    //List of characteristics
    @OneToMany
    private List<Characteristic> characteristics;

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

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public String getCarrierTrackingUrl() {
        return carrierTrackingUrl;
    }

    public void setCarrierTrackingUrl(String carrierTrackingUrl) {
        this.carrierTrackingUrl = carrierTrackingUrl;
    }

    public String getTrackingDate() {
        return trackingDate;
    }

    public void setTrackingDate(String trackingDate) {
        this.trackingDate = trackingDate;
    }

    public status getStatus() {
        return status;
    }

    public void setStatus(status status) {
        this.status = status;
    }

    public String getStatusChangeDate() {
        return statusChangeDate;
    }

    public void setStatusChangeDate(String statusChangeDate) {
        this.statusChangeDate = statusChangeDate;
    }

    public String getStatusChangeReason() {
        return statusChangeReason;
    }

    public void setStatusChangeReason(String statusChangeReason) {
        this.statusChangeReason = statusChangeReason;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(String estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public Address getAddressFrom() {
        return addressFrom;
    }

    public void setAddressFrom(Address addressFrom) {
        this.addressFrom = addressFrom;
    }

    public Address getAddressTo() {
        return addressTo;
    }

    public void setAddressTo(Address addressTo) {
        this.addressTo = addressTo;
    }

    public List<CheckpointType> getCheckpoint() {
        return checkpoint;
    }

    public void setCheckpoint(List<CheckpointType> checkpoint) {
        this.checkpoint = checkpoint;
    }

    public List<OrderRefType> getOrder() {
        return order;
    }

    public void setOrder(List<OrderRefType> order) {
        this.order = order;
    }

    public CustomerRefType getRelatedCustomer() {
        return relatedCustomer;
    }

    public void setRelatedCustomer(CustomerRefType relatedCustomer) {
        this.relatedCustomer = relatedCustomer;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public List<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }
}
