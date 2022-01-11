package page;

import com.codeborne.selenide.ElementsCollection;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class AddActPage {

    private static final String anchor = "//div[text()='31-000044-15']";
    private static final String add = "//div[@id='b4addbutton-1141']";
    private static final String actIRD = "//span[@id='menuitem-1145-textEl']";
    private static final String magnifierALl = "//div[@class='x-trigger-index-0 x-form-trigger x-form-search-trigger x-unselectable']";
    private static final String id = "//div[@class='x-grid-row-checker']";
    private static final String acceptButton = "//div[@class='x-btn x-btn-default-toolbar-small x-icon-text-left x-btn-icon-text-left x-btn-default-toolbar-small-icon-text-left']";
    private static final String date = "//div[@class='x-trigger-index-0 x-form-trigger x-form-date-trigger x-form-trigger-last x-unselectable']";
    private static final String today = "//div[@class='x-btn x-btn-default-small x-noicon x-btn-noicon x-btn-default-small-noicon']";
    private static final String save = "//div[@class='x-toolbar x-docked x-toolbar-default x-docked-top x-toolbar-docked-top x-toolbar-default-docked-top x-box-layout-ct']//div[@class='x-btn x-btn-default-toolbar-small x-icon-text-left x-btn-icon-text-left x-btn-default-toolbar-small-icon-text-left']";

    ElementsCollection magnifier = $$x(magnifierALl);
    ElementsCollection idCollection = $$x(id);
    ElementsCollection acceptButtonCollection = $$x(acceptButton);
    ElementsCollection dateCollection = $$x(date);
    ElementsCollection todayCollection = $$x(today);
    //ElementsCollection saveCollection = $$x(save);

    public void clickAddAndActIRDStep() {
        $x(add).click();
        $x(actIRD).shouldBe(visible, Duration.ofMinutes(2)).click();
    }

    public void clickMagnifierStep() {
        magnifier.get(8).click();
    }

    public void getObjectStep() {
        idCollection.get(2).click();
        acceptButtonCollection.get(5).click();
    }

    public void getContractStep() {
        magnifier.get(9).click();
        idCollection.get(0).click();
        acceptButtonCollection.get(5).click();
    }

    public void createActStep() {
        acceptButtonCollection.get(3).click();
        dateCollection.get(8).click();
        todayCollection.get(1).click();
       // saveCollection.get(0).click();
        //acceptButtonCollection.get(6).click();
    }

    public void deleteStep() {
      //  buttonsCollection.get(3).click();
    }
}
