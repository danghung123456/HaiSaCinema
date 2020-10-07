package com.haisa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haisa.Entity.Movie;
@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer>{

	Movie findByMovieId(Integer movieId);
	
	
		
	}



