package com.mycab.cabservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycab.cabservice.model.Cab;

@Repository
public interface CabRepository extends JpaRepository<Cab, Long> {

}
