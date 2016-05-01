package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCadastroUsuarioOuEmpresaFisicaValidacaoCampos {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://www.onboy.com.br";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testCadastroUsuarioOuEmpresaFisicaValidacaoCampos() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.cssSelector("strong")).click();
    driver.findElement(By.linkText("Sou usuário ou empresa")).click();
    driver.findElement(By.cssSelector("#cadastro_cliente > #form1 > div.modal-dialog > div.modal-content > div.modal-body > div.control-group > div.controls > #nome")).clear();
    driver.findElement(By.cssSelector("#cadastro_cliente > #form1 > div.modal-dialog > div.modal-content > div.modal-body > div.control-group > div.controls > #nome")).sendKeys("Leandro Granella Moraes");
    driver.findElement(By.cssSelector("#cadastro_cliente > #form1 > div.modal-dialog > div.modal-content > div.modal-body > div.control-group > div.controls > #email")).clear();
    driver.findElement(By.cssSelector("#cadastro_cliente > #form1 > div.modal-dialog > div.modal-content > div.modal-body > div.control-group > div.controls > #email")).sendKeys("leandrogranella@gmail.com");
    driver.findElement(By.id("cpf_cnpj")).clear();
    driver.findElement(By.id("cpf_cnpj")).sendKeys("03046388039");
    driver.findElement(By.cssSelector("#cadastro_cliente > #form1 > div.modal-dialog > div.modal-content > div.modal-body > div.control-group > div.controls > div.control-group.form-inline > #senha")).clear();
    driver.findElement(By.cssSelector("#cadastro_cliente > #form1 > div.modal-dialog > div.modal-content > div.modal-body > div.control-group > div.controls > div.control-group.form-inline > #senha")).sendKeys("98576442");
    driver.findElement(By.cssSelector("#cadastro_cliente > #form1 > div.modal-dialog > div.modal-content > div.modal-body > div.control-group > div.controls > div.control-group.form-inline > #telefone_ddd")).clear();
    driver.findElement(By.cssSelector("#cadastro_cliente > #form1 > div.modal-dialog > div.modal-content > div.modal-body > div.control-group > div.controls > div.control-group.form-inline > #telefone_ddd")).sendKeys("051");
    driver.findElement(By.cssSelector("#cadastro_cliente > #form1 > div.modal-dialog > div.modal-content > div.modal-body > div.control-group > div.controls > div.control-group.form-inline > #telefone_numero")).clear();
    driver.findElement(By.cssSelector("#cadastro_cliente > #form1 > div.modal-dialog > div.modal-content > div.modal-body > div.control-group > div.controls > div.control-group.form-inline > #telefone_numero")).sendKeys("98567466");
    driver.findElement(By.cssSelector("#cadastro_cliente > #form1 > div.modal-dialog > div.modal-content > div.modal-body > div.control-group > div.controls > div.control-group.form-inline > #data_nascimento")).clear();
    driver.findElement(By.cssSelector("#cadastro_cliente > #form1 > div.modal-dialog > div.modal-content > div.modal-body > div.control-group > div.controls > div.control-group.form-inline > #data_nascimento")).sendKeys("15/01/1991");
    driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
