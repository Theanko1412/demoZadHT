package com.ht.demozad.OrderRefType;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

//Reference to an order that can typically be queried with another API
@Entity
@Table(name = "OrderRefType")
public class OrderRefType {

    //Unique identifier of the order
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    //URI where to query or perform actions on the order
    private String href;

    //Screen name of the order
    private String name;

    //Type of the referred order in case it is polymorphic
    private String referredType;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReferredType() {
        return referredType;
    }

    public void setReferredType(String referredType) {
        this.referredType = referredType;
    }
}
