package learningRetry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_logic implements IRetryAnalyzer
{
	int initialcount=0;
	int retrycount=2;
	@Override
	public boolean retry(ITestResult result)
	{
	if(initialcount<retrycount)
	{
		initialcount++;
	    return true; //retry the TC
	}
		return false; //no need to retry
	}
	

}
