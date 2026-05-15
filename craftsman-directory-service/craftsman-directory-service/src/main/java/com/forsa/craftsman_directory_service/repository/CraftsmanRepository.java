package com.forsa.craftsman_directory_service.repository;

import com.forsa.craftsman_directory_service.entity.Craftsman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CraftsmanRepository extends JpaRepository<Craftsman, Long> {
}
