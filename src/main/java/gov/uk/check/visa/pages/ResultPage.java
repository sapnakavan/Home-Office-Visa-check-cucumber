package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());

    public ResultPage() {
        PageFactory.initElements(driver, this);}

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;

    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement resultText;

    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement resultText1;

    public String verifymess(){
        return resultMessage.getText().trim();
    }
    public void confirmResultmess(String expectedmess){
        Assert.assertTrue(verifymess().equals(expectedmess),"Message did not match");
    }

    public String verifymess1(){
        return resultText.getText().trim();
    }
    public void confirmResultmess1(String expectedmess1){
        Assert.assertTrue(verifymess1().equals(expectedmess1),"Message did not match");
    }

    public String verifymess2(){
        return resultText1.getText().trim();
    }
    public void confirmResultmess2(String expectedmess2){
        Assert.assertTrue(verifymess2().equals(expectedmess2),"Message did not match");
    }

}
