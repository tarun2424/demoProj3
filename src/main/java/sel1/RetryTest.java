package sel1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {
	
/*	@Test(retryAnalyzer=sel1.RetryAnalyzer2.class)
	public void test1() {
		Assert.assertEquals(false, true);
	}*/
	
	@Test
	public void test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(false, true);
	}


}
