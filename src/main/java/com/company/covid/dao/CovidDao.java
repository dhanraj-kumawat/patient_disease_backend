package com.company.covid.dao;

import com.company.covid.model.Covid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CovidDao extends JpaRepository<Covid, Long> {
}
