package com.test.junit;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class CalcuratorTest3 {

	@Autowired
	private ApplicationContext ctx;
	
	@Before
	public void beforeTest() {
		System.out.println("----- 테스트 전 ------");
	}
			
	@org.junit.Test
	public void testSum(){                                                        
		Calcurator c = new Calcurator();
        double result = c.sum(10, 50);
        System.out.println("결과 : "+result);
	}
	
}
