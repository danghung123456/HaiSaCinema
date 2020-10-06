package com.haisa.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.haisa.DTO.MovieDTO;

@RestController
public class MovieAPI {


		@PostMapping(value = "/movie")
		public MovieDTO createMovie(@RequestBody MovieDTO model) {
			return model;
		}
		
		@PutMapping(value = "/movie")
		public MovieDTO updateMovie(@RequestBody MovieDTO model) {
			return model;
		}
		
		@DeleteMapping(value = "/movie")
		public void deleteMovie(@RequestBody long[] ids) {
			
		}
}

