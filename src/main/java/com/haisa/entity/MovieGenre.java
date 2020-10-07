package com.haisa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class MovieGenre {
	
	@Entity
	@Table(name = "GenreMovie", schema = "dbo", catalog = "MovieManagement")
	public class GenreMovie {

		private Integer genreId;
		private String name;

		public GenreMovie() {
		}

		public GenreMovie(String name) {
			this.name = name;
		}

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)

		@Column(name = "genreid", unique = true, nullable = false)
		public Integer getGenreId() {
			return this.genreId;
		}

		public void setGenreId(Integer genreId) {
			this.genreId = genreId;
		}

		@Column(name = "name")
		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

}
