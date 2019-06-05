package com.br.everis.projetoFloresOnline;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Teste {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver" ,"\\C:\\Users\\mgoisfid\\drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		
		driver.get("http://www.floresonline.com.br");
		
		driver.findElement(By.xpath("//div[@class=\"homemain-logged-or-notlogged2\"]/a")).click();
		
		driver.findElement(By.linkText("Cadastre-se")).click();
		
		
	}
	
	@Test
	public void testCadastro() {
		
		driver.findElement(By.id("email_lp")).sendKeys("matheusfidelis1478@gmail.com");
		
		driver.findElement(By.id("nome_lp")).sendKeys("Matheus Fidelis");
		
		driver.findElement(By.id("telefone_lp")).sendKeys("11 999999999");
		
		driver.findElement(By.id("senha_lp")).sendKeys("123456789");
		
		driver.findElement(By.id("btnMain")).click();
		
		String text = driver.findElement(By.xpath("//div[@class=\"customer-logado\"]/a")).getText();
		assertEquals(text, "Matheus");
		
	}

}
