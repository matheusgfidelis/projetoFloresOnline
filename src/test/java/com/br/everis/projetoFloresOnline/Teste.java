package com.br.everis.projetoFloresOnline;

//import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.br.everis.page.PageHome;
import com.br.everis.setup.ChromeFactory;

public class Teste {
	public PageHome home;
	public final String URL = "https://www.floresonline.com.br/";
	
	@Before
	public void setUp() {
		ChromeFactory factory = new ChromeFactory();		
		home = new PageHome(factory.config(URL));
	}
	
	@Test
	public void testCadastro() {
		home.navegar();
		home.preencher();
		home.cadastrar();
	}

}
