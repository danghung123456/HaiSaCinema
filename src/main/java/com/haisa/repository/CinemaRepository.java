package com.haisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haisa.entity.Cinema;
import com.haisa.entity.Movie;

@Repository
public interface CinemaRepository extends JpaRepository<Cinema, Integer> {
	Cinema findByCinemaId(Integer cinemaId);
}
