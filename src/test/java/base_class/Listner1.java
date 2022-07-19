package base_class;




import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner1 extends BaseClass   implements ITestListener
{

	//1. IAnnotationTransformer 
	//2. IAnnotationTransformer2
	//3. IHookable
	//4. IInvokedMethodListner
	//5. IMethodInterceptor
	//6. IReporter
	//7. I SuiteListener
	//8. ITestListener
	
	
	public void onStart(ITestContext context) {
	
		System.out.println("Test case is started");
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failling");
		BaseClass.Screenshot(002);
		
	}
	
	public void onFinish(ITestContext context) {
	
		System.out.println("test is succesfully finish");
	}
	
}
