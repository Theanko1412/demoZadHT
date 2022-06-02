package com.ht.demozad.Audit;

import java.util.List;

//Used to provide auditing data.
public class Audit {

    //Audit ID.
    private String id;

    //User that created the record.
    private String createdBy;

    //Date when the record was created.
    private String createdDate;

    //User who modified the record
    private String changedBy;

    //Date when the record was modified.
    private String changedDate;

    //Version of record. Starts with 0 on insert and is increased by one on each update. -1 for deleted records.
    private String entityVersion;

    //Tag Id.
    private String tagId;

    //Span Id.
    private String spanId;

    //Reason why change has made.
    private String changeReason;

    //Source system that initiated change.
    private String sourceSystem;

    //Source system User that initiated change.
    private String sourceSystemUser;

    //List of characteristics
    private List characteristics;

}
