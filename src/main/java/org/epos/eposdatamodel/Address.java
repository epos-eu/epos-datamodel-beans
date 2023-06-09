package org.epos.eposdatamodel;

import java.util.Objects;

/**
 * Physical address of the item.
 */
public class Address {
    /**
     * The country.
     **/
    private String country = null;

    /**
     * The locality in which the street address is, and which is in the region. For example, Mountain View.
     **/
    private String locality = null;

    /**
     * The postal code. For example, 94043.
     **/
    private String postalCode = null;

    /**
     * The street address. For example, 1600 Amphitheatre Pkwy.
     **/
    private String street = null;

    /**
     * The two-letter ISO 3166-1 alpha-2 country code (e.g., IT, UK).
     */
    private String countryCode = null;


    public Address country(String country) {
        this.country = country;
        return this;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address locality(String locality) {
        this.locality = locality;
        return this;
    }


    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Address postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }


    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address street(String street) {
        this.street = street;
        return this;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }


    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", locality='" + locality + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(getCountry(), address.getCountry()) && Objects.equals(getLocality(), address.getLocality()) && Objects.equals(getPostalCode(), address.getPostalCode()) && Objects.equals(getStreet(), address.getStreet()) && Objects.equals(getCountryCode(), address.getCountryCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountry(), getLocality(), getPostalCode(), getStreet(), getCountryCode());
    }
}
