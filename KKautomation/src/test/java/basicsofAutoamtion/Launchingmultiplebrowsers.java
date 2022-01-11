package basicsofAutoamtion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launchingmultiplebrowsers {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		//chrome
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");

	}

}
 