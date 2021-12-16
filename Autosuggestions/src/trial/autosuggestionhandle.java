package trial;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestionhandle 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:/software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchbar=driver.findElement(By.xpath("//input[@type='text']"));
        searchbar.sendKeys("selenium");
        Thread.sleep(5000);
        List<WebElement>  dropdownmenu=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
        System.out.println(dropdownmenu.size());
        
        /*for(int i=0;i<dropdownmenu.size();i++)
        {
        	System.out.println(dropdownmenu.get(i).getText());
        }
        dropdownmenu.get(2).click();*/
        
       /* for(int i=0;i<dropdownmenu.size();i++)
        {
        	if(dropdownmenu.get(i).getText().equals("selenium download"))
        	{
        		System.out.println(dropdownmenu.get(i).getText());
        		dropdownmenu.get(i).click();
        		break;
        	}
        }*/
        
        for(int i=0;i<=3;i++)
        {
        	searchbar.sendKeys(Keys.ARROW_DOWN);
        	
        }
        searchbar.sendKeys(Keys.ENTER);
	}

}
