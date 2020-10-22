package com.test.junit;


//�̺κ� �߰��ϼž� �մϴ�.
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

public class StandAloneTest {

	private MockMvc mockMvc;

	// �׽�Ʈ �޼ҵ� ������ �¾� �޼ҵ��Դϴ�.
	@Before
	public void setup(){
		// �̰����� HomeController�� MockMvc ��ü�� ����ϴ�.
		this.mockMvc = MockMvcBuilders.standaloneSetup(new HomeController()).build();
	}

	@Test
	public void test() throws Exception{
		// HomeController�� "/" �������� �����մϴ�.
		this.mockMvc.perform(get("/"))
		// ó�� ������ ����մϴ�.
		.andDo(print())
		// ���°��� OK�� ���;� �մϴ�.
		.andExpect(status().isOk())
		// "serverTime"�̶�� attribute�� �����ؾ� �մϴ�.
		.andExpect(model().attributeExists("serverTime"));
	}
}