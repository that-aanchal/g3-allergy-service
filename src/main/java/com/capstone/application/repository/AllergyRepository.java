package com.capstone.application.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capstone.application.model.Allergy;

public interface AllergyRepository extends JpaRepository<Allergy,Integer> {

	}
