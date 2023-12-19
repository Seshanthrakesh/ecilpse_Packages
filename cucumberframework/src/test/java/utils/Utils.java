package utils;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utils {
	public static WebDriver driver=null;


	public void launchBrowser(String url)
	{
		try
		{
			driver= new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println("Browser launched successfully");
		}
		catch(Exception ex)
		{
			System.out.println("Problem while launching the browser");
			ex.printStackTrace();

		}
	}

}
