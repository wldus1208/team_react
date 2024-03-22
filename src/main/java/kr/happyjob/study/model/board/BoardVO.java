package kr.happyjob.study.model.board;

public class BoardVO {
	
	// 맛집 게시판 컬럼
	private int b_no;
	private String b_name;
	private String b_loc;
	private String b_menu;
	private String b_price;
	private String b_time;
	
	
	
	public BoardVO(int b_no, String b_name, String b_loc, String b_menu, String b_price, String b_time) {
		super();
		this.b_no = b_no;
		this.b_name = b_name;
		this.b_loc = b_loc;
		this.b_menu = b_menu;
		this.b_price = b_price;
		this.b_time = b_time;
	}


	public int getB_no() {
		return b_no;
	}


	public void setB_no(int b_no) {
		this.b_no = b_no;
	}


	public String getB_name() {
		return b_name;
	}


	public void setB_name(String b_name) {
		this.b_name = b_name;
	}


	public String getB_loc() {
		return b_loc;
	}


	public void setB_loc(String b_loc) {
		this.b_loc = b_loc;
	}


	public String getB_menu() {
		return b_menu;
	}


	public void setB_menu(String b_menu) {
		this.b_menu = b_menu;
	}


	public String getB_price() {
		return b_price;
	}


	public void setB_price(String b_price) {
		this.b_price = b_price;
	}


	public String getB_time() {
		return b_time;
	}


	public void setB_time(String b_time) {
		this.b_time = b_time;
	}

	

	@Override
	public String toString() {
		return "BoardVO [b_no=" + b_no + ", b_name=" + b_name + ", b_loc=" + b_loc + ", b_menu=" + b_menu + ", b_price="
				+ b_price + ", b_time=" + b_time + "]";
	}

}
