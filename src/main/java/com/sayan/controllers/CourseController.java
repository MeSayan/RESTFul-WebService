package com.sayan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sayan.model.Course;
import com.sayan.model.Topic;
import com.sayan.services.CourseService;
import com.sayan.services.TopicService;

@RestController
@RequestMapping("/topics/{topicId}")
public class CourseController {


	@Autowired
	TopicService topicService;
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/courses")
	public List<Course> getCourses(@PathVariable String topicId) {
		return courseService.getAllCourses(topicId);
	}
	
	@RequestMapping(value="/courses/{courseId}")
	public Course getCourse(@PathVariable String topicId, @PathVariable String courseId) {
		return courseService.getCourse(courseId);
	}
	
	@RequestMapping(value="/courses", method=RequestMethod.POST) 
	public void addCourse(@PathVariable String topicId, @RequestBody Course course) {
		Topic topic = topicService.getTopic(topicId);
		course.setTopic(new Topic(topicId, topic.getName(), topic.getDescription()));
		courseService.addCourse(course);
	}
	
	@RequestMapping(value="/courses/{courseId}", method=RequestMethod.PUT) 
	public void updateCourse(@RequestBody Course course,@PathVariable String topicId,
			@PathVariable String courseId) {
		Topic topic = topicService.getTopic(topicId);
		course.setTopic(new Topic(topicId, topic.getName(), topic.getDescription()));
		courseService.updateCourse(courseId, course);
	}
	
	
	@RequestMapping(value="/courses/{courseId}", method = RequestMethod.DELETE)
	public void deleteCourse(@PathVariable String topicId, @PathVariable String courseId) {
		courseService.deleteCourse(courseId);
	}
	
}
