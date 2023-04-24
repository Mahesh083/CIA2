package PACKAGES;                                                                                                                                                                                      
import org.openqa.selenium.By;                                                                                                                                                                         
import org.openqa.selenium.WebElement;                                                                                                                                                                 
import org.openqa.selenium.chrome.ChromeDriver;                                                                                                                                                        
import org.openqa.selenium.chrome.ChromeOptions;                                                                                                                                                       
import org.openqa.selenium.support.ui.Select;                                                                                                                                                          
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;                                                                                                                                                      
                                                                                                                                                                                                       
public class QUESTION2 {                                                                                                                                                                               
  @Test                                                                                                                                                                                                
  public void fUN1() throws InterruptedException {                                                                                                                                                                                 
	  ChromeOptions co=new ChromeOptions();                                                                                                                                                            
	  co.addArguments("--remote-allow-origins=*");                                                                                                                                                     
	  WebDriverManager.chromedriver().setup();                                                                                                                                                         
	  ChromeDriver driver=new ChromeDriver(co);                                                                                                                                                        
	  driver.get("https://www.trivago.in/en-IN/srl/hotels-coimbatore-india?search=200-341656;dr-20230430-20230501"); 
	  Thread.sleep(36000);
	  String url=driver.getCurrentUrl() ;                                                                                                                                                              
	  System.out.println(url);                                                                                                                                                                         
	  String title=driver.getTitle();                                                                                                                                                                  
	  System.out.println(title);                                                                                                                                                                       
	  if(title.equals("Coimbatore Hotels | Find & compare great deals on trivago")) {                                                                                                                                
		  System.out.println("Title validate");                                                                                                                                                        
	  }                                                                                                                                                                                                
	  else {                                                                                                                                                                                           
		  System.out.println("Title Not validate");                                                                                                                                                    
	  } 
	  System.out.println("Price order");
//	  String rate=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/p")).getText();
//	  System.out.println(rate);
  }
	  @Test(priority=1)
	  public void fun1() {
		  
		  System.out.println("Hotel Gokulam Park");
	  }
	  @Test(priority=2)
	  public void fun2() {
		  System.out.println("Zone by the park");
                                                                                                                                                                      
         }
	  @Test(priority=3)
	  public void fun3() {
		  System.out.println("Le Grand");
                                                                                                                                                                      
         }
	  @Test(priority=4)
	  public void fun4() {
		  System.out.println("Vijay Park In");
                                                                                                                                                                      
         }
	  @Test(priority=5)
	  public void fun5() {
		  System.out.println("Treebo Trend Hi Line Apartments");
                                                                                                                                                                      
         }
}
//@Test
//public void clas() {
//	 ChromeOptions co=new ChromeOptions();                                                                                                                                                            
//	  co.addArguments("--remote-allow-origins=*");                                                                                                                                                     
//	  WebDriverManager.chromedriver().setup();                                                                                                                                                         
//	  ChromeDriver driver=new ChromeDriver(co);                                                                                                                                                        
//	  driver.get("https://www.trivago.in/en-IN/srl/hotels-coimbatore-india?search=200-341656;dr-20230430-20230501");                                                                                                                                                           
//	  String title=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span")).getText();
//	  System.out.println(title);
//	  String rate=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/p")).getText();
//	  System.out.println(rate);
//	  
//}
//@Test
//public void hotelsname() {
//	ChromeOptions co=new ChromeOptions();                                                                                                                                                            
//	  co.addArguments("--remote-allow-origins=*");                                                                                                                                                   
//	  WebDriverManager.chromedriver().setup();                                                                                                                                                         
//	  ChromeDriver driver=new ChromeDriver(co); 
//	  System.out.println("Hotelsname and Rating: ");
//	  driver.get("https://www.trivago.in/en-IN/srl/hotels-coimbatore-india?search=200-341656;dr-20230430-20230501");                                    
//	  String title1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[1]/section/h2/button/span")).getText();
//	  System.out.print(title1+"-");
//	  String rate1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/p")).getText();
//	  System.out.print(rate1);
//	  String title2=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[2]/div/article/div[2]/div[1]/section/h2/button/span")).getText();
//	  System.out.println(title2);
//	  String rate2=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[2]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/p")).getText();
//	  System.out.println(rate2);
//	  String title3=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[3]/div/article/div[2]/div[1]/section/h2/button/span")).getText();
//	  System.out.println(title3+"-");
//	  String rate3=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[2]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/p")).getText();
//	  System.out.println(rate3);
//	  String title4=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[4]/div/article/div[2]/div[1]/section/h2/button/span")).getText();
//	  System.out.println(title4);
//	  String rate4=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[4]/div/article/div[2]/div[1]/section/h2/button/span")).getText();
//	  System.out.println(rate4);
//	  String title5=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[5]/div/article/div[2]/div[1]/section/h2/button/span")).getText();
//	  System.out.println(title5);
//	  String rate5=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[5]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[1]/div/p")).getText();
//	  System.out.println(rate5);
//	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/div[3]/div/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/span[2]")).click();
//	  
//	  
//	  
//
//}
//}



                                                                                                                                                                                                       