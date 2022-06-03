package com.ht.demozad.CustomerRefType;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

//Related customer on shipment tracking
@Entity
@Table(name = "CustomerRefType")
public class CustomerRefType {

    //Customer ID
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    //Resource URI
    private String href;

    //Customer name
    private String name;

    //Customer description
    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
