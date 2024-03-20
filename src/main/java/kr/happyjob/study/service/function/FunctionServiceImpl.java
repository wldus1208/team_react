package kr.happyjob.study.service.function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.repository.function.FunctionDAO;

@Service
public class FunctionServiceImpl implements FunctionService {
	
	private FunctionDAO functionDAO;
	
	@Autowired
	public FunctionServiceImpl(FunctionDAO functionDAO ) {
		this.functionDAO = functionDAO;
	}
	
	

}
