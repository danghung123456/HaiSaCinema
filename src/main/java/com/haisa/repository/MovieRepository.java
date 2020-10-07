package com.haisa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.haisa.entity.Movie;
@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer>{

	Movie findByMovieId(Integer movieId);
	
	
		
	}



