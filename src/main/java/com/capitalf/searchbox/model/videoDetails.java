package com.capitalf.searchbox.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class videoDetails {
	
	private long id;
	private String name;
	private String comments;
	/*
	 * private String description; private String thumbnailUrl; private String
	 * videoUrl;
	 */
	
	

	public videoDetails() {
		
	}
	
	public videoDetails(String name, String comments) {
		this.name = name;
		this.comments = comments;
		
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        public long getId() {
        return id;
    }
	public void setId(long id) {
        this.id = id;
    }
	@Column(name = "name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "comments", nullable = false)
	public String getComments() {
		return comments;
	}
	
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	@Override
    public String toString() {
        return "VideoDetails [id=" + id + ", name=" + name + ", comments=" + comments + "]";
    }
	
	
}
