package definition_upskill;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Defn_upskill {
	public static String url="https://demoapp.skillrary.com/login.php?type=login";

	WebDriver driver;

	@Given("I should go to the login page")
	public void i_should_go_to_the_login_page() {
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	    
	@Given("Enter the username {string}")
	public void enter_the_username(String string) {
		
		driver.findElement(By.name("email")).sendKeys(string);
	}
	    
	@Given("Enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
	}
	    
	@Given("Click on the login button")
	public void click_on_the_login_button() throws IOException {
		driver.findElement(By.xpath("//*[@id='last']")).click();
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://Users//HP//OneDrive//Desktop//vvx/"));
	}
	    
	
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
		String suri1 =driver.getTitle();
		Assert.assertEquals(string,suri1);
	}
	   
	@Then("Click on the username")
	public void click_on_the_username() {
		driver.findElement(By.xpath("//*[@class='dropdown-toggle']//img[1]")).click();
	    
	}
	@Then("Click on the signout")
	public void click_on_the_signout() {
		driver.findElement(By.linkText("Sign out")).click();
	}
	    
	
	@Then("I should go skillrary homepage as {string}")
	public void i_should_go_skillrary_homepage_as(String string) {
		String suri =driver.getTitle();
		Assert.assertEquals(string,suri);
	}
	    
	}

