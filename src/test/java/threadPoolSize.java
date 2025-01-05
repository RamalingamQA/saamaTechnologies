import org.testng.annotations.Test;

public class threadPoolSize {
	@SuppressWarnings("deprecation")
	@Test(threadPoolSize=3,invocationCount=3)
	public void method() {
		System.out.println(Thread.currentThread().getId());		
	}
}
