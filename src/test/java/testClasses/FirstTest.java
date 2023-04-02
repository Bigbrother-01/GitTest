package testClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class FirstTest {

	public static WebDriver driver;

	@Test
	public void launch1() {

		driver = new EdgeDriver();
		driver.get("https://github.com/");
		System.out.println("Lauch1 success");
	}
	
	@Test
	public void launch2() {
	
		driver = new EdgeDriver();
		driver.get("https://www.seleniumeasy.com");
		System.out.println("Lauch2 success");
	}
	
	@Test
	public void launch3() {
	
		driver = new EdgeDriver();
		driver.get("https://www.tutorialspoint.com");
		System.out.println("Lauch2 success");
	}

}
