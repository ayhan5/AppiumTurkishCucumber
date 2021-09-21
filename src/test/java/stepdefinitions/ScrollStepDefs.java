package stepdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Dimension;
import pages.AllPages;
import utilities.Driver;

import java.util.List;

public class ScrollStepDefs {

    AllPages elements =  new AllPages();
    @Then("kullanici Switches tiklasin")
    public void kullanici_switches_tiklasin() {

        List<MobileElement> list;
        do {
            list = elements.viewsPage().switches;
            Dimension dimension = Driver.getAppiumDriver().manage().window().getSize();

            int start_x = (int) (dimension.width * 0.5);
            int start_y = (int) (dimension.height * 0.8);

            int end_x = (int) (dimension.width * 0.5);
            int end_y = (int) (dimension.height * 0.2);

            TouchAction touchAction = new TouchAction(Driver.getAppiumDriver());

            touchAction.press(PointOption.point(start_x, start_y)).
                    moveTo(PointOption.point(end_x, end_y)).perform();
        }while(list.size()==0);

         elements.viewsPage().switches.get(0).click();
    }
}
