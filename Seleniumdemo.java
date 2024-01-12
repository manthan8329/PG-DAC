package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\CDAC\\Downloads\\geckodriver-v0.34.0-win32\\geckodriver.exe");
        
				
        //co.SetBrowserVersion("120");
        //ChromeOptions co = new ChromeOptions();
        WebDriver obj = new ChromeDriver();
        //d1.manage().window().maximize();
         obj.get("https://www.google.com");
	}

}
