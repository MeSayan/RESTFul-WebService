package com.sayan.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sayan.dao.TopicRepository;
import com.sayan.model.Topic;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<>();
		// An iterable: topicRepository.findAll();
		topicRepository.findAll().forEach(topic -> topics.add(topic));
		return topics;
	}
	
	public Topic getTopic(String id) {
		Optional<Topic> res = topicRepository.findById(id);
		if (res.isPresent())
			return res.get();
		else
			return null;
	}
	
	public void updateTopic(String id, Topic topic) {
		// Repository is smart enough to know, if the row exits,
		// it needs to update it
		topicRepository.save(topic);
		//
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
	
}
	
