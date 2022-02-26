package testessenaicursos;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteBuscaCursos {
	private WebDriver driver;
	
	@Before
	public void abrirNavegador() {
		System setProperty("webdriver.chrome.driver" , "C:\\Progam Files\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	} 
	@Test
	public void testeNavegador() {
		driver.get("https://www.sp.senai.br/");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.id("oqEstabuscando")).sendKeys("gestão");
		driver.findElement(By.className("btnBuscaJavaScript")).click();
				
	}
	
}
