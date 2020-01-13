package New;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
public static void main(String[] args) {
	

	//System.setProperty("webdriver.chrome.driver",  "G:\\chromedriver2\\chromedriver_win32\\chromedriver.exe");
	
	System.setProperty("webdriver.chrome.driver", "G:\\All chromeDrive\\5\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/%22");
	driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
	//https://jqueryui.com/droppable/
	driver.switchTo().frame(0);
	
	//builder.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[1]/a"))).build().perform();
	
   // Thread.sleep(3000);
	//driver.findElement(By.xpath("//*[@id=\"headermenudesktop\"]/ul/li/ul/li[1]/a")).click();
	WebElement targetElement=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement sourceElement=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	
	Actions builder =new Actions(driver);
	builder.clickAndHold(targetElement).moveToElement(sourceElement).release().build().perform();
}
}