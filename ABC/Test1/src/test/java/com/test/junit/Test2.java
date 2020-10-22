package com.test.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("----- 테스트 전 -----");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("----- 테스트 후 -----");
	}

	@org.junit.Test
	public void test() {
		fail("Not yet implemented");
		System.out.println("----- 여기는 실제 테스트 내용 -----");
	}
}
