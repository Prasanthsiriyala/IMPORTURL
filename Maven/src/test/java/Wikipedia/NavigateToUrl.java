package Wikipedia;

import org.openqa.selenium.WebDriver;

public class NavigateToUrl {
	
	public String navigate(WebDriver driver) {
		driver.get("https://www.wikipedia.org/");
		String title =driver.getCurrentUrl();
		return title;
		
	}

}
