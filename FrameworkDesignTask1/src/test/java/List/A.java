package List;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class A implements ITestListener
{
	Logger log=Logger.getLogger(A.class.getName());

	public void onTestStart(ITestResult result) 
	{
		log.info("This our OnTestStart");
	}

	public void onTestSuccess(ITestResult result)
	{
		log.info(" This our  OnTestSuccess");
		
	}

	public void onTestFailure(ITestResult result) 
	{
		log.info("This our  OnTestFailure");
	}

	public void onTestSkipped(ITestResult result)
	{
		log.info("This our  OnTestSkipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		log.info("This our  onTestFailedButWithinSuccessPercentage");
		
	}

	public void onStart(ITestContext context)
	{
		
		log.info(" This our  onStart");
	}

	public void onFinish(ITestContext context) 
	{
		
		log.info("This our onFinish");
	}

}
