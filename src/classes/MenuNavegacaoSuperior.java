package classes;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.thoughtworks.selenium.webdriven.JavascriptLibrary;

public class MenuNavegacaoSuperior {
	private static OnBoyContexto contexto = null;
	
	public static void iniciar(OnBoyContexto paginaContexto) {
		contexto = paginaContexto;
		contexto.driver.get(contexto.urlBase);
	}
	
	public static void clicarHome() {
		WebElement elementoHtml = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Home")));
		elementoHtml.click();
	}
	
	public static void estaNaHome() {
		//ver qual url que é a da Home
		assertEquals(contexto.urlBase + "/home", MenuNavegacaoSuperior.mapearUrlQueSeEncontra());
	}
	
	public static void clicarComoFunciona() {
		WebElement elementoHtml = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Como Funciona")));
		elementoHtml.click();
	}
	
	public static void estaNaComoFunciona() {
		//ver qual url que é a da ComoFunciona
		assertEquals(contexto.urlBase + "/informacoes", MenuNavegacaoSuperior.mapearUrlQueSeEncontra());
	}
	
	public static void clicarSejaNossoParceiro() {
		WebElement elementoHtml = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Seja nosso parceiro")));
		elementoHtml.click();
	}
	
	public static void estaNaSejaNossoParceiro() {
		//ver qual url que é a da SejaNossoParceiro
		assertEquals(contexto.urlBase + "/parceiros", MenuNavegacaoSuperior.mapearUrlQueSeEncontra());
	}
	
	public static void clicarVantagens() {
		WebElement elementoHtml = contexto.wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Vantagens")));
		elementoHtml.click();
	}
	
	public static void estaNaVantagens() {
		//ver qual url que é a da Vantagens
		assertEquals(contexto.urlBase + "/vantagens", MenuNavegacaoSuperior.mapearUrlQueSeEncontra());
	}
	
	public static String mapearUrlQueSeEncontra() {
		return contexto.driver.getCurrentUrl();
		
	}
}
