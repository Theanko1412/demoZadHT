package com.ht.demozad.Point;

import javax.persistence.*;
import java.io.Serializable;

//A GeographicPoint defines a geographic point through coordinates.
@Entity
@Table(name = "Point")
public class Point {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //x coordinate (usually latitude)
    private String x;

    //y coordinate (usually longitude)
    private String y;

    //z coordinate (usually elevation)
    private String z;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getZ() {
        return z;
    }

    public void setZ(String z) {
        this.z = z;
    }
}
