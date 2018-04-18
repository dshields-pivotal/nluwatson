package com.dellaria.demos.nluwatson;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NLUEndpoint {

	@Autowired
	NLURepository nluRepository;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public @ResponseBody Iterable<NLU> getAll() {
		return nluRepository.findAll();
	}		
	

}
