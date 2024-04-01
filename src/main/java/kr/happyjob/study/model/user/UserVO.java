package kr.happyjob.study.model.user;

public class UserVO {

	// 로그인 & 회원가입 컬럼
	private String loginid;
	private String name;
	private String loginpw;
	private String email;
	
	
	
	public UserVO(String loginid, String name, String loginpw, String email) {
		super();
		this.loginid = loginid;
		this.name = name;
		this.loginpw = loginpw;
		this.email = email;
	}
	
	
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoginpw() {
		return loginpw;
	}
	public void setLoginpw(String loginpw) {
		this.loginpw = loginpw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	@Override
	public String toString() {
		return "LoginVO [loginid=" + loginid + ", name=" + name + ", loginpw=" + loginpw + ", email=" + email + "]";
	}
	
}
