package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlink {

	public static void main(String[] args) {
		//WebDriver driver = new ChromeDriver();
		
		learnHyperLink lp = new learnHyperLink();
		lp.run();

	}

}
class learnHyperLink{
	WebDriver driver = new ChromeDriver();
	
	public void run() {
		openUrl(" https://web-locators-static-site-qa.vercel.app/Hyperlink");
		locateElement();
		
	}
	public void openUrl(String url) {
		driver.get(url);
	}
	public void locateElement() {
		WebElement link=driver.findElement(By.linkText("Crio.do"));
	    linkDisplayed(link) ;
	    linkisEnabled(link);
	    Text(link);
	    value(link,"href");
	    
	}
	public void linkDisplayed(WebElement link) {
		boolean result = link.isDisplayed();
		System.out.println("isDisplayed:"+result);
	}
	public void linkisEnabled(WebElement link) {
		boolean result1 = link.isEnabled();
		System.out.println("isEnabled:"+result1);
		
	}
	public void Text(WebElement link) {
		String Text=link.getText();
		System.out.println("text:"+Text);
	}
	
	public void value(WebElement link,String value) {
		String ref=link.getAttribute(value);
		System.out.println("herf:"+ref);
		
	}

	
	
}
