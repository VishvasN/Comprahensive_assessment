package Car.mindtree;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class car_automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1077248\\Desktop\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.savaari.com/");
		String halfXpath = "//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div";

		driver.findElement(By.id("fromCityList")).sendKeys("Bangalore");
		Thread.sleep(1000);
		driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(halfXpath + "/form/div[2]/div/input")).sendKeys("Pune");
		Thread.sleep(1500);
		driver.findElement(By.xpath(halfXpath + "/form/div[2]/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("pickUpTime")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(halfXpath + "/form/div[4]/div/button")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-select-car/div[2]/div/div/div[1]/div/div[4]/div/button")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-booking/div[2]/app-booking-pickup-detail/div/div[2]/form/div[1]/div/input")).sendKeys("Vishvas");
		driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-booking/div[2]/app-booking-pickup-detail/div/div[2]/form/div[2]/input")).sendKeys("vishvas19apr2000@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-booking/div[2]/app-booking-pickup-detail/div/div[2]/form/div[3]/div/input")).sendKeys("8105329735");
		driver.findElement(By.xpath("//*[@id=\"search_places\"]")).sendKeys("Near Rama Mandir, ramana block");
		//Thread.sleep(1000);
	//	driver.findElement(By.xpath("//*[@id=\\\"search_places\\\"]")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-booking/div[2]/app-booking-pickup-detail/div/div[2]/form/div[4]/div[1]/ng4geo-autocomplete/div/ul/li[1]/a")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-booking/div[2]/app-booking-pickup-detail/div/div[2]/form/button/div")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-booking/div[2]/app-booking-payment-detail/div/div/div[3]/div[2]/button/div/span")).sendKeys(Keys.ENTER);
	}

}

