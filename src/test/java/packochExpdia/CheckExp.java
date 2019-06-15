package packochExpdia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckExp {

    WebDriver demo;

    @Test
    public void inspect() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Proxes\\Downloads\\JAVABuildTools\\chromedriver_win32\\chromedriver.exe");
        demo = new ChromeDriver();
        demo.manage().window().maximize();
        demo.get("https://www.expedia.com/");
        demo.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

//        List<WebElement>links = demo.findElements(By.tagName("a"));
//        System.out.println(links.size());
//
//
//        for(int i=1;i<=links.size();i++){
//            System.out.println(links.get(i).getText());
//        }


        demo.findElement(By.id("package-origin-hp-package")).click();
        Thread.sleep(3000);
        demo.findElement(By.id("package-origin-hp-package")).sendKeys("Lan");
        Thread.sleep(2000);
        Actions n = new Actions(demo);
        n.moveToElement(demo.findElement(By.cssSelector("body.wrap.cf.aoa-enabled.exp28390-1:nth-child(2) section.hero-banner-wrap.wizard-hero.mercury.hero-no-title.background.d-col-ads.core-wizard-loaded.siteid-1.theme-inverse-hero div.hero-banner.background.native-marquee.expanded div.hero-banner-gradient.native-marquee div.cols-row.hero-banner-inner:nth-child(1) div.hero-banner-box.siteId-1.cf.hideClassicDcol div.cols-row.theme-inverse-pills.wizard-tabs.cols-nested.inline-fields:nth-child(2) div.tabs-container.col section.tab-pane.cf.gcw-section-packages-tab.on:nth-child(3) form.gcw-form.gcw-childAgesAllProvided-travelerSelector.gcw-lessThanNTravelers-travelerSelector.gcw-isPartialDateWithinRange.gcw-isPartialCarDateWithinRange.flexible-shopping-form.ab29954TestStateOn.gcw-traveler-selector.field-border-in-high-contrast-mode.ess-passthrough-disabled section.package-form-fields div.cols-nested.ab25184-location:nth-child(1) div.col.gcw-location-field:nth-child(1) div.autocomplete.pin-left.theme-standard.autocomplete-open div.autocomplete-dropdown:nth-child(15) ul.results:nth-child(2) div.display-group-results li.results-item:nth-child(2) a.details > span.text"))).click().build().perform();
        Thread.sleep(1500);
        demo.findElement(By.xpath("//*[@id=\"traveler-selector-hp-package\"]/div/ul/li/button")).click();
        Thread.sleep(2000);
        demo.findElement(By.xpath("//div[@class='traveler-selector-room-data target-clone-field']//div[@class='children-wrapper']//button[@class='uitk-step-input-button uitk-step-input-plus']//*[@class='uitk-icon-svg uitk-step-input-icon']")).click();
        Thread.sleep(1000);

        Select child = new Select(demo.findElement(By.xpath("//select[@class='gcw-storeable gcw-toggles-field-by-value gcw-child-age-select gcw-child-age-1-1-hc']")));
        for (int i=0;i<17;i++){
            child.selectByIndex(i);
            demo.findElement(By.xpath("//select[@class='gcw-storeable gcw-toggles-field-by-value gcw-child-age-select gcw-child-age-1-1-hc']")).click();

        }

        String actual="Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations";
        String expected="https://www.expedia.com";
        Assert.assertEquals(actual,expected);


    }
}
