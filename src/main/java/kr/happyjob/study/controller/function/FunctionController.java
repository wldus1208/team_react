package kr.happyjob.study.controller.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.happyjob.study.service.function.FunctionService;

@Controller
public class FunctionController {

	private FunctionService functionService;
	
	@Autowired
	public FunctionController(FunctionService functionService) {
		this.functionService = functionService;
		
	}
	
	
}
