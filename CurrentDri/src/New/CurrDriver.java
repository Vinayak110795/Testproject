package New;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrDriver {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\All chromeDrive\\5\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("file:///G:/Selenium%20Software/Offline%20Website/index.html");

		// driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement userEle = driver.findElement(By.xpath("//input[@id='email']"));
		userEle.sendKeys("kiran@gmail.com");

		WebElement passwordEle = driver.findElement(By.xpath("//input[@id='password']"));
		passwordEle.sendKeys("123456");

		WebElement signInButttonEle = driver.findElement(By.xpath("//button[@type='submit']"));
		signInButttonEle.click();

	
		WebElement UserLinkEle = driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[3]/a/span"));
		UserLinkEle.click();

		// Locate Table 
		WebElement Table =
		driver.findElement(By.xpath("//table[@class='table table-hover']"));

		/// Inside table go for rows.

		List<WebElement> tr = Table.findElements(By.tagName("tr"));

		System.out.println("total no of rows " + tr.size());

		// iterating rows

		for (WebElement rows : tr) {
			List<WebElement> td = Table.findElements(By.tagName("td"));

			for (WebElement col : td) {

				System.out.println(col.getText());

			}
			System.out.println(".......................");
		}

		// Locatec logoutButton

		WebElement logoutEle = driver.findElement(By.xpath("/html/body/div[1]/header/nav/div/ul/li/a"));
		logoutEle.click();

	}

}
