package com.sayan.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sayan.model.Course;

// Crud Repository contains the logic for CRUD operations of any
// entity class


public interface CourseRepository extends CrudRepository<Course, String> {

	// For special requirements, we need to implement those methods 
	// ourselves. For common tasks we can use provided functions
	
	// Common Methods: 
	// getAllTopics
	// getTopic(id)
	// UpdateTopic(id)
	// Delete Topic(id)
	
	// Spring JPA is smart enough to deduce the required SQL query based
	// on the method name we provide
	public List<Course> findByTopicId(String topicId);
	
}
