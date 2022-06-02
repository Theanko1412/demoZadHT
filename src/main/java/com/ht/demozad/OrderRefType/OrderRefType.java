package com.ht.demozad.OrderRefType;

//Reference to an order that can typically be queried with another API
public class OrderRefType {

    //Unique identifier of the order
    private String id;

    //URI where to query or perform actions on the order
    private String href;

    //Screen name of the order
    private String name;

    //Type of the referred order in case it is polymorphic
    private String referredType;

}
