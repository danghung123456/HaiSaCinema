package com.haisa.Entity;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GenreMovie", schema = "dbo", catalog = "MovieManagement")
public class GenreMovie   {

	private Integer genreId;
	private String name;

	public GenreMovie() {
	}

	public GenreMovie(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "genreId", unique = true, nullable = false)
	public Integer getGenreId() {
		return this.genreId;
	}

	public void setGenreId(Integer genreId) {
		this.genreId = genreId;
	}

	@Column(name = "name")
	public Serializable getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
