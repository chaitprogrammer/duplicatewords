package com.example.demo.service;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.codingchallenge.demo.service.DuplicateWordsService;

/**
 * Adding javadocs 
 * 
 * @author chaitanya
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=DuplicateWordsService.class)
public class DuplicateWordsServiceTests {

	@Test
	public void returnDuplicateWordsTest1() {
		String input = "How much wood could a woodchuck chuck if a woodchuck could chuck wood?";
		
		String[] result = new String[] {"a","woodchuck","could","wood","chuck"};
		
		assertArrayEquals(result, this.duplicateWordsService.returnDuplicateWords(input));
	}
	
	@Test
	public void returnDuplicateWordsTest2() {
		String input = "How much wood could a woodchuck-chuck if a woodchuck could chuck wood?";
		
		String[] result = new String[] {"a","woodchuck","could","wood","chuck"};
		
		assertArrayEquals(result, this.duplicateWordsService.returnDuplicateWords(input));
	}
	
	@Test
	public void returnDuplicateWordsTest3() {
		String input = "How much wood could a woodchuck-chuck if a woodchuck0could chuck wood?";
		
		String[] result = new String[] {"a","woodchuck","could","wood","chuck"};
		
		assertArrayEquals(result, this.duplicateWordsService.returnDuplicateWords(input));
	}
	
	@Autowired
	private DuplicateWordsService duplicateWordsService;

}
