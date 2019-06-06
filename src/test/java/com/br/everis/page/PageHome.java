package com.br.everis.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHome {
	public WebDriver driver;
	
	public PageHome(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navegar() {
		this.driver.findElement(By.xpath("//div[@class=\"homemain-logged-or-notlogged2\"]/a")).click();
		this.driver.findElement(By.linkText("Cadastre-se")).click();
	}
	
	public void preencher() {
		this.driver.findElement(By.id("email_lp")).sendKeys("lucasgabrielsantos12345@outlook.com");
		this.driver.findElement(By.id("nome_lp")).sendKeys("Lucas Gabriel");
		this.driver.findElement(By.id("telefone_lp")).sendKeys("11 999999999");
		this.driver.findElement(By.id("senha_lp")).sendKeys("1234567890*");
	}
	
	public void cadastrar() {
		this.driver.findElement(By.id("btnMain")).click();
	}
}
