package Assignmentsweek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createlead {

	public static void main(String[] args) {
		       WebDriverManager.chromedriver().setup();
		       ChromeDriver driver=new ChromeDriver();
		       driver.get("http://leaftaps.com/opentaps/control/login");
		       driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		       driver.findElement(By.id("password")).sendKeys("crmsfa");
		       driver.findElement(By.className("decorativeSubmit")).click();
		       driver.findElement(By.linkText("CRM/SFA")).click();
		       driver.findElement(By.linkText("lead")).click();
		       driver.findElement(By.linkText("Create lead")).click();
		       driver.findElement(By.id("Createleadform_companyname")).sendKeys("amazon");
		       driver.findElement(By.id("Createleadform_firstname")).sendKeys("kasthoori");
		       driver.findElement(By.id("Createleadform_Lastname")).sendKeys("Natarajan");
		       driver.findElement(By.id("Createleadform_firstname local")).sendKeys("kasthoori");
		       driver.findElement(By.id("Createleadform_departmentname")).sendKeys("selenium");
		       driver.findElement(By.id("Createleadform_description")).sendKeys("The lead will do marketing");
		       driver.findElement(By.id("Createleadform_emailid")).sendKeys("kasthunatarajan93@gmail.com");
		       driver.findElement(By.className("smallSubmit")).click();
		       String title = driver.getTitle();
		       System.out.println(title);			}	

	}
