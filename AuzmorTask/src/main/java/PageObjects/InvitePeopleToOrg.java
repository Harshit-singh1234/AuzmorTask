package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.PublicKey;
import java.util.List;

public class InvitePeopleToOrg extends HomePage {

     @FindBy(xpath="//input[@placeholder='Full Name']")
        WebElement txt_name;
     @FindBy(xpath = "//*[@data-testid='invite-people-role-dropdown']")
    List<WebElement> dd_role;

     @FindBy(xpath = "//input[@placeholder='name@example.com']")
    WebElement txt_mail;

     @FindBy(xpath = "//input[@placeholder='Search here...']")
      List<WebElement>  dd_rolemanager;

     @FindBy(xpath = "//*[@data-testid='icon']")
     WebElement click_downarrow;

     public InvitePeopleToOrg()
     {
         PageFactory.initElements(driver,this );
     }

    public  void Filldetails()
    {
        txt_name.sendKeys("poojitha Bonthu");
        txt_mail.sendKeys("poojitha.bonthu@atc.xyz");
        WebElement w= (WebElement) dd_rolemanager;
        Select dropdown=new Select(w);
        dropdown.selectByIndex(2);


    }

}

