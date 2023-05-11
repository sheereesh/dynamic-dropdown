package dynamicDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.google.com/");
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("java tutorial");
		  Thread .sleep(5000);
       List<WebElement> listElements=driver.findElements(By.xpath("//li//div[@class=\"lnnVSe\"]"));
       Thread .sleep(5000);
       System.out.println("list items "+listElements.size());
       for(WebElement element:listElements){
    	  if(element.getText().equals("java tutorial w3schools")) {
    		  element.click();
    		  break;
    	  }
    	   
       }
	}

}
