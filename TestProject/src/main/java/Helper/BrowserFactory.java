/**
 * 
 */
package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author User
 * added comment 
 *
 */
public class BrowserFactory {

static WebDriver driver;

public static WebDriver StartBrowser(String browserName, String url)
{
if(browserName.equalsIgnoreCase("chrome"))
{
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
}

if(browserName.equalsIgnoreCase("firefox"))
{

driver = new FirefoxDriver();
}

if(browserName.equalsIgnoreCase("IE"))
{
driver = new InternetExplorerDriver();
}

driver.manage().window().maximize();
driver.navigate().to(url);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


return driver;

}

}
