package com.codingchallenge.demo;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.websocket.server.PathParam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
//	@RequestMapping("/getDuplicatedWords/{sentence}")
//	@ResponseBody
//	public String[] getDuplicatedWords(@PathParam("sentence") String sentence) {
//      return (String[]) Arrays.asList(sentence.split("\\P{Alpha}+"))
//      .stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
//      .stream().filter(x -> x.getValue() > 1)
//      .map(e -> e.getKey())
//      .collect(Collectors.toList()).toArray();
//	}
//	
//	@GetMapping(path="/{corpusName}")
//    public String transferCorpus(@PathParam("corpusName") String corpusName) {
//		return "Hellp " + corpusName;
//	}
	
	
}
