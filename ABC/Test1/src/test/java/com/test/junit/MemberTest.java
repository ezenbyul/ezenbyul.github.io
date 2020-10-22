package com.test.junit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class MemberTest {
	@Test
	public void test() {
		Member m = new Member();
		boolean res = m.compare("ezen","1234");
		if(res) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("아이디 또는 패스워드가 정확하지 않거나 회원이 아닙니다.");
		}
		assertEquals(true, res);
	}
}
