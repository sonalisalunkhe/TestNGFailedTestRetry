package MyTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {
	
	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
	public void Login() {
		AssertJUnit.assertEquals(false, true);
		
	}
	@Test
	public void Logout() {
		AssertJUnit.assertEquals(false, true);

	}
	
	
}
