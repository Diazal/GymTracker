package com.diazal.gymtracker.exercise.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.diazal.gymtracker.excercise.dto.ExerciseDto;

@Service
public class ExerciseServiceImpl implements ExerciseService{
	
	
	
	public Set<ExerciseDto> getExcercises(){
		
		ExerciseDto ex = new ExerciseDto();
		ex.setId(1);
		ex.setDescription("something");
		
		Set<ExerciseDto> s = new HashSet<>();
		s.add(ex);
		
		return s;
		
	}
	
}
