package Car.mindtree;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class car_invalid {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1077248\\Desktop\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.savaari.com/");
		String halfXpath = "//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div";

		driver.findElement(By.id("fromCityList")).sendKeys("abcdefg@12");
		//Thread.sleep(1000);
		//driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(halfXpath + "/form/div[2]/div/input")).sendKeys(" ");
		Thread.sleep(1500);
		driver.findElement(By.xpath(halfXpath + "/form/div[2]/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("pickUpTime")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(halfXpath + "/form/div[4]/div/button")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div/form/div[4]/div/button")).sendKeys(Keys.ENTER);
}
}
