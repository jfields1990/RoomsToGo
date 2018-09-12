package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testStylesMenu {
	public static void main(String[] args) throws InterruptedException {
    //CREATE FIREFOX WEBDRIVER		
		WebDriver driver = new FirefoxDriver();
		
		
//*********************************************************************
//       TEST CASE ONE
//*********************************************************************		
		
	//NAVIGATE TO ROOMS TO GO WEBSITE.
		driver.get("https://www.roomstogo.com");
   //CREATE URL STRING OBJECT FOR STRING VERIFICATION
		String url = driver.getCurrentUrl();
		Thread.sleep(4000);
  //CAPTURE THE CURRENT URL AND VERIFY THAT THE ROOMS TO GO WEBSITE LAUNCHED 		
		if (url.matches("https://www.roomstogo.com/")) {
		System.out.println("The Expected URL www.roomstogo.com was found");	}
		else {
		System.out.println("The Expected URL www.roomstogo.com was not found- Verification Failed");	
		}
			
		//CLICK ON THE LIVING ROOM MENU
		driver.findElement(By.id("livingrooms-menu")).click();
	  //VERIFY THAT THE LIVING ROOMS PAGE LOADS
		String url2 = driver.getCurrentUrl();
		Thread.sleep(4000);
		if(url2.matches("https://www.roomstogo.com/furniture/Living-Rooms/_/N-8ev")) {
			System.out.println("The Expected URL https://www.roomstogo.com/furniture/Living-Rooms/_/N-8ev was found");
		}
		else {
			System.out.println("The Expected URL https://www.roomstogo.com/furniture/Living-Rooms/_/N-8ev was not found- Verification Failed");
			

//******************************************************************************
//END TEST CASE 1
//******************************************************************************
		}
		
		driver.close();

		
	}

}
