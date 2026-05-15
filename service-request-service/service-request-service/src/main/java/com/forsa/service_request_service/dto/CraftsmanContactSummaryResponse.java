package com.forsa.service_request_service.dto;

public class CraftsmanContactSummaryResponse {

    private Long craftsmanId;
    private String fullName;
    private String phone;
    private String profession;
    private String city;

    public CraftsmanContactSummaryResponse() {
    }

    public Long getCraftsmanId() {
        return craftsmanId;
    }

    public void setCraftsmanId(Long craftsmanId) {
        this.craftsmanId = craftsmanId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
}