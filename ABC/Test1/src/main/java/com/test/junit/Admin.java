package com.test.junit;

public class Admin {
	private String adminId;
	private String adminPw;
	private String grade = "";
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String adminLogin(String adminId, String adminPw) {
		if(adminId == "admin" && adminPw == "1234"){
			this.grade = "admin";
		} else if(adminId == "man" && adminPw == "5678") {
			this.grade = "manager";
		} else {
			this.grade = "not manager or not admin";
		}
		return this.grade;
	}
	
	public void memberList() {
		System.out.println("관리자가 관리가능한 전체회원목록을 출력합니다.");
	}
	public void boardManage() {
		System.out.println("게시판 관리자 목록을 출력합니다.");
	}
}
