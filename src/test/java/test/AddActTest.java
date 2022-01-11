package test;

import org.junit.jupiter.api.Test;
import page.AddActPage;
import page.OpenTheRegisterPage;

import static com.codeborne.selenide.Selenide.open;

public class AddActTest extends BaseTest{
    OpenTheRegisterPage openTheRegisterPage = new OpenTheRegisterPage();
    AddActPage addActPage = new AddActPage();
    @Test
    public void main(){
        open("https://rskr-repair.tech.mos.ru/moscow_test/");
        openTheRegisterPage.getLoginAndPasswordStep();
        openTheRegisterPage.clickBurgerMenuAndPersonalAreaStep();
        openTheRegisterPage.clickResisterBlockStep();
        addActPage.clickAddAndActIRDStep();
        addActPage.clickMagnifierStep();
        addActPage.getObjectStep();
        addActPage.getContractStep();
        addActPage.createActStep();
        addActPage.deleteStep();


    }
}
