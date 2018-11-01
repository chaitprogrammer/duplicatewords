package com.codingchallenge.demo.service;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DuplicateWordsService {
	
    private Logger logger = LoggerFactory.getLogger(this.getClass());

	public String[] returnDuplicateWords(String sentense) {
		logger.info("In Service - {}", sentense);
		return  Arrays.asList(sentense.split("\\P{Alpha}+")).stream()
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
						.entrySet().stream()
						.filter(x -> x.getValue() > 1)
						.map(e -> e.getKey())
						.toArray(String[]::new);
	}
	
	

}
