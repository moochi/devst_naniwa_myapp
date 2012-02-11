package models;

import static org.junit.Assert.*;

import org.junit.Test;

public class WelcomeMessageTest {

	@Test
	public void test() {
		String msg = "こんにちは世界！";
		String msg2 = (new WelcomeMessage()).getMessage();
		assertEquals("エラーだよ", msg, msg2);
		//fail("Not yet implemented");
	}

}
