package week4day1Assignment;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		String frame = driver.findElement(By.id("Click")).getText();
		System.out.println("Frame "+frame);
		driver.switchTo().defaultContent();
		//Nested Frame
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		String nestedFrame = driver.findElement(By.id("Click")).getText();
		System.out.println("Nested Frames"+nestedFrame);
		driver.switchTo().defaultContent();
		//Count Frame
		WebElement findElement = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
		driver.switchTo().frame(findElement);
		driver.findElement(By.id("Click")).click();
		String countFrames = driver.findElement(By.id("Click")).getText();
		System.out.println(countFrames);
		driver.quit();
	}

}
