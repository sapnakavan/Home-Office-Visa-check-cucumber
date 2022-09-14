package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility {
    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Yes')]")
    WebElement yesRadiobtn;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'No')]")
    WebElement noRadiobtn;


    public void selectImmigrationStatus(String status) throws InterruptedException {
    switch (status.trim()) {
        case "Yes":
            clickOnElement(yesRadiobtn);
            break;
        case "No":
            clickOnElement(noRadiobtn);
            break;}
            Thread.sleep(1000);
    }
}

