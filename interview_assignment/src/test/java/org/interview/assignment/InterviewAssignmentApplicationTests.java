package org.interview.assignment;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest
public class InterviewAssignmentApplicationTests {

	@Autowired private MockMvc mvc;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testStageOne() throws Exception {
		
		String uri = "/assignment/stageOne";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON)).andReturn();
		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);
	}
	
	@Test
	public void testStageTwo() throws Exception {
		String uri = "/assignment/stageTwo";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON)).andReturn();
		String content = mvcResult.getResponse().getContentAsString();
		System.out.println(content);
	}

}
