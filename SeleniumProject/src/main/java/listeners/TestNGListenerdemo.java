package listeners;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerdemo {

	@Test
	public void test1()
	{
		System.out.println("This is test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("This is test2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("This is test3");
	}
}
