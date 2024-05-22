package FRameWork;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// All soft assert  methods are non static - we need to create an object for SoftAssert class//
//AssertAll method is mandatory//
//if any exception occurs it will allow the execution and print the error after the execution.//
//it can be used for non mandatory fields//

public class TestNgSoftAssertion {
	public class TestNgAssertion {
		@Test
		public void method1() {
			SoftAssert soft = new SoftAssert();
			System.out.println("Step1");
			System.out.println("Step2");
			soft.assertEquals(false, true);
			                   //actual,expected//
			System.out.println("Step3");
			System.out.println("Step4");
			soft.assertAll();
		}
		@Test
		public void method2() {
			SoftAssert soft = new SoftAssert();
			String expected = "Qspiders";
			String actual = "Qspiders";
			soft.assertEquals(actual, expected);
			soft.assertAll();
		}


}
}
