package sel1;

import org.testng.annotations.Test;

public class TimeoutExample {

	@Test
	public void demo1() {
		System.out.println("This is a test case");
	}
	
	@Test(timeOut=1000) //time in milliseconds
	public void demo2() throws InterruptedException {
		System.out.println("This is a timeoutcase");
		Thread.sleep(3000);
	}
}
