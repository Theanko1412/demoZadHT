package com.ht.demozad.Audit;

import com.ht.demozad.Characteristic.Characteristic;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

//Used to provide auditing data.
@Entity
@Table(name = "Audit")
public class Audit {

    //Audit ID.
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
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
    @OneToMany
    private List<Characteristic> characteristics;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public String getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(String changedDate) {
        this.changedDate = changedDate;
    }

    public String getEntityVersion() {
        return entityVersion;
    }

    public void setEntityVersion(String entityVersion) {
        this.entityVersion = entityVersion;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public String getSourceSystemUser() {
        return sourceSystemUser;
    }

    public void setSourceSystemUser(String sourceSystemUser) {
        this.sourceSystemUser = sourceSystemUser;
    }

    public List<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }
}
