package kr.happyjob.study.service.login;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.repository.login.LoginDAO;

@Service
public class LoginServiceImpl implements LoginService{
	
	private LoginDAO loginDAO;
	
	@Autowired
	public LoginServiceImpl(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
		
	}

	@Override
	public int registerGo(Map<String, Object> paramMap) throws Exception {
		
		return loginDAO.registerGo(paramMap);
	}
	
	
}
