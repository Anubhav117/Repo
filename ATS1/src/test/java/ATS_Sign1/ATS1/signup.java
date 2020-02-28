package ATS_Sign1.ATS1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signup 
{
	
	public static WebDriver driver;

	
	public static void launch()
	{
	System.setProperty("webdriver.chrome.driver","E:/selenium/chromedriver_win32/chromedriver.exe");


	driver=new ChromeDriver();
	driver.get("https://www.realestateiq.me/v4/client_app.php");

	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test(dataProvider="Test")
	public void login(String username,String password)
	{
		launch();
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);

	driver.findElement(By.name("Submit")).click();

	}

	@DataProvider(name="Test")
	public Object[][] passdata()
	{
	Object[][] data=new Object[2][2];
	data[0][0]="anubhav_dallas";
	data[0][1]="anubhav_dallas";

	data[1][0]="har_test";
	data[1][1]="har_test";


	return data;




	}
	}

