package dataHeroes;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.WaitUntil;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AuthorityTest {
    @BeforeEach
    void setup () {
                open("https://app.dataheroes.pro/landing");
    }
    @Test
    void LoginWithValidData(){
        $(By.xpath("//*[@id=\"app\"]/div/header/div/button/span")).click();
        switchTo().window(1);
        $(By.name("username")).sendKeys("kaigtest@gmail.com");
        $(By.name("password")).sendKeys("per11TEST!");
        $(By.name("action")).click();
        switchTo().window(0);
        $(byText("Ваши проекты")).shouldBe(Condition.visible);



    }
}
