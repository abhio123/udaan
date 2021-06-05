package com.abhio.springApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AbhioAppApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void testObject() {
		Welcome abc = new Welcome();
		//questionReq = new QuestionRequest("question one",);
		//abc.createQuestion(null);
		//ReturnObject test = abc.hello();
		//assert(test.getStr1().equals("abhio"));
	}

}
