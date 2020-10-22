package com.test.junit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class MemberTest2 {
	
	@Test
	public void test() {
		Member m1 = new Member();
		m1.join("ezen","1234", "");
		
		Member m2 = new Member();
		m2.join("ezen","1234", "ksb450424@naver.com");
	}
	
}
