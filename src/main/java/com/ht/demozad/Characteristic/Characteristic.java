package com.ht.demozad.Characteristic;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Characteristic")
public class Characteristic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //characteristic name
    private String name;

    //characteristic value
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
