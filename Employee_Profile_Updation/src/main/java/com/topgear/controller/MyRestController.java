package com.topgear.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.topgear.modal.AddJobForm;
@RestController
public class MyRestController {
	
	@RequestMapping("/addJob")
	public String addJob(@RequestParam(value="newJob") AddJobForm newJob){
		System.out.println(newJob.getJobName());
		return null;
	}

}
