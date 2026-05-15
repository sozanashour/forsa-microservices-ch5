package com.forsa.service_request_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "service_requests")
public class ServiceRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long craftsmanId;
    private String homeownerName;
    private String homeownerPhone;
    private String address;
    private String serviceDescription;

    private String craftsmanName;
    private String craftsmanPhone;

    private String status;
    private String whatsAppUrl;

    public ServiceRequest() {
    }

    public Long getId() {
        return id;
    }

    public Long getCraftsmanId() {
        return craftsmanId;
    }

    public void setCraftsmanId(Long craftsmanId) {
        this.craftsmanId = craftsmanId;
    }

    public String getHomeownerName() {
        return homeownerName;
    }

    public void setHomeownerName(String homeownerName) {
        this.homeownerName = homeownerName;
    }

    public String getHomeownerPhone() {
        return homeownerPhone;
    }

    public void setHomeownerPhone(String homeownerPhone) {
        this.homeownerPhone = homeownerPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public String getCraftsmanName() {
        return craftsmanName;
    }

    public void setCraftsmanName(String craftsmanName) {
        this.craftsmanName = craftsmanName;
    }

    public String getCraftsmanPhone() {
        return craftsmanPhone;
    }

    public void setCraftsmanPhone(String craftsmanPhone) {
        this.craftsmanPhone = craftsmanPhone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWhatsAppUrl() {
        return whatsAppUrl;
    }

    public void setWhatsAppUrl(String whatsAppUrl) {
        this.whatsAppUrl = whatsAppUrl;
    }
}
