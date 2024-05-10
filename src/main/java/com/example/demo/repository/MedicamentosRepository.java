package com.example.demo.repository;

import com.example.demo.model.Medicamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentosRepository extends JpaRepository<Medicamentos, Long> {
}
