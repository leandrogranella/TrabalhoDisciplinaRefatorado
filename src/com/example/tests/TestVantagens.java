package com.example.tests;
import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import classes.MenuNavegacaoSuperior;
import classes.OnBoyContexto;

public class TestVantagens {
	public static OnBoyContexto onboyContexto;
	
	@Before
	public void setUp() throws Exception {
		//driver = new FirefoxDriver();
		//baseUrl = "http://onboy.web2157.uni5.net";
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		onboyContexto = new OnBoyContexto(new FirefoxDriver());
		MenuNavegacaoSuperior.iniciar(onboyContexto);
	}

	@Test
	public void testVantagens() throws Exception {
		//driver.get(baseUrl + "/vantagens");
		//driver.findElement(By.linkText("Vantagens")).click();
		MenuNavegacaoSuperior.clicarVantagens();
		MenuNavegacaoSuperior.estaNaVantagens();
	}

	@After
	public void tearDown() throws Exception {
		onboyContexto.sair();
	}
}
