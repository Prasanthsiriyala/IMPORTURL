package FRameWork;

import org.testng.Assert;
import org.testng.annotations.Test;

//This is TestNg Hard assertion//
//All Hard assert  methods are static - we no need to create an object for class//
//AssertAll method is not mandatory//
//if any exception occurs it will stop the execution and print the error at that instant.//
//it can be used for mandatory fields//


public class TestNgAssertion {
	@Test(priority = 1)
	public void method1() {
		System.out.println("Step1");
		System.out.println("Step2");
		Assert.assertEquals(false, true);
		                   //actual,expected//
		System.out.println("Step3");
		System.out.println("Step4");
	}
	@Test(priority = 2)
	public void method2() {
		String expected = "Qspiders";
		String actual = "Qspiders";
		Assert.assertEquals(actual, expected);
	}

}
