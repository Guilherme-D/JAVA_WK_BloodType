package com.teste.wk.repository;

import com.teste.wk.Models.States;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatesRepository extends JpaRepository<States,Integer> {
    States findByUf(String state);
}
