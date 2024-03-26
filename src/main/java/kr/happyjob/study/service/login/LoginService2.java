package kr.happyjob.study.service.login;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.happyjob.study.model.login.LoginVO;
import kr.happyjob.study.repository.login.LoginDAO;

@Service
public class LoginService2 {

	@Autowired
	private LoginDAO loginDAO;

	// 회원가입
	public int registerGo(Map<String, Object> paramMap) throws Exception {
		System.out.println(paramMap);
		System.out.println(paramMap);
		return loginDAO.registerGo(paramMap);
	}

	// 로그인
	public LoginVO loginGo(Map<String, Object> paramMap) {
		return loginDAO.loginGo(paramMap);
	}

}
