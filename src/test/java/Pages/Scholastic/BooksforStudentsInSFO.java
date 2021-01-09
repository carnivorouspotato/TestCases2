package Pages.Scholastic;
import Pages.BasePage;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class BooksforStudentsInSFO extends BasePage {

    /**Locators to sign in*/
    By triggerForSignInFrame = By.xpath("//a[@class='signin pureguest dialog-close disable-autoplay']");
    By inputForEmailAccount = By.id("dwfrm_login_username");
    By inputForPassword = By.id("dwfrm_login_password");
    By buttonToSignIntoAccount = By.id("loginModalBtn");
    /***/

    /**Elements to use for interacting with mainpage dropdown*/
    By clickableElementToRemoveDropDownScreen = By.xpath("//span[@class='notification-chevron fa fa-chevron-up']");
    /***/


    /**Elements to close Book club for Parents*/
    By openShopAsParentiFrame =  By.id("login-trasform-model");
    By closeShopAsParentiFrame = By.xpath("//a[@class='cancel-button']");
    /***/

    /**-Locators to start an order for students*/
    By enterOrdersFromLandingPage = By.xpath("//body/div[@id='wrapper']/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]");
    By studentFlyerSelect = By.xpath("//body/div[@id='wrapper']/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");
    By studentName = By.id("student-name");
    By inputItemNumber = By.id("item-number");
    By addByItemNumber = By.id("btn-add");
    By listOfItemNumbersPrint = By.xpath("//tbody//td[@class=' itemNum details-control']");
    /***/
    /**Array List for item numbers*/
     public static List<String> listOfItemNumbers = new ArrayList<String>();

     /***/

     /**Locators for if statment
     By itemNumberForQty = By.xpath("//tr[@class='odd']//td[@class=' itemNum details-control']");
     By qtyBoxOdd = By.xpath("//tr[@class='odd']//input[@type='text']");
     By qtyBoxEven= By.xpath("//tr[@class='even']//input[@type='text']");
    //tr[@class='odd']//input[@class='input-qty numericenteronly']
      */

     /**Getting text for verification*/
     By harryAmorDeCachorritoStudentName = By.xpath("//tbody/tr[1]/td[2]");
     By harryAdoptANarwhalStudentName = By.xpath("//tbody/tr[2]/td[2]");
     By harryACausaDelConejoStudentName = By.xpath("//tbody/tr[3]/td[2]");
     /***/

     /**Locators to set quantity and review cart*/
     By qtyBoxForAmorDeCachorrito = By.xpath("//tbody/tr[1]/td[8]/input[1]");
     By qtyBoxForAdoptANarwhal = By.xpath("//tbody/tr[2]/td[8]/input[1]");
     By qtyBoxForACausaDelConejo = By.xpath("//tbody/tr[3]/td[8]/input[1]");
     By reviewCartButton = By.xpath("//button[contains(text(),'Review Cart')]");


    public void signintoTeacherAccount () throws InterruptedException {
        clickThis(triggerForSignInFrame);
        clickThisAndSendKeys(inputForEmailAccount, "billyjohndoe52@gmail.com");
        clickThisAndSendKeys(inputForPassword, "Temp122520!");
        clickThis(buttonToSignIntoAccount);
    }

    public void closeDropDownAtMainScreen (){
        clickThis(clickableElementToRemoveDropDownScreen);
    }

    public void closeShopAsParentMessage (){
        clickThis(openShopAsParentiFrame);
        clickThis(closeShopAsParentiFrame);
    }

    public void startNewOrder () throws InterruptedException {
        pauseExplicit(enterOrdersFromLandingPage);
       hoverOverElement(enterOrdersFromLandingPage);
       clickThis(studentFlyerSelect);
       clickThisAndSendKeys(studentName, "Harry");
       clickThis(addByItemNumber);
            listOfItemNumbers.add("1R5");
            listOfItemNumbers.add("2R5");
            listOfItemNumbers.add("3R5");
            /****************************/
       for (int i = 0 ; i < 3  ; i++){
           clickThis(inputItemNumber);
           type(inputItemNumber, listOfItemNumbers.get(i));
           pauseExplicit(addByItemNumber);
           clickThis(addByItemNumber);
       }

       forInputVerification(harryAmorDeCachorritoStudentName, "Harry");




    }

    public void settingQTyForBooks () throws InterruptedException {
    clearTextSendKeys(qtyBoxForAmorDeCachorrito, "2");
    clearTextSendKeys(qtyBoxForAdoptANarwhal, "4");
    clearTextSendKeys(qtyBoxForACausaDelConejo, "1");
        clickThis(reviewCartButton);
        Thread.sleep(10000);
    }


}

