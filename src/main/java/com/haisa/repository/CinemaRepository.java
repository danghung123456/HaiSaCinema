package com.haisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haisa.Entity.Cinema;


@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Integer> {
	Cinema findByCinemaId(Integer cinemaId);
}
