package com.test.junit;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
@WebAppConfiguration
public class MockMvcWebTests {

	@Autowired
	private WebApplicationContext webContext;
	
	private MockMvc mockMvc;
	
	@Before
	public void setupMockMvc() {
		System.out.println("MOCK테스트가 준비중입니다.");
		mockMvc = MockMvcBuilders
				.webAppContextSetup(webContext)
				.build();
	}
	
	@Test
	public void test() {
		System.out.println("MOCK테스트가 생성되었습니다.");
	}

}
