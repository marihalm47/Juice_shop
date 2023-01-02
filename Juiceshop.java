package Juice;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Juiceshop {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
		
		//step 1: launch application of juice shop using Page object model
		System.setProperty("webdriver.chrome.driver", "C:\\TestAutomation\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        driver.get(" https://juice-shop.herokuapp.com");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        //pop up window opeartion
      
       
        By Dissmisspopup =By.xpath("//app-welcome-banner/div/div[2]/button[2][@class='mat-focus-indicator close-dialog mat-raised-button mat-button-base mat-primary ng-star-inserted']");
        By Wantit=By.xpath("//*[text()='Me want it!']");
        
        //pop-up click opration
        Thread.sleep(2000);
		driver.findElement(Dissmisspopup).click();
		Thread.sleep(1000);
		driver.findElement(Wantit).click();
		
		//.....................................................................//
		
		//account button 
		By Accountbtn=By.xpath("//button[3]/span[1]/span");
		//acoount button click operation
		driver.findElement(Accountbtn).click();
		Thread.sleep(1000);
		
		//Login button
		By Loginbtn=By.xpath("//div[2]/div/div/div/button/span");
		//login button click operation
		driver.findElement(Loginbtn).click();
		Thread.sleep(1000);
		
		//Not yet customer -for register a new user
		By Notyetcustomerbtn=By.xpath("//div[2]/a[contains(text(),'Not yet a customer?')]");
		//Not yet customer -for register a new user click operation
		driver.findElement(Notyetcustomerbtn).click();
		Thread.sleep(2000); 
		
		//..............................................................................//
		
		//user registration process
	
		By emailregister=By.xpath("//div[2]/mat-form-field[1]/div/div[1]/div[3]/input[@id='emailControl']");
		// email click operation
		driver.findElement(emailregister).sendKeys("Mynamemonika123@gmail.com");
		Thread.sleep(1000);
		
		By passwordregister=By.xpath("//div[2]/mat-form-field[2]/div/div[1]/div[3]/input[@id='passwordControl']");
		// password click operation
		driver.findElement(passwordregister).sendKeys("Test@123");
		Thread.sleep(1000);
		
		By repeatpasswordregister=By.xpath("//div[2]/mat-form-field[3]/div/div[1]/div[3]/input[@id='repeatPasswordControl']");
		// reapeat password click operation
		driver.findElement(repeatpasswordregister).sendKeys("Test@123");
		Thread.sleep(3000);
		
	/*	By passadvice=By.xpath("//div[2]/mat-slide-toggle/label/span[1][@class='mat-slide-toggle-bar']");
		// passwordadvice click operation
		driver.findElement(passadvice).click();
		Thread.sleep(1000);  */
		
	
	//Security question
		By sequirtyquestion=By.xpath("//div[2]/div[1]/mat-form-field[1]/div/div[1]/div[3]/mat-select/div/div[2]/div");
		driver.findElement(sequirtyquestion).click();
		Thread.sleep(1000);
		
		WebElement element = driver.findElement(By.xpath("//mat-option[12]"));
		Actions action=new Actions(driver);
		action.scrollToElement(element).perform();
		element.click();
		Thread.sleep(1000);
		
		
		//answer of security question
		By answer=By.xpath("//div[2]/div[1]/mat-form-field[2]/div/div[1]/div[3]/input[@id='securityAnswerControl']");
		// reapeat password click operation
		driver.findElement(answer).sendKeys("talash");
		Thread.sleep(3000);
		
		//register button
		By registerbtn=By.xpath("//div[2]/button/span[1][@class='mat-button-wrapper']");
		// reapeat password click operation
		driver.findElement(registerbtn).click();
		Thread.sleep(2000);  
//------------------------------------ 				
		//login process using credentials
		By logininfo = By.xpath("//mat-form-field[1]//div[3]/input[@id='email']");
		//login information
		driver.findElement(logininfo).sendKeys("Mynamemonika123@gmail.com");
		Thread.sleep(1000);
		
		By passwordinfo = By.xpath("//mat-form-field[2]//div[3]/input[@id='password']");
		//Password information 
		driver.findElement(passwordinfo).sendKeys("Test@123");
		Thread.sleep(1000);
				
		By loginbutton = By.xpath("//app-login//mat-card/div/button[1]");
		//Login Button
		driver.findElement(loginbutton).click();
		Thread.sleep(3000);
		
//step 2: Please login to the website and Add one or two items to basket (from each page) – scroll, navigate and select product 
		By applejuice = By.xpath("//div[2]/button");
		//add to cart Button- item 1
		driver.findElement(applejuice).click();
		Thread.sleep(2000);
		
		//scroll the web page till bottom
		WebElement elementpage = driver.findElement(By.xpath("//mat-paginator/div/div/div[2]/button[2]/span[1]"));
		Actions action1=new Actions(driver);
		action1.scrollToElement(elementpage).perform();
		elementpage.click();
		Thread.sleep(1000);
		
/*		By pagination = By.xpath("//mat-paginator/div/div/div[2]/button[2]/");
		//pagination
		driver.findElement(pagination).click();
		Thread.sleep(5000);*/
	
		By juiceshopiron = By.xpath("//mat-grid-tile[6]/div/mat-card/div[2]/button");
		driver.findElement(juiceshopiron).click();
		Thread.sleep(3000);
	
				
		/*By pagination2 = By.xpath("//mat-paginator/div/div/div[2]/button[2]/span[1]");
		//pagination
		driver.findElement(pagination2).click();
		Thread.sleep(3000);*/
		
		//Shoping Cart
		By Shopingcart = By.xpath("//mat-toolbar-row/button[4]");
		driver.findElement(Shopingcart).click();
		Thread.sleep(1000);
		
		//Increase 1st item quantity by one
		By applejuiceinc = By.xpath("//mat-row[1]/mat-cell[3]/button[2]");
		driver.findElement(applejuiceinc).click();
		Thread.sleep(1000);
		
		//Increase 2nd item quantity by one
		By juiceshopironinc = By.xpath("//mat-row[2]/mat-cell[3]/button[2]");
		driver.findElement(juiceshopironinc).click();
		Thread.sleep(1000);
		
		//CheckOut 
		By CheckOut = By.xpath("//app-basket/mat-card/button");
		driver.findElement(CheckOut).click();
		Thread.sleep(1000);
		
		//Add new Address
		By Addaddressbtn = By.xpath("//mat-card/div/button");
		driver.findElement(Addaddressbtn).click();
		Thread.sleep(1000);
		
		//Country
		By CountryName = By.xpath("//input[@placeholder='Please provide a country.']");
		driver.findElement(CountryName).sendKeys("India");
		Thread.sleep(1000);

		//Name Please provide a name.
		By Name = By.xpath("//input[@placeholder='Please provide a name.']");
		driver.findElement(Name).sendKeys("JuiceTest");
		Thread.sleep(1000);
		
		//MobileNumber
		By MobileNumber = By.xpath("//input[@placeholder='Please provide a mobile number.']");
		driver.findElement(MobileNumber).sendKeys("9838595925");
		Thread.sleep(1000);

		//ZipCode
		By ZipCode = By.xpath("//input[@placeholder='Please provide a ZIP code.']");
		driver.findElement(ZipCode).sendKeys("560040");
		Thread.sleep(1000);

		//Address
		By Address = By.xpath("//textarea[@placeholder='Please provide an address.']");
		driver.findElement(Address).sendKeys("Outer Ring Road");
		Thread.sleep(1000);

		//CityName
		By CityName = By.xpath("//input[@placeholder='Please provide a city.']");
		driver.findElement(CityName).sendKeys("Bangalore");
		Thread.sleep(1000);
		
		//StateName
		By StateName = By.xpath("//input[@placeholder='Please provide a state.']");
		driver.findElement(StateName).sendKeys("Karnataka");
		Thread.sleep(1000);

		//Submit Address 
		By Submitbtn = By.xpath("//mat-card/div[2]/button[2]");
		driver.findElement(Submitbtn).click();
		Thread.sleep(1000);
		
		//Radio Button 
		By radiobtn = By.id("mat-radio-40");
		driver.findElement(radiobtn).click();
		Thread.sleep(2000);
		
	 // Continue Button
		By Continuebtn = By.xpath("//mat-card/button[@aria-label='Proceed to payment selection']");
		driver.findElement(Continuebtn).click();
		Thread.sleep(2000);
	
	// Delivery options 
		By Deliveryoptions = By.xpath("//mat-cell[1]/mat-radio-button[@id='mat-radio-42']");
		driver.findElement(Deliveryoptions).click();
		Thread.sleep(2000);		
	
	//Continue button on Delivery address 		
		By Deliveryoptionsbtn = By.xpath("//mat-card/div[4]/button[2]/span[1]");
		driver.findElement(Deliveryoptionsbtn).click();
		Thread.sleep(2000);
		
		//Add new card 
		By AddNewCardbtn = By.xpath("//mat-expansion-panel/mat-expansion-panel-header/span[2][@class='mat-expansion-indicator ng-tns-c150-35 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']");
		driver.findElement(AddNewCardbtn).click();
		Thread.sleep(2000);
		
		//enter name for card
		By nameforcard = By.xpath("//mat-form-field[1]/div/div[1]/div[3]/input[@id='mat-input-16']");
		driver.findElement(nameforcard).sendKeys("myname");
		Thread.sleep(2000);
				
		//enter card number 
		By Cardnumberinp = By.xpath("//mat-form-field[2]/div/div[1]/div[3]/input[@id='mat-input-17']");
		driver.findElement(Cardnumberinp).sendKeys("2345698067234029");
		Thread.sleep(2000);	
		
		//Expiry MOnth
		By ExpiryMonth = By.xpath("//mat-form-field[3]/div/div[1]/div[3]/select[@id='mat-input-18']");
		driver.findElement(ExpiryMonth).sendKeys("10");
		Thread.sleep(2000);			

		//Expiry Year
		By ExpiryYear = By.xpath("//mat-form-field[4]/div/div[1]/div[3]/select[@id='mat-input-19']");
		driver.findElement(ExpiryYear).sendKeys("2081");
		Thread.sleep(2000);	
		
		//Submit button 
		By SubmitCardbtn = By.xpath("//app-payment-method/div/div/mat-expansion-panel/div/div/button[@id='submitButton']");
		driver.findElement(SubmitCardbtn).click();
		Thread.sleep(2000);	
		
		//Select the Added Card 
		By SelectAddedCardbtn = By.xpath("//mat-radio-button[@id='mat-radio-44']");
		driver.findElement(SelectAddedCardbtn).click();
		Thread.sleep(2000);
		
		// Add Coupon Details 
		By AddCoupnbtn = By.xpath("//app-payment/mat-card/div/mat-expansion-panel[1]/mat-expansion-panel-header[@id='mat-expansion-panel-header-1']");
		driver.findElement(AddCoupnbtn).click();
		Thread.sleep(2000);
		
		// Add a Coupon NUmber 
		By AddCoupnumberinp = By.xpath("//mat-expansion-panel[1]/div/div/mat-form-field/div/div[1]/div[3]/input[@placeholder='Please enter your coupon code']");
		driver.findElement(AddCoupnumberinp).sendKeys("2345689218");
		Thread.sleep(2000);
	
		//Click on Redeem coupon Button 
		By CoupnRedembtn = By.xpath("//mat-card/div/mat-expansion-panel[1]/div/div/button[@id='applyCouponButton']");
		driver.findElement(CoupnRedembtn).click();
		Thread.sleep(2000);		
		
		//Invalid Coupon Value 
		By InvalidCoupntxt = By.xpath("//div[@class='error ng-star-inserted']");
		Thread.sleep(2000);
		System.out.println(driver.findElement(InvalidCoupntxt).getText());
	
		// Proceed to Review 
		By Proceedtonextbtn = By.xpath("//mat-card//div[2]/button[2][@aria-label='Proceed to review']");
		Thread.sleep(1000);
		driver.findElement(Proceedtonextbtn).click();
		
		// Place your Order and Pay to Review 
		By Placetheorderbtn = By.xpath("//mat-card/button[@id='checkoutButton']");
		Thread.sleep(1000);
		driver.findElement(Placetheorderbtn).click();
		
		//Print Order COnfirmation
		By PrintOrderCOnfirmation = By.xpath("//button[@aria-label='Print order confirmation']");
		Thread.sleep(1000);
		driver.findElement(PrintOrderCOnfirmation).click();
		
		// Navigate to Track Order History
		driver.navigate().to("https://juice-shop.herokuapp.com/#/order-history");
		Thread.sleep(2000);
		
		//Track the Order Items
		By TrackOrderinfo = By.xpath("//button[@aria-label='Track Your Order']");
		Thread.sleep(1000);
		driver.findElement(TrackOrderinfo).click();
		
		//find for all the window and move back to the parent window
		
		String currentwindow = driver.getWindowHandle();
		
		Set<String> handles = driver.getWindowHandles();		
		for(String handle: handles)
		{
			if(handle.equals(currentwindow))
			{
				driver.switchTo().window(handle);
			}			
		}
		
		
		
		//Expected delivery Days
		By Expecteddeliverydays = By.xpath("//span[@class='fa-layers-counter accent-notification']");
		Thread.sleep(1000);
		System.out.println("Expected Delivery Days in :" + driver.findElement(Expecteddeliverydays).getText());	
		
		driver.findElement(Accountbtn).click();
		Thread.sleep(1000);
		
		//Logout Button
		
		By Logoutbtn = By.xpath("//button[4][@aria-label='Logout']");
		Thread.sleep(1000);
		driver.findElement(Logoutbtn).click();
		
	}
	
}