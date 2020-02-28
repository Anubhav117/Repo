package ATS_Sign1.ATS1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class users 

{
		public static WebDriver driver;

		
		public static void launch()
		{
		System.setProperty("webdriver.chrome.driver","E:/selenium/chromedriver_win32/chromedriver.exe");


		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://cta-server.columbususa.com/login");
		driver.findElement(By.xpath("//*[@id=\"m_login\"]/div[2]/div[1]/a")).click();//click on the sign up button.	

		WebDriverWait Wait=new WebDriverWait(driver,30);//Explicit wait
		
		
	     //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		}
		@Test(dataProvider="Test")
		public void sign_up123(String First_name,String Last_name, String email,String phone,String Department,String reg,String pwd, String confirm_pwd)
		{
			launch();
		driver.findElement(By.name("first_name")).sendKeys(First_name);
		driver.findElement(By.name("last_name")).sendKeys(Last_name);
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("phone")).sendKeys(phone);
		driver.findElement(By.name("department")).sendKeys(Department);
		driver.findElement(By.name("registrationCode")).sendKeys(reg);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("rpassword")).sendKeys(confirm_pwd);



		driver.findElement(By.xpath("//*[@id=\"m_login\"]/div[2]/div/m-register/div/div[2]/m-spinner-button/button/span/span")).click();
        driver.close();
		}

		@SuppressWarnings("unused")
		@DataProvider(name="Test")
		public Object[][] passdata()
		{
			Object[][] data=new Object[100][8];

			for(int i=0;i<100;i++)	
			{
		data[i][0]="Load";
		data[i][1]="Test";
		String em= "loadtest"+i+"@yopmail.com";
		data[i][2]=em;
		data[i][3]="998888888";
		data[i][4]="load_test";
		data[i][5]="1414";
		data[i][6]="123456";
		data[i][7]="123456";
			}

		return data;
			
		}
		}




