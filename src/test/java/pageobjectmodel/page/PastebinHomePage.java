package pageobjectmodel.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PastebinHomePage {
    public static final String HOMEPAGE_URL = "https://pastebin.com/";
    private WebDriver driver;

    public PastebinHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public PastebinHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        return this;
    }
//        .openPage();
//        .inputNewPaste("Hello from WD");
//        .setExpirationPeriod("10 Minutes");
//        .nameNewPaste("helloweb");
//        .createNewPaste();
}