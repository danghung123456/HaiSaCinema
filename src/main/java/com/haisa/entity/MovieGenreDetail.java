package com.haisa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "MovieGenreDetail", schema = "dbo", catalog = "MovieManagement")
	public class MovieGenreDetail{

		private Integer movieGenreDetailId;
		private Integer movieId;
		private Integer genreId;

		public MovieGenreDetail() {
		}

		public MovieGenreDetail(Integer movieId, Integer genreId) {
			this.movieId = movieId;
			this.genreId = genreId;
		}

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)

		@Column(name = "moviegenredetailid", unique = true, nullable = false)
		public Integer getMovieGenreDetailId() {
			return this.movieGenreDetailId;
		}

		public void setMovieGenreDetailId(Integer movieGenreDetailId) {
			this.movieGenreDetailId = movieGenreDetailId;
		}

		@Column(name = "movieid")
		public Integer getMovieId() {
			return this.movieId;
		}

		public void setMovieId(Integer movieId) {
			this.movieId = movieId;
		}

		@Column(name = "genreid")
		public Integer getGenreId() {
			return this.genreId;
		}

		public void setGenreId(Integer genreId) {
			this.genreId = genreId;
		}

	}

