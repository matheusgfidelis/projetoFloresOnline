package com.br.everis.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeFactory {
	public WebDriver driver;
	
	public WebDriver config(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		
		this.driver = new ChromeDriver(options);		
		this.driver.get(url);
		
		return this.driver;
	}

}
