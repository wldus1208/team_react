package kr.happyjob.study.service.login;

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
	
	
}
