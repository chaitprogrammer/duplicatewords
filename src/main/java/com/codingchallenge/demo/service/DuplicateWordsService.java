package com.codingchallenge.demo.service;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class DuplicateWordsService {

	public String[] returnDuplicateWords(String sentense) {
		return  Arrays.asList(sentense.split("\\P{Alpha}+")).stream()
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
						.entrySet().stream()
						.filter(x -> x.getValue() > 1)
						.map(e -> e.getKey())
						.toArray(String[]::new);
	}
	
	

}
