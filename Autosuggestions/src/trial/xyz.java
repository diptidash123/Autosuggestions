package trial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xyz {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement folder1=driver.findElement(By.xpath("//input[@type='text']"));
		folder1.sendKeys("chrome");
		Thread.sleep(5000);
		List<WebElement>  folder2=driver.findElements(By.xpath("//span[contains(text(),'chrome')]"));
		System.out.println(folder2.size());
		
		/*for(int i=0;i<folder2.size();i++)
		{
			System.out.println(folder2.get(i).getText());
		}
		folder2.get(5).click();*/
		
		/*for(int i=0;i<folder2.size();i++)
		{
			if(folder2.get(i).getText().equals("chrome browser"))
			{
				System.out.println(folder2.get(i).getText());
				folder2.get(i).click();
				break;
			}
		}*/
		
		for(int i=0;i<=4;i++)
		{
			folder1.sendKeys(Keys.ARROW_DOWN);
		}
		folder1.sendKeys(Keys.ENTER);	
	}

}
