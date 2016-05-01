package com.example.tests;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import classes.OnBoyContexto;
import classes.Login;

public class TestLoginComSucesso {
	public static OnBoyContexto onboyContexto;

	@Before
	public void setUp() throws Exception {
		onboyContexto = new OnBoyContexto(new FirefoxDriver());
		Login.iniciar(onboyContexto);
	}

	@Test
	public void testLoginComSucesso() throws Exception {
	  	Login.abreFormulario();
	  	Login.preencheCamposDeNomeESenha();
	  	Login.enviaFormulario();
	  	Login.verificaMensagemQuandoLogouComSucesso();
	}

	@After
	public void tearDown() throws Exception {
		onboyContexto.sair();
	}
}
