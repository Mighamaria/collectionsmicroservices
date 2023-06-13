package com.ust.DoctorPatient.repository;

import com.ust.DoctorPatient.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctoreRepository extends JpaRepository<Doctor,Integer> {
}
