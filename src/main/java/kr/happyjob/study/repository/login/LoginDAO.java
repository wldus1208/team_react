package kr.happyjob.study.repository.login;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import kr.happyjob.study.model.login.LoginVO;

@Mapper
public interface LoginDAO {

	// 회원가입
	public int registerGo(Map<String, Object> paramMap);

	// 로그인 xxxaaaa
	public LoginVO loginGo(Map<String, Object> paramMap);

}
