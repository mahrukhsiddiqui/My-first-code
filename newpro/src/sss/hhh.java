package sss;

import org.openqa.selenium.chrome.ChromeOptions;

public class hhh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vbstudent\\Desktop\\Libraries\\\\chromedriver.exe");
		                                                                                                                                               
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--incognito");
		options.addArguments("--ignore.certificate.error");
		options.addArguments("--disable-popup-blocking");
		
	}}
				//driver.close();

				//driver.quit();
	