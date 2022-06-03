package com.ht.demozad.SubAddress;

import com.ht.demozad.Characteristic.Characteristic;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

//It is used for addressing within a property in an urban area (country properties are often defined differently).
// It may refer to a building, a building cluster, or a floor of a multistory building.
@Entity
@Table(name = "SubAddress")
public class SubAddress {

    //Unique Identifier of the subAddress
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    //Href of the subAddress
    private String href;

    //Type of subAddress: it can be a subunit or a private street
    private String type;

    //Name of the subAddress to identify it with a meaningful identification
    private String name;

    //The type of subunit e.g.BERTH, FLAT, PIER, SUITE, SHOP, TOWER, UNIT, WHARF.
    private String subUnitType;

    //The discriminator used for the subunit often just a simple number e.g. FLAT 5, may also be a range
    private String subUnitNumber;

    //Describes level types within a building
    private String levelType;

    //Used where a level type may be repeated e.g. BASEMENT 1, BASEMENT 2
    private String levelNumber;

    //Allows for buildings that have well-known names
    private String buildingName;

    //Private streets numbers internal to a private street
    private String privateStreetNumber;

    //Private streets internal to a property (e.g. a university)
    // may have internal names that are not recorded by the land title office
    private String privateStreetName;

    //Telecom specific characteristics
    @OneToMany
    private List<Characteristic> characteristics;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubUnitType() {
        return subUnitType;
    }

    public void setSubUnitType(String subUnitType) {
        this.subUnitType = subUnitType;
    }

    public String getSubUnitNumber() {
        return subUnitNumber;
    }

    public void setSubUnitNumber(String subUnitNumber) {
        this.subUnitNumber = subUnitNumber;
    }

    public String getLevelType() {
        return levelType;
    }

    public void setLevelType(String levelType) {
        this.levelType = levelType;
    }

    public String getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(String levelNumber) {
        this.levelNumber = levelNumber;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getPrivateStreetNumber() {
        return privateStreetNumber;
    }

    public void setPrivateStreetNumber(String privateStreetNumber) {
        this.privateStreetNumber = privateStreetNumber;
    }

    public String getPrivateStreetName() {
        return privateStreetName;
    }

    public void setPrivateStreetName(String privateStreetName) {
        this.privateStreetName = privateStreetName;
    }

    public List<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<Characteristic> characteristics) {
        this.characteristics = characteristics;
    }
}
