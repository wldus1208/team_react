package kr.happyjob.study.model.blog;

public class BlogReqVO {

	private Integer b_no;
	private String loginid;
	private String name;
	private String email;
	private String reason;
	
	
	public Integer getB_no() {
		return b_no;
	}
	public void setB_no(Integer b_no) {
		this.b_no = b_no;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	
		
}
