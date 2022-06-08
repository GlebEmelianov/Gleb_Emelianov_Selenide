package selenide;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {

    @Test
    public void selenideMainPageButtonTest() {

        open("https://litecart.stqa.ru/en/");
        $("li[class='general-0']>a").click();
        Assert.assertEquals(title(), "Online Store | My Store1", "You are not at homepage");

        Configuration.holdBrowserOpen = true;

    }

    @Test
    public void selenideNamelessButtonTest() {

        open("https://litecart.stqa.ru/en/");
        $(By.xpath("//nav[@id='site-menu']/ul/li[@class='category-3']")).click();
        Assert.assertEquals(title(), "My Store1", "You are not at blank Rubber Ducks Page");

        Configuration.holdBrowserOpen = true;
    }

    @Test
    public void selenideRubberDucksButtonTest() {

        open("https://litecart.stqa.ru/en/");
        $("li[class='category-1']").click();
        Assert.assertEquals(title(), "Rubber Ducks | My Store1", "You are not at Rubber Ducks page");

        Configuration.holdBrowserOpen = true;
    }

    @Test
    public void selenideDeliveryInformationButtonTest() {

        open("https://litecart.stqa.ru/en/");
        $(By.xpath("//nav[@id='site-menu']/ul/li[@class='page-2']")).click();
        Assert.assertEquals(title(), "Delivery Information | My Store1", "You are not at Delivery Information page");

        Configuration.holdBrowserOpen = true;
    }

    @Test
    public void selenideTermsConditionsButtonTest() {

        open("https://litecart.stqa.ru/en/");
        $("li.page-4").click();
        Assert.assertEquals(title(), "Terms & Conditions | My Store1", "You are not at Terms & Conditions page");

        Configuration.holdBrowserOpen = true;
    }

    @Test
    public void selenideDiscountButtonTest() {

        open("https://litecart.stqa.ru/en/");
        $("li.page-5").click();
        Assert.assertEquals(title(), "4 | My Store1", "You are not at Discount page");

        Configuration.holdBrowserOpen = true;
    }


}
