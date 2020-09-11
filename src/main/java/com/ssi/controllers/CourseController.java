package com.ssi.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ssi.entities.Course;
import com.ssi.services.CourseService;

@RestController
@RequestMapping("course")
public class CourseController {
	
	@Autowired
	private CourseService service;
	
	@GetMapping(value="{code}",produces="text/html")
	public String showTextInfo(@PathVariable("code") int cid) {
		Course c=service.searchCourseById(cid);
		return c.toString();
	}
	@GetMapping(value="xml", produces="application/xml")
	public Course showXmlInfo() {
		Course c=service.searchCourseById(111);
		return c;
	}

	@GetMapping(value="json",produces="application/json")
	public Course showJSONInfo() {
		Course c=service.searchCourseById(111);
		return c;
	}

}
