package com.test.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdminTest {

	@Test
	public void test() {
		Admin a1 = new Admin();
		Admin a2 = new Admin();
		Admin a3 = new Admin();
		Admin a4 = new Admin();
		
		String data1 = a1.adminLogin("admin", "1234");
		String data2 = a2.adminLogin("admin", "3459");
		String data3 = a3.adminLogin("man", "5678");
		String data4 = a4.adminLogin("ksb450424", "5678");
		
		if(data1 == "admin") {
			a1.memberList();
			a1.boardManage();
		} else if(data1 == "man") {
			a1.boardManage();
		} else {
			System.out.println("사이트의 관리자가 아닙니다.");
		}
		
		if(data2 == "man") {
			a2.memberList();
			a2.boardManage();
		} else if(data2 == "man") {
			a2.boardManage();
		} else {
			System.out.println("사이트의 관리자가 아닙니다.");
		}
	}
}
