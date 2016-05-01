package classes;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnBoyContexto {
	public WebDriver driver;
	public String urlBase;
	public WebDriverWait wait;
	
	public OnBoyContexto(FirefoxDriver driver) {
		this.driver = driver;
		urlBase = "http://www.onboy.com.br/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,30);
	}
	
	public void sair(){
	    driver.quit();
	}
}
