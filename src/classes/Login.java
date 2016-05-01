package classes;
import static org.junit.Assert.*;
import org.openqa.selenium.By;

public class Login {
private static OnBoyContexto contexto = null;
	
	public static void iniciar(OnBoyContexto paginaContexto) {
		contexto = paginaContexto;
		contexto.driver.get(contexto.urlBase);
	}
	
	public static void abreFormulario() {
		contexto.driver.findElement(By.xpath("//div[@id='menu']/ul[2]/li[2]/a/span/strong")).click();
	}
	
	public static void preencheCamposDeNomeESenha() {
		contexto.driver.findElement(By.id("email")).clear();
		contexto.driver.findElement(By.id("email")).sendKeys("leandrogranella@gmail.com");
		contexto.driver.findElement(By.id("senha")).clear();
	    contexto.driver.findElement(By.id("senha")).sendKeys("98576442");
	}
	
	public static void enviaFormulario() {
		contexto.driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
	}
	
	public static void verificaMensagemQuandoLogouComSucesso() {
		assertEquals("Bem vindo(a) LEANDRO GRANELLA MORAES",contexto.driver.findElement(By.cssSelector("body > div > div.navbar-wrapper.limitador_largura > div > div > div.col-xs-12.col-md-8 > span:nth-child(1)")).getText());
	}
	
	public static void preencheCamposDeNomeESenhaComSenhaQueNaoEstaCadastrada() {
		contexto.driver.findElement(By.id("email")).clear();
		contexto.driver.findElement(By.id("email")).sendKeys("leandrogranella@gmail.com");
		contexto.driver.findElement(By.id("senha")).clear();
		contexto.driver.findElement(By.id("senha")).sendKeys("98576441");
	}
	
	public static void verificaMensagemQuandoLogouSemSucesso() {
		String mensagemCompleta = contexto.driver.findElement(By.cssSelector("body > div > div.alert.alert-danger.alert-dismissible")).getText();
	    assertTrue(mensagemCompleta.contains("OPS... E-mail ou senha incorretos!"));
	}
}
