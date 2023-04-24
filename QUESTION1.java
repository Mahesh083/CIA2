package PACKAGES;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QUESTION1 {
  @Test
  public void fUN1() {
	  ChromeOptions co=new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver=new ChromeDriver(co);
	  driver.get("https://www.trivago.in/");
	  String url=driver.getCurrentUrl() ;
	  System.out.println(url);
	  String title=driver.getTitle();
	  System.out.println(title);
	  if(title.equals("trivago.in - Compare hotel prices worldwide")) {
		  System.out.println("Title validate");
	  }
	  else {
		  System.out.println("Title Not validate");
	  }
//	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/div/form/div/span/label")).click();
//	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/div/form/div/span/label")).sendKeys("Munnar");
	  String check=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/fieldset/button[1]/span/span[2]/span[1]")).getText();
	  System.out.println(check);
	  if(check.equals("Check in")) {
		  System.out.println("Check in button validated");
	  }
	  else {
		  System.out.println("Check in button Not validated");
	  }
String out=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/fieldset/button[2]/span/span/span[1]")).getText();
System.out.println(out);
if(out.equals("Check out")) {
	System.out.println("check out button validated");
}
else {
	System.out.println("check out button Not validated");
}
////driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[1]/button/span/span[2]/span[2]")).click();
////driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div[1]/div/button[2]/span/span[1]")).click();
//driver.findElement(By.className("truncate")).click();
////driver.findElement(By.className("driver.findElement(By.className(\"truncate\")).click();")).click();
//driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[3]/div/button")).click();
////driver.findElement(By.xpath("")).click();
  }
}
