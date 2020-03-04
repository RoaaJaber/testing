package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import Main.MainCode;

public class CodeTest {

	@Test
	public void test() {
		MainCode m=new MainCode ();
		int x=m.sqr(3);
		assertEquals(9,x);
	}

}
