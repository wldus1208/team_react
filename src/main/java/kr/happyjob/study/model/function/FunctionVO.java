package kr.happyjob.study.model.function;

public class FunctionVO {
	
	// 내맛집 컬럼
	private int b_no;
	private String loginid;
	private String likeyn;
	private String makedt;
	
	// 체험단 신청 컬럼 추가
	private String email;
	private String reason;
	
	
	
	public FunctionVO(int b_no, String loginid, String likeyn, String makedt, String email, String reason) {
		super();
		this.b_no = b_no;
		this.loginid = loginid;
		this.likeyn = likeyn;
		this.makedt = makedt;
		this.email = email;
		this.reason = reason;
	}
	

	
	public int getB_no() {
		return b_no;
	}


	public void setB_no(int b_no) {
		this.b_no = b_no;
	}


	public String getLoginid() {
		return loginid;
	}


	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}


	public String getLikeyn() {
		return likeyn;
	}


	public void setLikeyn(String likeyn) {
		this.likeyn = likeyn;
	}


	public String getMakedt() {
		return makedt;
	}


	public void setMakedt(String makedt) {
		this.makedt = makedt;
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



	@Override
	public String toString() {
		return "FunctionVO [b_no=" + b_no + ", loginid=" + loginid + ", likeyn=" + likeyn + ", makedt=" + makedt
				+ ", email=" + email + ", reason=" + reason + "]";
	}
	
	
}
