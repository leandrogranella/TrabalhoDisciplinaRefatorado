package com.example.tests;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import classes.MenuNavegacaoSuperior;
import classes.OnBoyContexto;

public class TestHome {
	public static OnBoyContexto onboyContexto;

	@Before
	public void setUp() throws Exception {
		onboyContexto = new OnBoyContexto(new FirefoxDriver());
		MenuNavegacaoSuperior.iniciar(onboyContexto);
	}

	@Test
	public void testHome() throws Exception {
		MenuNavegacaoSuperior.clicarHome();
		MenuNavegacaoSuperior.estaNaHome();
	}

	@After
	public void tearDown() throws Exception {
		onboyContexto.sair();
    
	}
}
