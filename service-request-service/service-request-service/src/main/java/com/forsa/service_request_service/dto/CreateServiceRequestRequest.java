package com.forsa.service_request_service.dto;

public class CreateServiceRequestRequest {

    private Long craftsmanId;
    private String homeownerName;
    private String homeownerPhone;
    private String address;
    private String serviceDescription;

    public CreateServiceRequestRequest() {
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
}