package net.caf.tests.runners;

import com.thoughtworks.selenium.HttpCommandProcessor;
import com.thoughtworks.selenium.SeleneseTestNgHelper;
import org.junit.Test;
import org.testng.annotations.Parameters;

import java.util.Properties;

/**
 * Created by developer on 10/9/14.
 */
public class TestNgSeleniumRunner extends SeleneseTestNgHelper{

	@Test //(groups = {"funcTest"})
	@Parameters ({"environment"})
	public void testSetup(String environment) throws Exception {

		//        String page= config.getProperty("page.login");
		//        System.out.println("Page:"+page);
		//        selenium.open(page);
		System.out.println("Setting browser window prefrences. ");
		selenium.windowMaximize();
		selenium.windowFocus();
		selenium.setSpeed("1000");

	}


	HttpCommandProcessor proc;
//	SeleniumServer server;
}
