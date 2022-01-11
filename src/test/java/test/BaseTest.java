package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    @BeforeEach
    public void option() {
        Configuration.timeout = 5000;
    }
}
