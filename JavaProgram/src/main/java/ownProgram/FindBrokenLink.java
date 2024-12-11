package ownProgram;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;  

public class FindBrokenLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/Users/codilar/git/javaCode/javaCode/src/test/resources/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//navigate to website
		driver.get("https://www.reebok.sa/en/");
		
		//find all available links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//Iterating each links & checking the response code 
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			verifyLink(url);
		}
		
		driver.quit();
		
	}
	public static void verifyLink(String url) {
		try {
			URL link = new URL (url);
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
			httpURLConnection.setConnectTimeout(3000); // set connection timeout to 3 sec
			httpURLConnection.connect();
			if (httpURLConnection.getResponseCode() == 200) {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage());
				} else {
				System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
				}
		} catch (Exception e) {
			System.out.println(url + " - " + "is a broken link");
		}
	}

}
