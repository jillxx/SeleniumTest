package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.PropertiesFile;

public class FirstSeleniumTest {

	public static String browser;
	static WebDriver driver;

	public static void main(String[] args) {

		// setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
	}

	// setBrower
	public static void setBrowser() {
		browser = "Firefox";

	}

	// setBrowserConfig
	public static void setBrowserConfig() {

		String projectLocation = System.getProperty("user.dir");

		if (browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Jiao Xu\\eclipse-workspace\\SeleniumTest\\geckoDriver\\geckodriver.exe");
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Jiao Xu\\eclipse-workspace\\SeleniumTest\\chromdriver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		if (browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation + "\\chromdriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

	}

	// runTest
	public static void runTest() {

		driver.get("http://seleniumhq.org/");

		driver.quit();

	}

}
