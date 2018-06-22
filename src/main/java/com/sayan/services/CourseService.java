package com.sayan.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sayan.dao.CourseRepository;
import com.sayan.model.Course;




@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> courseList = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(course -> courseList.add(course));
		return courseList;
	}
	
	public Course getCourse(String id) {
		Optional<Course> res = courseRepository.findById(id);
		if (res.isPresent())
			return res.get();
		else
			return null;
	}
	
	
	public void updateCourse(String id, Course Course) {
		// Repository is smart enough to know, if the row exits,
		// it needs to update it
		courseRepository.save(Course);
	}
	
	public void addCourse(Course course) {
		courseRepository.save(course);
	}
	
	
	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}
	
}
	
