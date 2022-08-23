package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent{

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Academic Period'])[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "//span[contains(text(),' 2021-2022 ')]")
    private WebElement academicPeriod1;

    @FindBy(id = "mat-select-value-9")
    private WebElement gradeLevel;

    @FindBy(xpath="(//span[@class='mat-option-text'])[3]")
    private WebElement gradeLevel2;

    WebElement myElement;

    public void findAndClick(String strElement){  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement)
        {
            case "academicPeriod" : myElement =academicPeriod; break;
            case "academicPeriod1" : myElement =academicPeriod1; break;
            case "gradeLevel" : myElement =gradeLevel; break;
            case "gradeLevel2" : myElement =gradeLevel2; break;
        }

        clickFunction(myElement);

        if (myElement == academicPeriod || myElement == gradeLevel)
            GWD.Bekle(2);
    }




}

