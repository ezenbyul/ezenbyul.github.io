package com.test.junit;

import java.util.Date;

public class Member {
	private String id;
	private String pw;
	private String email;
	private String name;
	private boolean male;
	private String tel;
	private Date birth;
	private Date regdate;
	private String uid = "ezen";
	private String upw = "1234";
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getMale() {
		return male;
	}
	public void setMale(Boolean male) {
		this.male = male;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public boolean compare(String id, String pw) {
		if(this.uid==id && this.upw == pw){
			return true;	
		} else {
			return false;
		}
	}
	public void join(String id, String pw, String email) {
		if(id == "" || pw == "" || email == "") {
			System.out.println("필수 항목이 비어있습니다.");
		} else {
			System.out.println("회원가입이 성공적으로 이루어 졌습니다.");
		}
	}
}






