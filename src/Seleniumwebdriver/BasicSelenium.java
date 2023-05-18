package Seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ZIVI MULTI VENTURE\\eclipse-workspace\\webdriver\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	}
}
