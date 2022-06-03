package com.ht.demozad.Location;

import com.ht.demozad.Point.Point;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

//A GeographicLocation allows describing through coordinate(s) a point, a line or a space.
@Entity
@Table(name = "Location")
public class Location {

    //Unique Identifier of a GeoLocation
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    //Href of the GeoLocation
    private String href;

    //Name of a GeoLocation
    private String name;

    //Type allows describing Geolocation form: it could be a point, a line, a polygon, a cylinder, etc...
    private String geometryType;

    //Accuracy
    private String accuracy;

    //Spatial reference
    private String spatialRef;

    //Geographical points related to location
    @OneToMany
    private List<Point> geometry;

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

    public String getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(String geometryType) {
        this.geometryType = geometryType;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
    }

    public String getSpatialRef() {
        return spatialRef;
    }

    public void setSpatialRef(String spatialRef) {
        this.spatialRef = spatialRef;
    }

    public List<Point> getGeometry() {
        return geometry;
    }

    public void setGeometry(List<Point> geometry) {
        this.geometry = geometry;
    }
}
