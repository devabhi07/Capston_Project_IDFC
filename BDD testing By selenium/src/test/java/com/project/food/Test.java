package com.project.food;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Test {
	
	WebDriver dr;


	@Given("open the browser with url")
	

	public void open_the_browser_with_url() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		 dr = new ChromeDriver();
		 dr.get("http://localhost:3000/#/login");
	    

	}
	@Then("login")
	public void login() throws InterruptedException {
		Thread.sleep(2000);
		
		//sinup
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/a")).click();
		Thread.sleep(1000);
		
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("test6");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("test6@");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/div[3]/div/input")).sendKeys("test6@");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/div[4]/div/input")).sendKeys("9988776655");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/div[5]/div/input")).sendKeys("Mirzapur");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/div[6]/div/input")).sendKeys("Mirzapur");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/div[7]/div/input")).sendKeys("Up");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/div[8]/div/input")).sendKeys("3456");
		Thread.sleep(1000);
		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/button/span[1]")).click();
		Thread.sleep(1000);
	
//		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/header/div/div/div[3]/div/button")).click();

//		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/div[1]/div/input")).sendKeys("test3");
//		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/div[2]/div/input")).sendKeys("test3@");
//		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[2]/div/form/button")).click();
//		dr.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/header/div/div/div[3]")).click();
//		 Thread.sleep(500);
		//Sign up

	}




}
