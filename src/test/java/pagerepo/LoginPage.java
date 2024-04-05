/*
 * package pagerepo;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.WebElement;
 * 
 * public class LoginPage{ WebDriver driver; String email =
 * "student243@vrittechnologies.com"; private String password ="student243";
 * 
 * 
 * private By inputEmail = By.xpath("//input[@placeholder='E-mail or Phone']");
 * private By inputPassword = By.xpath("//input[@name='password']"); By singIn =
 * By.xpath("//button[text()=' Sign in']");
 * 
 * public LoginPage(WebDriver driver) { this.driver = driver;
 * 
 * }
 * 
 * 
 * 
 * public String getEmail() { return email; }
 * 
 * 
 * 
 * public void setEmail(String email) { this.email = email; }
 * 
 * 
 * 
 * public String getPassword() { return password; }
 * 
 * 
 * 
 * public void setPassword(String password) { this.password = password; }
 * 
 * 
 * 
 * public WebElement getInputEmail() { return driver.findElement(inputEmail); }
 * 
 * public void setInputEmail(By inputEmail) { this.inputEmail = inputEmail; }
 * 
 * public WebElement getInputPassword() { return
 * driver.findElement(inputPassword); }
 * 
 * public void setInputPassword(By inputPassword) { this.inputPassword =
 * inputPassword; }
 * 
 * 
 * public WebElement singIn() {
 * 
 * return driver.findElement(singIn); }
 * 
 * 
 * 
 * 
 * }
 */

package pagerepo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	Properties prop;
	
	 public LoginPage(WebDriver driver) {
		  this.driver=driver; }
 
	By inputEmail = By.xpath("//input[@name='emailOrPhone']");
	public WebElement inputEmail() {
		
		return driver.findElement(inputEmail);
	}
	
	By inputPassword = By.xpath("//input[@name='password']");
	public WebElement inputPassword() {
		
		return driver.findElement(inputPassword);
	}
	
	By loginBtn = By.xpath("//button[text()=' Sign in']");
	public WebElement loginBtn() {
		
		return driver.findElement(loginBtn);
	}
	
	 
	
	public String email() {
		prop = new Properties();
	    InputStream inputStream = getClass().getClassLoader().getResourceAsStream("secrets.properties");

	    try {
	    	if (inputStream != null) {
	            prop.load(inputStream);
	        } else {
	            System.out.println("secrets.properties file not found!");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }


	    String email = prop.getProperty("email");
	    return email;
	}
	
	public String password() {
		
		
		prop = new Properties();
	    InputStream inputStream = getClass().getClassLoader().getResourceAsStream("secrets.properties");

	    try {
	    	if (inputStream != null) {
	            prop.load(inputStream);
	        } else {
	            System.out.println("secrets.properties file not found!");
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }


	    String password = prop.getProperty("password");
	    return password;
	}
	
	
	public void callLogin() {
		
		inputEmail().sendKeys(email());
		inputPassword().sendKeys(password());
		loginBtn().click();
	}
	
}
