package demoqa.com;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutoTestDemoqa {

    @BeforeAll
    static void BeforeAll() {
        Configuration.holdBrowserOpen=true; // после завершения теста браузер не закроется
        Configuration.browserSize="1920x1080"; // открытие браузера на весь экран
        open("https://demoqa.com/text-box");
    }

    @Test
    void CheckFormTest() {
        $("[id=userName]").setValue("Novruz Salakhov"); // вместо [id...] можно использовать #
        $("#userEmail").setValue("salakhov-novruz@mail.ru");
        $("#currentAddress").setValue("Moscow, Arbat street 15");
        $("[id=permanentAddress]").setValue("Berlin, Bayern Ave 33");
        $("#submit").click();

        $("#output #name").shouldHave(text("Novruz Salakhov"));
        $("#output #email").shouldHave(text("salakhov-novruz@mail.ru"));
        $("#output #currentAddress").shouldHave(text("Moscow, Arbat street 15"));
        $("#output #permanentAddress").shouldHave(text("Berlin, Bayern Ave 33"));

    }



}


