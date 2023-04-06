package com.groupfive.OnlineMovieTicketBooking.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Movie")
public class Movie {
	@Id
	private Integer id;
	private String name;
	private String description;
	private Date duration;
	private String language;
	
	public Movie() {}
	public Movie (Integer id, String name, String description, Date duration, String language) {
		super();
		this.id=id;
		this.name=name;
		this.description=description;
		this.duration=duration;
		this.language=language;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDuration() {
		return duration;
	}
	public void setDuration(Date duration) {
		this.duration = duration;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", description=" + description + ", duration=" + duration
				+ ", language=" + language + "]";
	}
	
}

