package com.ssi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssi.entities.Course;
import com.ssi.services.CourseService;

@RestController
@RequestMapping("course")
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	
	//service for adding a resource (insertion)
	
	@PostMapping(produces="application/json", consumes="application/json")
	public Course addCourse(@RequestBody Course course) {
		return service.saveCourse(course);
	}
	
	//service for updating a resource (insertion)
	
	@PutMapping(produces="application/json", consumes="application/json")
	public Course updatingCourse(@RequestBody Course course) {
			return service.saveCourse(course);
	}
	
	@GetMapping(value="json/all", produces="application/json")
	public List<Course> showAllCourses(){
		return service.getAllCourses();
	}
	@GetMapping(value="{min}/{max}", produces="application/json")
	public List<Course> showAllCoursesInFeeRange(@PathVariable("min") int low, @PathVariable("max") int high){
		return service.getCoursesInFeesRange(low, high);
	}
	
	@GetMapping(value="{code}",produces="text/html")
	public String showTextInfo(@PathVariable("code") int cid) {
		Course c=service.searchCourseById(cid);
		return c.toString();
	}
	@GetMapping(value="xml/{code}", produces="application/xml")
	public Course showXmlInfo(@PathVariable("code") int cid) {
		Course c=service.searchCourseById(cid);
		return c;
	}

	@GetMapping(value="json/{code}",produces="application/json")
	public Course showJSONInfo(@PathVariable("code") int cid) {
		Course c=service.searchCourseById(cid);
		return c;
	}

}
