package com.mm.entity;

import javax.persistence.*;

@Entity
@Table(name="Addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "streetname")
    private String streetName;
    @Column(name = "cityname")
    private String cityName;

    public Address(Long id, String postCode, String street, String city) {
        this.id = id;
        this.streetName = street;
        this.cityName = city;
    }

    public Address() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
