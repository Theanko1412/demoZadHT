package com.ht.demozad.Location;

import java.util.List;

//A GeographicLocation allows describing through coordinate(s) a point, a line or a space.
public class Location {

    //Unique Identifier of a GeoLocation
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
    private List geometry;

}
