package com.forsa.craftsman_directory_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "craftsmen")
public class Craftsman {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String profession;
    private String city;
    private String phone;
    private String status;

    public Craftsman() {
    }

    public Craftsman(Long id, String fullName, String profession, String city, String phone, String status) {
        this.id = id;
        this.fullName = fullName;
        this.profession = profession;
        this.city = city;
        this.phone = phone;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}