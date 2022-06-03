package com.ht.demozad.AddressRoleReference;

import com.ht.demozad.TimePeriod.TimePeriod;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

//Used to provide information on Address role reference object
@Entity
@Table(name = "AddressRoleReference")
public class AddressRoleReference {

    enum role {
        goodsDelivery,
        contact,
        billDelivery,
        installation,
        legal,
        main
    }

    //Address role reference identifier
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    //Address role reference Hypertext Reference
    private String href;

    //Address role reference role
    @Enumerated(EnumType.STRING)
    private role role;

    //Address role reference name
    private String name;

    @OneToOne
    private TimePeriod validFor;

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

    public AddressRoleReference.role getRole() {
        return role;
    }

    public void setRole(AddressRoleReference.role role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TimePeriod getValidFor() {
        return validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }
}
