package script;


import org.testng.annotations.Test;

import generic.BaseTest;
import page.LoginPage;

public class ValidLogin extends BaseTest{

	@Test
	public void testA(){	
		LoginPage l=new LoginPage(driver);
		l.setUserName("admin");
		l.setPassword("admin");
		l.clickConnect();
	}
}
