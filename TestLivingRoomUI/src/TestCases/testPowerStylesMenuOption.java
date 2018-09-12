
//************************************************************************************************************************
/* THIS TEST CASE WILL NAVIGATE TO ROOMTOGO.COM, CLICK ON THE LIVING ROOM FURNITURE LINK AND DISPLAY THE RECLINING
   LIVING ROOMS SETS AVAILABLE*/
//************************************************************************************************************************ 

package TestCases;

import org.openqa.selenium.By;
//ALLOW METHODS TO BE CALLED FROM TESTMENUOPTION CLASS
public class testPowerStylesMenuOption extends testMenuOption{
//********************************************************************
// MAIN
//********************************************************************	
public static void main(String[] args) throws InterruptedException	{
//CREATE OBJECT INSTANCE		
testRecliningStyleOption obj3 = new testRecliningStyleOption();	
//CALL LAUNCH BROWSER METHOD
testRecliningStyleOption obj2 = new testRecliningStyleOption();	
//CALL LAUNCH BROWSER METHOD
obj3.launchBrowser();
//CALL NAVTOLIVINGROOMPAGE FUNCTION FROM CLASS
obj3.navToLivingRoomPage();
//CLICK ON SECTIONAL STYLE OPTION
driver.findElement(By.xpath("/html/body/div[3]/main/div/div[2]/div/div[2]/div[3]/div[1]/div/ul/li[2]/a/span[1]")).click();
Thread.sleep(2000);
String url6 = driver.getCurrentUrl();

//CAPTURE CURRENT URL AND VERIFY THAT THE RECLINING STYLE LIVING ROOM OPTIONS PAGE LOADS
if(url6.contentEquals("https://www.roomstogo.com/furniture/Living-Rooms/Living-Room-Sets/_/N-8ewZ1u1381r?qf=styles_Power")) {
	System.out.println("https://www.roomstogo.com/furniture/Living-Rooms/Living-Room-Sets/_/N-8ewZ1u1381r?qf=styles_Power was found ");
}
else {
	System.out.println("https://www.roomstogo.com/furniture/Living-Rooms/Living-Room-Sets/_/N-8ewZ1u1381r?qf=styles_Power was not found- Verification failed");
	}

//CLOSE WEBSITE
obj2.closeBrowser();
			
	
}
	

	
}
