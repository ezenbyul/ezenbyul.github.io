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
			System.out.println("�α��� �Ǿ����ϴ�.");
		} else {
			System.out.println("���̵� �Ǵ� �н����尡 ��Ȯ���� �ʰų� ȸ���� �ƴմϴ�.");
		}
		assertEquals(true, res);
	}
}
