package com.codingchallenge.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codingchallenge.demo.service.DuplicateWordsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/duplicates")
@Api(tags = { "This service accepts a string as the request parameters and process it." })
public class DuplicateWordsController {

	@Autowired
	private DuplicateWordsService DuplicateWordsService;

	@GetMapping("/{sentense}")
	@ApiOperation(value = "Finds duplicate words", notes = "The service will find all words that are "
			+ "duplicated in the sentence and return an array of those words")
	public @ResponseBody String[] getBook(@PathVariable String sentense) {
		return this.DuplicateWordsService.returnDuplicateWords(sentense);
	}

}
