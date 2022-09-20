package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.Certificate;



public interface CertificateRepository extends JpaRepository<Certificate, Integer>{

}
