package pacone;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class EasyWeather {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		File appDir = new File("src");
                          File app =  File(appDir, "app-debug.apk");

		DesiredCapabilities cap=new DesiredCapabilities();
		         cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Harsha’s Device ");
cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");
cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath());
AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap); 

// Test-case #1  : Verifying the UI elements of CityList 

		driver.findElementByXPath("//android.widget.RelativeLayout[@index='2']").click();
		System.out.println("Newyork console logs Check");
                          Thread.sleep(2000);
                          driver.findElementByClassName("android.widget.ImageButton").click();
		driver.findElementByXPath("//android.widget.ImageButton[@index='0']").click();
                          System.out.println("Dublin Console logs Check");
		Thread.sleep(2000);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		
		driver.findElementByXPath("//android.widget.RelativeLayout[@index='3']").click();
		System.out.println("Barcelona  console logs Check");
		Thread.sleep(2000);
		driver.findElementByClassName("android.widget.ImageButton").click();
		
		driver.findElementByXPath("//android.widget.RelativeLayout[@index='1']").click();
		System.out.println("London Console logs Check");
		Thread.sleep(2000);
		driver.findElementByClassName("android.widget.ImageButton").click();
		System.out.println("Back button is tapped");
		
 //   Testcase #2 : This is the testcase for deleting the cities by swiping Left. This is one method of doing, by taking co-ordinates like Startx, starty & endx and endy. 

		driver.swipe(950, 875, 42, 780, 2000);
		System.out.println("Removing the City through Swipe action");


  // Second method for swipe, I haven’t used this in the code though 
                    //WebElement contact = driver.findElementByXPath("//android.widget.RelativeLayout[@index='3']");
	

//        int wide  = contact.getSize().width;
//        System.out.println(wide);
//        int hgt = contact.getSize().height;
//        System.out.println(hgt);
//        
//        int startx = (int) (wide * (0.99));
//        int endx = (int)(wide *(0.2));
//        int starty =  hgt /2 ;
//        int endy = hgt/2;
//        driver.swipe(startx, starty, endx, endy, 1000);
          

	}
	}

		
// Test case # 3 : Adding a new city through search 

                         driver.findElementByXPath("//android.widget.ImageButton[@resource-id='com.daniloprado.weather:id/fab']").click();
		System.out.println("Fab button is tapped to navigate to Create City screen");
		driver.findElementByXPath("//android.widget.EditText[@text='City']").sendKeys("Vienna");
		System.out.println("Added a new city Vienna");
		Thread.sleep(5000);
		driver.findElementByXPath("//android.widget.LinearLayout[@resource-id='com.daniloprado.weather:id/content_layout_found_city']").click();
		driver.findElementByXPath("//android.widget.RelativeLayout[@index='3']");
	             System.out.println(“ New city added through search”) 


       
	}
	}


