package utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.List;

public class ReusableMethods {

      public static void clickOnPage(String pageName){
          List<MobileElement> pages = Driver.getAppiumDriver().findElementsByClassName("android.widget.TextView");
          for (MobileElement page: pages) {
              if (page.getText().equals(pageName)){
                  System.out.println(page.getText()+ " tikladik.");
                  page.click();
                  break;
              }
          }
      }

      public static void scrollWithUiScrollable(String elementText){
          AndroidDriver  driver = (AndroidDriver) Driver.getAppiumDriver();

          driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+elementText+"\"))");

          driver.findElementByXPath("//*[@text='"+elementText+"']").click();
      }

}
