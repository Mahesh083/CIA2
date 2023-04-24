package PACKAGES;                                                                                                                                                                                      
import org.openqa.selenium.By;                                                                                                                                                                         
import org.openqa.selenium.WebElement;                                                                                                                                                                 
import org.openqa.selenium.chrome.ChromeDriver;                                                                                                                                                        
import org.openqa.selenium.chrome.ChromeOptions;                                                                                                                                                       
import org.openqa.selenium.support.ui.Select;                                                                                                                                                          
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;                                                                                                                                                      
                                                                                                                                                                                                       
public class QUESTION3 {                                                                                                                                                                               
  @Test                                                                                                                                                                                                
  public void fUN1() {                                                                                                                                                                                 
	  ChromeOptions co=new ChromeOptions();                                                                                                                                                            
	  co.addArguments("--remote-allow-origins=*");                                                                                                                                                     
	  WebDriverManager.chromedriver().setup();                                                                                                                                                         
	  ChromeDriver driver=new ChromeDriver(co);                                                                                                                                                        
	  driver.get("https://www.trivago.in/en-IN/srl/hotels-coimbatore-india?search=132-28;200-341656;dr-20230430-20230501");                                                                                                                                                           
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
//	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[5]/section/div/div/ol/li[1]/div/article/div[2]/div[2]/div[1]/div/div[2]/div[2]/button")).click();
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
                                                                                                                                                                      
//	   out button Not validated");                                                                                                                                              
} 
  
                                                                                                                                                                                                       
                                                                                                                                                                                                       
	                                                                                                                                                                                                   
	                                                                                                                                                                                                   
	                                                                                                                                                                                                   
  }  


                                                                                                                                                                                                       