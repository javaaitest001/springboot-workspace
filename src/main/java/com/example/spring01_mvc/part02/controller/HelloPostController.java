package com.example.spring01_mvc.part02.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring01_mvc.part02.dto.MemDTO;

import lombok.extern.slf4j.Slf4j;


// http://localhost:8090/hellomodel
@Slf4j
@RestController // @Controller + @ResponseBody
public class HelloPostController {
	
	@PostMapping(value="/hellomodel")
	public MemDTO postExecute(@RequestBody MemDTO dto) {
		log.info("dto {}", dto);
		return dto;
	}
}
