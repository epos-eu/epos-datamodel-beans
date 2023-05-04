package org.epos.eposdatamodel;

import java.util.Objects;

/**
 * A service contract.
 */
public class Contract extends EPOSDataModelEntity {

    /**
     * This property contains the main identifier for the Contract.
     **/
    private String identifier = null;

    private String status = null;

    private String name = null;

    private String type = null;


    public Contract identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }


    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Contract status(String status) {
        this.status = status;
        return this;
    }

    /**
     * This property contains information about the status of the Contract (e.g., signed, not signed).
     *
     * @return status
     **/

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Contract name(String name) {
        this.name = name;
        return this;
    }

    /**
     * This property contains the name of the Contract (e.g., signed, not signed).
     *
     * @return name
     **/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contract type(String type) {
        this.type = type;
        return this;
    }

    /**
     * This property contains the type of the Contract (e.g., MoU?, CA).
     *
     * @return type
     **/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public String toString() {
        return "Contract{" +
                "identifier='" + identifier + '\'' +
                ", status='" + status + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Contract contract = (Contract) o;
        return Objects.equals(getIdentifier(), contract.getIdentifier()) && Objects.equals(getStatus(), contract.getStatus()) && Objects.equals(getName(), contract.getName()) && Objects.equals(getType(), contract.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIdentifier(), getStatus(), getName(), getType());
    }
}
