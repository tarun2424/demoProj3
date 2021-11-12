package sel1;

import org.testng.annotations.Test;

public class ExpException {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void divideByZero() {
		int i=1/0;
	}

/*	@Test
	public void divideByZero2() {
		int i=1/0;
	}*/
}
