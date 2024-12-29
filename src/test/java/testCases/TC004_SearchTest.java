package testCases;

import testBase.BaseClass;

import java.lang.System.Logger;

import org.testng.annotations.Test;

public class TC004_SearchTest extends BaseClass {

	@Test(groups = { "Sanity", "DataDriven" })
	public void test() {
		logger.info("Hello void test");

		System.out.println("Hello TC004_SearchTest");
	}

}
