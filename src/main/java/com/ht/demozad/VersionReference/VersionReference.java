package com.ht.demozad.VersionReference;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

//Generic link to another versioning resource
@Entity
@Table(name = "VersionReference")
public class VersionReference {

    //Unique identifier of the Reference
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    //URI of the Reference
    private String href;

    //Name of the Reference
    private String name;

    //Version of the Reference
    private String version;

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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
