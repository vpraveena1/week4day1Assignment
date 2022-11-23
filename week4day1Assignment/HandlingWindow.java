package week4day1Assignment;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWindow {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//Click and Confirm new Window Opens
		System.out.println("Click and Confirm new Window Opens");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		System.out.println("Tab Name : "+driver.getTitle());
		Set<String> windowHandles1 = driver.getWindowHandles();
		ArrayList<String> arrayList1 = new ArrayList<String>(windowHandles1);
		driver.switchTo().window(arrayList1.get(0));
		Thread.sleep(2000);
		driver.close();
		//Find the Number of Opened Tabs
		System.out.println("Find the Number of Opened Tabs");
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		ArrayList<String> arrayList2 = new ArrayList<String>(windowHandles2);
		System.out.println("Number of Tabs Opened : "+arrayList2.size());
		System.out.println("Tab Name : "+driver.getTitle());
		driver.switchTo().window(arrayList2.get(1));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.switchTo().window(arrayList2.get(2));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();
		//Open with Delay
		System.out.println("Open with Delay");
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		ArrayList<String> arrayList3 = new ArrayList<String>(windowHandles3);
		driver.switchTo().window(arrayList3.get(1));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(arrayList3.get(2));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();*/
		//Close Window
		System.out.println("Close Window");
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
		ArrayList<String> arrayList4 = new ArrayList<String>(windowHandles4);
		driver.switchTo().window(arrayList4.get(1));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(arrayList4.get(2));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();
		driver.switchTo().window(arrayList4.get(3));
		System.out.println("Tab Name : "+driver.getTitle());
		driver.close();
			}
}
		
		