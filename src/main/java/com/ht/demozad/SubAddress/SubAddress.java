package com.ht.demozad.SubAddress;

import java.util.List;

//It is used for addressing within a property in an urban area (country properties are often defined differently).
// It may refer to a building, a building cluster, or a floor of a multistory building.
public class SubAddress {

    //Unique Identifier of the subAddress
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
    private List characteristics;

}
