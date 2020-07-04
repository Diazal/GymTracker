package com.diazal.gymtracker.exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diazal.gymtracker.exercise.service.ExerciseService;

@Controller
@RequestMapping("exercise")
public class ExerciseController {
	
	@Autowired
	ExerciseService exerciseService;
	
	@GetMapping()
	public String getExercises(Model model) {
		
		model.addAttribute("exercises", exerciseService.getExcercises());
		
		System.out.println("working");
		
		return "exercise/exercises";
	}
}
