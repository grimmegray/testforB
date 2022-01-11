package page;

import static com.codeborne.selenide.Selenide.$x;

public class OpenTheRegisterPage {


    private static final String login = "//input[@id='login']";
    private static final String password = "//input[@id='password']";
    private static final String burgerMenu = "//span[@class='icn-middle-logo']";
    private static final String personalArea = "//span[text()='Личный кабинет подрядчика']";
    private static final String registerBlock = "//div[text()='Реестр документов ПСД']";

    public void getLoginAndPasswordStep() {
        $x(login).setValue("test_podr");
        $x(password).setValue("test_podr123").pressEnter();
    }
    public void clickBurgerMenuAndPersonalAreaStep() {
        $x(burgerMenu).click();
        $x(personalArea).click();
    }
    public void clickResisterBlockStep() {
        $x(registerBlock).click();
    }



}
