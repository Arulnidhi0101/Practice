package org.info.prac.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class pract {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		System.out.println("executed successfully");
		System.out.println("Arul");
		driver.close();
	}
}
