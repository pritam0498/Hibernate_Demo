package com.sp.hibernate.hibernate_demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="song")
public class Song {

	@Id
	private int id;
	private String name;
	private String singer;

	public Song() {
		super();
	}

	public Song(int id, String name, String singer) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "Song [id=" + id + ", name=" + name + ", singer=" + singer + "]";
	}

}
