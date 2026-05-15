package com.forsa.service_request_service.controller;

import com.forsa.service_request_service.dto.CreateServiceRequestRequest;
import com.forsa.service_request_service.dto.CraftsmanContactSummaryResponse;
import com.forsa.service_request_service.entity.ServiceRequest;
import com.forsa.service_request_service.repository.ServiceRequestRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping("/api/requests")
public class ServiceRequestController {

    private final ServiceRequestRepository serviceRequestRepository;
    private final RestTemplate restTemplate;

    public ServiceRequestController(ServiceRequestRepository serviceRequestRepository, RestTemplate restTemplate) {
        this.serviceRequestRepository = serviceRequestRepository;
        this.restTemplate = restTemplate;
    }

    @PostMapping
    public ResponseEntity<?> createRequest(@RequestBody CreateServiceRequestRequest request) {
        String craftsmanUrl = "http://localhost:8081/api/craftsmen/" + request.getCraftsmanId() + "/contact-summary";

        CraftsmanContactSummaryResponse craftsman;
        try {
            craftsman = restTemplate.getForObject(craftsmanUrl, CraftsmanContactSummaryResponse.class);
        } catch (Exception e) {
            return ResponseEntity.status(404).body("Craftsman not found in directory service");
        }

        String formattedPhone = craftsman.getPhone();
        if (formattedPhone.startsWith("0")) {
            formattedPhone = "97" + formattedPhone;
        }

        String whatsAppUrl = "https://wa.me/" + formattedPhone + "?text=Hello%20I%20want%20to%20request%20a%20service";

        ServiceRequest serviceRequest = new ServiceRequest();
        serviceRequest.setCraftsmanId(request.getCraftsmanId());
        serviceRequest.setHomeownerName(request.getHomeownerName());
        serviceRequest.setHomeownerPhone(request.getHomeownerPhone());
        serviceRequest.setAddress(request.getAddress());
        serviceRequest.setServiceDescription(request.getServiceDescription());
        serviceRequest.setCraftsmanName(craftsman.getFullName());
        serviceRequest.setCraftsmanPhone(craftsman.getPhone());
        serviceRequest.setStatus("CREATED");
        serviceRequest.setWhatsAppUrl(whatsAppUrl);

        ServiceRequest savedRequest = serviceRequestRepository.save(serviceRequest);
        return ResponseEntity.ok(savedRequest);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getRequestById(@PathVariable Long id) {
        Optional<ServiceRequest> requestOptional = serviceRequestRepository.findById(id);

        if (requestOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(requestOptional.get());
    }
}
