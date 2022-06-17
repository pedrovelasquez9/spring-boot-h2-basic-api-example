package com.PEE.api.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PEE.api.entity.Countries;

@Repository
public interface CountryRepository extends JpaRepository<Countries, Integer>{

}
