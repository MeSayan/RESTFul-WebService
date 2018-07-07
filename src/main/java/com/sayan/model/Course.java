package com.sayan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

// Tell JPA to build a Relation (Table) for this class, where the fields
// of this class match to columns in the table
// A Topic instance will map to a row in the table and also vice versa
@Entity
public class Course {

	@Id // Tell JPA that this is the primary key for this relation
 	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Topic topic;
	
	
	public Course() {

	}
	
	public Course(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(id, "", "");
	}
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	
}