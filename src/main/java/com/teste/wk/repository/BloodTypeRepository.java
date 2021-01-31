package com.teste.wk.repository;

import com.teste.wk.Models.BloodType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodTypeRepository extends JpaRepository<BloodType,Integer> {
    BloodType findByTipo(String type);

}
