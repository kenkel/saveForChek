package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import chekHelloWorld.ChekHelloWorldByGit;

public class chekHelloWorldTest {
	private final ChekHelloWorldByGit chek = new ChekHelloWorldByGit();

	@Test
	public void testPrintCheckMessage() {
		boolean chekFlag = false;
		String messageActual = chek.getCheckMessage();
		String expectedMessage = "HelloWorld!";
		if (messageActual.equals(expectedMessage)){
			chekFlag = true;
		}
		assertTrue(chekFlag);
		
	}

}
