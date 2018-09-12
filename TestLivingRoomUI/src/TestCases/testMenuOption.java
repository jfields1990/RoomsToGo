package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//************************************************************************************************************************
/* THIS TEST CASE WILL NAVIGATE TO ROOMTOGO.COM, CLICK ON THE LIVING ROOM FURNITURE LINK AND DISPLAY THE CLASSIC 
   LIVING ROOMS SETS AVAILABLE*/
//************************************************************************************************************************ 

public class testMenuOption {
//********************************************************************
// MAIN
//********************************************************************	
//CREATE GLOBAL WEBDRIVER	
public static WebDriver driver;	

 public void navToLivingRoomPage() throws InterruptedException {
//CREATE FIREFOX WEBDRIVER		
// WebDriver driver = new FirefoxDriver();
	
	
//NAVIGATE TO ROOMS TO GO WEBSITE.
 driver.get("https://www.roomstogo.com");
//CREATE URL STRING OBJECT FOR STRING VERIFICATION
		String url = driver.getCurrentUrl();
//CAPTURE THE CURRENT URL AND VERIFY THAT THE ROOMS TO GO WEBSITE LAUNCHED 		
if (url.contentEquals("https://www.roomstogo.com/")) {
System.out.println("The Expected URL www.roomstogo.com was found");	}
else {
System.out.println("The Expecte URL www.roomstogo.com was not found- Verification Failed");	
}
			
//CLICK ON THE LIVING ROOM MENU LINK
WebElement ele = driver.findElement(By.id("livingrooms-menu"));
Actions action = new Actions(driver);
action.moveToElement(ele).build().perform();
Thread.sleep(2000);

//CLICK ON LIVING ROOM SET SUBMENU
driver.findElement(By.id("livingrooms-livingroomsets-submenu")).click();
Thread.sleep(2000);

//CAPTURE CURRENT WEB PAGE AND VERIFY LIVING ROOM SETS WEB PAGE LOADS
String url3 = driver.getCurrentUrl();
if(url3.contentEquals("https://www.roomstogo.com/furniture/Living-Rooms/Living-Room-Sets/_/N-8ew")) {
  System.out.println(" The Expected URL https://www.roomstogo.com/furniture/Living-Rooms/Living-Room-Sets/_/N-8ew was found");
  
  }
else {
	  System.out.println("The Expected URL https://www.roomstogo.com/furniture/Living-Rooms/Living-Room-Sets/_/N-8ew was not found- Verificication Failed");
	  
  }
 
//VERIFY STYLE MENU SHOWS AFTER THE LIVING ROOM SETS PAGE LOADS
String stylemnu = driver.findElement(By.id("facetStyle")).getText();
if(stylemnu.contentEquals("Style")) {
  System.out.println("Style Menu shows as Expected");
	  
  }
else {
  System.out.println("Style Menu is not visible- Verification Failed");
  }
 }
//CLOSE BROWSER
 public void closeBrowser() {
	 if (! driver.toString().contains("null")) {
		 driver.close();
	 }
 }
 //LAUNCH BROWSER
 public void launchBrowser() {
 driver = new FirefoxDriver();
 
 }
 
//**********************************************************************
// MAIN TEST
//********************************************************************** 
public static void main(String[] args) throws InterruptedException {
	
//********************************************************
//  TEST CLASSIC STYLE OPTON
//********************************************************	
//CREATE OBJECT
	
testMenuOption obj = new testMenuOption();
obj.launchBrowser();
obj.navToLivingRoomPage();

//CLICK ON THE CLASSIC STYLE OPTION FROM THE STYLE MENU
driver.findElement(By.id("cb_Style_Classic")).click();
Thread.sleep(2000);
String url4 = driver.getCurrentUrl();

//CAPTURE CURRENT URL AND VERIFY THAT THE CLASSIC STYLE LIVING ROOM OPTIONS PAGE LOADS
if(url4.contentEquals("https://www.roomstogo.com/furniture/Living-Rooms/Living-Room-Sets/_/N-8ewZ1z141yc?qf=styles_Classic")) {
	System.out.println(" The Expected URL https://www.roomstogo.com/furniture/Living-Rooms/Living-Room-Sets/_/N-8ewZ1z141yc?qf=styles_Classic was found ");
}
else {
	System.out.println("The Expected URL https://www.roomstogo.com/furniture/Living-Rooms/Living-Room-Sets/_/N-8ewZ1z141yc?qf=styles_Classic was not found- Verification failed");
	}

//CLOSE WEBSITE
obj.closeBrowser();	




}





}


