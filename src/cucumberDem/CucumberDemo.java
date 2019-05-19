package cucumberDem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberDemo {
	WebDriver driver;

	@Given("the Amazon is open in chrome")
	public void environSetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

	}

	@And("the window is maximize")
	public void searchBox()
	{
		driver.manage().window().maximize();
	}
	
	@When("user enters \"(.*)\" in search box")
	public void laptop()
	{
		driver.findElement(By.xpath(".//input[@id='twotabsearchtextbox']")).sendKeys();
	}

	@And("hits the search button")
	public void searchButton()
	{
		driver.findElement(By.xpath(".//input[@type='submit']")).click();
	}

	@Then("list of laptops pops up")
	public void laptopList()
	{
		List<WebElement> list =driver.findElements(By.xpath(".//h2[@class='a-size-base s-inline  s-access-title  a-text-normal']"));
		System.out.println("total laptop count: "+list.size());
/*
		for (int i = 0; i < list.size(); i++) 
		
			{
				System.out.println(list.get(i).getText());
			}*/
		
	}

	@And("how many lenovo laptops come in search")
	public void lenovoCount()
	{
		List<WebElement> list2 =driver.findElements(By.xpath(".//h2[contains(text(),'Lenovo')]"));
		System.out.println("lenovo laptop count: "+list2.size());

		for (int i = 0; i < list2.size(); i++) 
		
			{
				System.out.println(list2.get(i).getText());
			}
		

		driver.close();
	}

}
