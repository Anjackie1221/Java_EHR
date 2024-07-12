package fall22assignment1;
/**
* @author - Junjie Xu
* @version 1.0
* @see java.lang.Object
* @see MyHealthData.java
* @since 11.0.15
*/
//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyHealthDataTest2 {
	
	private static final double EPSILON = 1E-6;
	
	@Test
	public void test() {
		MyHealthData healthData = new MyHealthData();
		healthData.setHeight(69);
		healthData.setWeight(154);
		double expected = ((double)(154 * 703) / (double)(69 * 69));
		Assert.assertEquals(expected, healthData.getBMI(), EPSILON);
	}

//	@Test
//	public void test2() {
//		MyHealthData healthData = new MyHealthData();
//		healthData.setHeight(69);
//		healthData.setWeight(154);
//		double expected = ((double)(154 * 703) / (double)(69 * 69));
//		Assert.assertEquals(expected, healthData.getBMI(), EPSILON);
//		assertTrue(true);
//	}
}
