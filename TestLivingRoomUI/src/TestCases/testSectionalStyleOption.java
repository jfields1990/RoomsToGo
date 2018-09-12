
//************************************************************************************************************************
/* THIS TEST CASE WILL NAVIGATE TO ROOMTOGO.COM, CLICK ON THE LIVING ROOM FURNITURE LINK AND DISPLAY THE SECTIONAL
   LIVING ROOMS SETS AVAILABLE*/
//************************************************************************************************************************ 


package TestCases;

import org.openqa.selenium.By;
//ALLOW METHODS TO BE CALLED FROM TESTMENUOPTION CLASS
public class testSectionalStyleOption extends testMenuOption {
//********************************************************************
// MAIN
//********************************************************************	
public static void main(String[] args) throws InterruptedException {
//CREATE OBJECT INSTANCE	
testSectionalStyleOption obj3 = new testSectionalStyleOption();		
//CALL LAUNCH BROWSER METHOD
obj3.launchBrowser();
//CALL NAVTOLIVINGROOMPAGE FUNCTION FROM CLASS
obj3.navToLivingRoomPage();
//CLICK ON SECTIONAL STYLE OPTION
driver.findElement(By.xpath("/html/body/div[3]/main/div/div[2]/div/div[2]/div[3]/div[1]/div/ul/li[4]/a/span[1]")).click();
Thread.sleep(2000);
String url6 = driver.getCurrentUrl();

//CAPTURE CURRENT URL AND VERIFY THAT THE SECTIONAL STYLE LIVING ROOM OPTIONS PAGE LOADS
if(url6.contentEquals("https://www.roomstogo.com/furniture/Living-Rooms/Living-Room-Sets/_/N-8ewZ1z141yz?qf=styles_Sectional")) {
	System.out.println("https://www.roomstogo.com/furniture/Living-Rooms/Living-Room-Sets/_/N-8ewZ1z141yz?qf=styles_Sectional was found ");
}
else {
	System.out.println("https://www.roomstogo.com/furniture/Living-Rooms/Living-Room-Sets/_/N-8ewZ1z141yz?qf=styles_Sectional was not found- Verification failed");
	}

//CLOSE WEBSITE
obj3.closeBrowser();
		
}

}
