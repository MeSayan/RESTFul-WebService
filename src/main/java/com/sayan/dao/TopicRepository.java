package com.sayan.dao;

import org.springframework.data.repository.CrudRepository;


import com.sayan.model.Topic;

// Crud Repository contains the logic for CRUD operations of any
// entity class


public interface TopicRepository extends CrudRepository<Topic, String> {

	// For special requirements, we need to implement those methods 
	// ourselves. For common tasks we can use provided functions
	
	// Common Methods: 
	// getAllTopics
	// getTopic(id)
	// UpdateTopic(id)
	// Delete Topic(id)
	
}
