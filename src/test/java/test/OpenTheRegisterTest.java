package test;

import org.junit.jupiter.api.Test;
import page.OpenTheRegisterPage;

import static com.codeborne.selenide.Selenide.open;

public class OpenTheRegisterTest extends BaseTest{
    OpenTheRegisterPage openTheRegisterPage = new OpenTheRegisterPage();
    @Test
    public void main()  {
        open("https://rskr-repair.tech.mos.ru/moscow_test/");
        openTheRegisterPage.getLoginAndPasswordStep();
        openTheRegisterPage.clickBurgerMenuAndPersonalAreaStep();
        openTheRegisterPage.clickResisterBlockStep();
    }

}
