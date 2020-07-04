package com.diazal.gymtracker.exercise.service;

import java.util.Set;

import com.diazal.gymtracker.excercise.dto.ExerciseDto;

public interface ExerciseService {
	public Set<ExerciseDto> getExcercises();
}
