package com.example.tests;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import classes.OnBoyContexto;
import classes.Login;

public class TestLoginSemSucesso {
	public static OnBoyContexto onboyContexto;

	@Before
	public void setUp() throws Exception {
		onboyContexto = new OnBoyContexto(new FirefoxDriver());
		Login.iniciar(onboyContexto);
	}

	@Test
	public void testLoginSemSucesso() throws Exception {
	  	Login.abreFormulario();
	  	Login.preencheCamposDeNomeESenhaComSenhaQueNaoEstaCadastrada();
	  	Login.enviaFormulario();
	  	Login.verificaMensagemQuandoLogouSemSucesso();
	}

	@After
	public void tearDown() throws Exception {
		onboyContexto.sair();
	}
}
