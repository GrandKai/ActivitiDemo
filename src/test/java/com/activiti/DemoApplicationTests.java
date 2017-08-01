package com.activiti;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private WebApplicationContext applicationContext;

	@Test
	public void contextLoads() {

		for (String s : applicationContext.getBeanDefinitionNames()) {
			System.out.println(s);
		}
	}

}
