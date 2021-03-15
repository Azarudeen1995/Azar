package azar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mohamed Azarudeen\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.amazon.in/");

	}

}
