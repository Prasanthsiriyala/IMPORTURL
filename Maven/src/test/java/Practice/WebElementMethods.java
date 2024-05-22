package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement text=driver.findElement(By.xpath("//input[contains(@placeholder,\"Sea\")]"));
		text.sendKeys("mobiles");// it is used to write on webElement
		text.submit();//it is used to click on search bar - it works with only search bar
		WebElement logo=driver.findElement(By.xpath("//h2[text()=\"Gaming accessories\"]"));
		logo.getCssValue("font-size");//it is used to get font -size
		logo.getCssValue("color");//it is used to get font - color
		Point coordinate=logo.getLocation();//it is used to get x and y coordinates
		System.out.println(coordinate.getX());//it is used to get x coordinate.
		System.out.println(coordinate.getY());// it is used to get y coordinate
		Dimension dimensions=logo.getSize();// it is used to get dimensions
		System.out.println(dimensions.getHeight());//it is used to get height
		System.out.println(dimensions.getWidth());//it is used to get width
		Rectangle dimension=logo.getRect();// it is used to get both coordinates and dimensions
		System.out.println(dimension.getX());
		System.out.println(dimension.getY());
		System.out.println(dimension.height);
		System.out.println(dimension.width);




		

		

		

		
		
		

	}

}
